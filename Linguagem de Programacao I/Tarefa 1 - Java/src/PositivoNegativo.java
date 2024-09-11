//Exercicio 8
import java.util.Scanner;
public class PositivoNegativo {
    //Atributo
    float n;

    public void verificar() {

        if (n >= 0){
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        PositivoNegativo numero = new PositivoNegativo();

        System.out.print("Digite um número: ");
        numero.n = scan.nextFloat();
        scan.close();
        numero.verificar();
    }
}