package org.jw.e2_classesbd.ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    static String url = "jdbc:postgresql://localhost:5432/lp1";
    static String usuario = "userlp1";
    static String senha = "123";

    public static Connection conectar() throws SQLException {

        try {
            Connection con = DriverManager.getConnection(url, usuario, senha);
            if (con != null) {
                System.out.println("Conexão realizada com sucesso!");
            }
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
