package org.jw.e2_classesbd.Classes;

public class Alunos {
    //Atributos
    public String perguntar, escrever;
    //Métodos

    public String getPerguntar() {
        return perguntar;
    }

    public void setPerguntar(String perguntar) {
        this.perguntar = perguntar;
    }

    public String getEscrever() {
        return escrever;
    }

    public void setEscrever(String escrever) {
        this.escrever = escrever;
    }


    public String abrircaderno() {
        return "Abrindo caderno na matéria: Linguagem de Programação I";
    }

}
