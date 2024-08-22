//Exercicio 11
import java.util.Scanner;
public class AnoEleitor {

    //Atributos
    int ano, nascimento, result;

    //Metodo

    public void Verificar(){

        result = ano - nascimento;
        if (result >= 16 && result < 18){
            System.out.println("Você poderá votar, porém, não é obrigatório.");
        } else if (result >= 18) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Você não poderá votar.");
        }
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        AnoEleitor eleitor = new AnoEleitor();

        System.out.println("Informe o ano atual: ");
        eleitor.ano = scan.nextInt();
        System.out.println("Informe o ano de nascimento: ");
        eleitor.nascimento = scan.nextInt();
        scan.close();

        eleitor.Verificar();
    }
}
