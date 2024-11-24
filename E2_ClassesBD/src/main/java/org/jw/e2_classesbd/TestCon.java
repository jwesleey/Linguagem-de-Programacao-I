package org.jw.e2_classesbd;

import org.jw.e2_classesbd.ConexaoBD.ConexaoBD;

public class TestCon {
    public static void main(String[] args) {
        try {
            ConexaoBD con = new ConexaoBD();
        } catch (Exception e) {
            System.out.println("Erro na conexão!");
            e.printStackTrace();
        }
    }
}