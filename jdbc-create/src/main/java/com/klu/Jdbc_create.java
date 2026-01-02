package com.klu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_create {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/fsads52";
        String usr = "root";
        String pwd = "Gowtham@2006";

        try {
            Connection con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Connection established");

            String query = "CREATE TABLE IF NOT EXISTS Student ("
                         + "id INT PRIMARY KEY AUTO_INCREMENT, "
                         + "name VARCHAR(20)"
                         + ")";

            Statement st = con.createStatement();
            st.execute(query);

            System.out.println("Table Created");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
