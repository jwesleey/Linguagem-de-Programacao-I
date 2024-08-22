// Exercicio 9
import java.util.Scanner;
public class CompraFruta {
    //Atributos;
    int qtd;
    float custo;

    //Metodo

    public float Culcular() {

        if (qtd < 12) {
            custo = (float) (qtd * 1.30);
        } else {
            custo = (float) (qtd * 1.00);
        }
        return custo;
    }

    //Intanciando o objeto fruta para calcular o custo
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CompraFruta maca = new CompraFruta();

        System.out.print("Quantas maças você deseja comprar? ");
        maca.qtd = scan.nextInt();

        System.out.println("O custo final da compra é R$ " + maca.Culcular());
    }
}