package org.example.interfaceclasses;

public class Guitarras {
    //Atributos
    public String marca;
    public int voltagem, qtdcordas;

    //Métodos

    public String afinar() {
        return"Afinando as cordas da guitarra";
    }

    public String tocar() {
        return"\uD83C\uDFB6";
    }

    public String verificarNota() {
        return"G#";
    }
}
