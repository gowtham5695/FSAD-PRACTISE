package com.kl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Skill2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/s52";
        String usr = "root";
        String pwd = "Gowtham@2006";

        try {
            Connection con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Connection Established");

            Statement st = con.createStatement();

           
            String deptQuery =
                    "CREATE TABLE IF NOT EXISTS Department (" +
                    "dept_id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "dept_name VARCHAR(50)" +
                    ")";

            
            String empQuery =
                    "CREATE TABLE IF NOT EXISTS Employee (" +
                    "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "emp_name VARCHAR(50), " +
                    "salary DOUBLE, " +
                    "dept_id INT, " +
                    "FOREIGN KEY (dept_id) REFERENCES Department(dept_id)" +
                    ")";

            st.execute(deptQuery);
            st.execute(empQuery);

            System.out.println("Tables Created Successfully!");

           
            String deptInsert =
                    "INSERT INTO Department (dept_name) VALUES " +
                    "('HR'), ('Finance'), ('IT'), ('Marketing')";

            st.executeUpdate(deptInsert);
            System.out.println("Department Data Inserted!");

            
            String empInsert =
                    "INSERT INTO Employee (emp_name, salary, dept_id) VALUES " +
                    "('Amit', 45000, 1)," +
                    "('Rohit', 55000, 2)," +
                    "('Sneha', 60000, 3)," +
                    "('Priya', 48000, 1)";

            st.executeUpdate(empInsert);
            System.out.println("Employee Data Inserted!");

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}