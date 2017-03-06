package com.danielfireman.courses.map.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Conexao {
 
    public Conexao () {    }
    public static Connection con = null;

    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
            System.out.println("Conectado.");
        } catch(SQLException e) {
              System.out.println(e);
              throw new RuntimeException(e);
          }
    }
}
