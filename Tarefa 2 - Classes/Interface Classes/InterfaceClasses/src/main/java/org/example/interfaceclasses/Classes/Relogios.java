package org.example.interfaceclasses.Classes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Relogios {
    // Atributos

    public String marca, cor, display;

    //Métodos
    public String verificarHora() {
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "Hora atual: " + hora.format(LocalTime.now());
    }

    public String ajustarHora() {
        return "Tem certeza que deseja ajustar a hora? \nVerique as horas... novamente.";
    }

    public String tirar() {
        return "Tirando o relógio";
    }
}
