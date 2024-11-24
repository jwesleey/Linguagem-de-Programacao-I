package org.jw.e2_classesbd.ConexaoBD;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;


public class CRUD {

    //******************** Métodos para inserir no BD - Início**********************
    public static void perguntar(String pergunta) throws SQLException {
        String query = "insert into perguntas (pergunta) values (?)";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, pergunta);
            ps.executeUpdate();
        }
    }

    public static void anotar(String pergunta) throws SQLException {
        String query = "insert into anotacao (notas) values (?)";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, pergunta);
            ps.executeUpdate();
        }
    }

    //******************** Métodos para inserir no BD - Fim**********************

    //******************** Métodos para consultar no BD - Início**********************
    public static ObservableList<String> carregarP() throws SQLException {
        ObservableList<String> lista = FXCollections.observableArrayList();
        String query = "select pergunta from perguntas";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("pergunta"));
            }
        }
        return lista;
    }

    public static ObservableList<String> carregarA() throws SQLException {
        ObservableList<String> lista = FXCollections.observableArrayList();
        String query = "select notas from anotacao";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("notas"));
            }
        }
        return lista;
    }

    //******************** Métodos para consultar no BD - Fim**********************

    //******************** Métodos para Excluir no BD - Início**********************

    public static void deleteP(String pergunta) throws SQLException {
        String query = "delete from perguntas where pergunta = ?";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, pergunta);
            ps.executeUpdate();
        }
    }

    public static void deleteA(String notas) throws SQLException {
        String query = "delete from anotacao where notas = ?";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, notas);
            ps.executeUpdate();
        }
    }
    //******************** Métodos para Excluir no BD - Fim**********************

    //******************** Métodos para Editar no BD - Início**********************

    public static void EditP(String edited, String pergunta) throws SQLException {
        String query = "update perguntas set pergunta = ? where pergunta = ?";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, edited);
            ps.setString(2, pergunta);
            ps.executeUpdate();
        }
    }

    public static void EditN(String edited, String notas) throws SQLException {
        String query = "update anotacao set notas = ? where notas = ?";
        try (Connection con = ConexaoBD.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, edited);
            ps.setString(2, notas);
            ps.executeUpdate();
        }
    }
    //******************** Métodos para Editar no BD - Fim**********************
}
