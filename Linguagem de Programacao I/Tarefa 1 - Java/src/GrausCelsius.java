// Exercicio 6
import java.util.Scanner;
public class GrausCelsius {

    //Atributos:

    float grausF;
    float grausC;

    //Metodo de calculo:

    public float converter() {
        return grausC = (float) ((grausF - 32) / 1.8);
    }

    // Intanciando o objeto temperatura

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GrausCelsius temperatura = new GrausCelsius();

        System.out.print("Informe a temperatura em Fahrenheit para conventer em Celsius: ");
        temperatura.grausF = scan.nextFloat();
        scan.close();

        System.out.println("A conversão corresponde a: " + temperatura.converter() + "°C");
    }
}
