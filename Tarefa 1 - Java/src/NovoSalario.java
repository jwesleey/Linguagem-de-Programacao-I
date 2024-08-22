// Exercicio 3
import java.util.Scanner;
public class NovoSalario {
    //Atributos
    float salario;
    float reajuste;

    //Metodo

    public float Calcular() {
        return (salario * (reajuste/100)) + salario;
    }

    // Instanciando o objeto funcionario para atribuir o novo salario

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        NovoSalario funcionario = new NovoSalario();

        System.out.println("Informe o salário do funcionario: ");
        funcionario.salario = scan.nextFloat();
        System.out.println("Informe o percetual de reajuste: ");
        funcionario.reajuste = scan.nextFloat();
        scan.close();

        System.out.println("O novo salário do funcionário corresponde a R$ " + funcionario.Calcular());
    }
}