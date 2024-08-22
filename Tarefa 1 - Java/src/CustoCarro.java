// Exercicio 4
import java.util.Scanner;
public class CustoCarro {

    //Atributos:
    float custoFabrica;
    float custoDistribuidor = 0.28F;
    float impostos = 0.45F;

    //Metodo de cálculo;

    public float CalcularValores() {
        return (custoFabrica + (custoFabrica * custoDistribuidor) + (custoFabrica * impostos));
    }

    // Instanciando o objeto venda para calcular o valor final ao consumidor.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CustoCarro venda = new CustoCarro();

        System.out.print("Informe o custo de fábrica do carro a ser vendido: ");
        venda.custoFabrica = scan.nextFloat();
        scan.close();

        System.out.print("O custo final ao consumidor é de R$ " + venda.CalcularValores());
    }
}
