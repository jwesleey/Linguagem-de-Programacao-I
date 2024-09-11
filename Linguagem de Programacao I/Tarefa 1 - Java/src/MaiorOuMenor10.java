// Exercicio 7
import java.util.Scanner;
public class MaiorOuMenor10 {
    float n;

    //Metodo
    public void verificar() {

        if (n == 10) {
            System.out.print("É IGUAL A 10");
        } else if (n > 10) {
            System.out.print("É MAIOR QUE 10");
        } else {
            System.out.print("NÃO É MAIOR QUE 10");
        }
    }

    //Instanciando o objeto número para verificar as restrições
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MaiorOuMenor10 numero = new MaiorOuMenor10();

        System.out.print("Digite um número: ");
        numero.n = scan.nextFloat();
        scan.close();

        numero.verificar();
    }
}