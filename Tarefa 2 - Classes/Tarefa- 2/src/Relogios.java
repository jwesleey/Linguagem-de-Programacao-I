import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Relogios {
    // Atributos

    public String marca, cor, display;

    //Métodos
    public void verificarHora() {
      DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora atual: " + hora.format(LocalTime.now()));
    }

    public void ajustarHora() {
        System.out.println("Tem certeza que deseja ajustar a hora? \nVerique as horas... novamente.");
    }

    public void tirar(){
        System.out.println("Tirando o relógio");
    }
}
