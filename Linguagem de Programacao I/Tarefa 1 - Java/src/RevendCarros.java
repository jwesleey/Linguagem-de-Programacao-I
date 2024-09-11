// Exercicio 5
import java.util.Scanner;
public class RevendCarros {

    //Atributos:
    float salariofixo;
    float comissao;
    float vendas;
    int carrosvendidos;

    //Metodo de cálculo
    public float salarioFinal(){
        return (float) (salariofixo+ (comissao*carrosvendidos) + (vendas*0.05));
    }

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        RevendCarros vendedor = new RevendCarros();

        System.out.print("Informe o salário fixo do vendedor: ");
        vendedor.salariofixo = scan.nextFloat();
        System.out.print("Informe o valor da comissão fixa para cada carro vendido: ");
        vendedor.comissao = scan.nextFloat();
        System.out.print("Informe a quantidade de carros vendidos: ");
        vendedor.carrosvendidos = scan.nextInt();
        System.out.print("Informe o valor total das vendas do carros: ");
        vendedor.vendas = scan.nextFloat();
        scan.close();

        System.out.println("O salário final do vendedor é R$ " + vendedor.salarioFinal());
    }
}
