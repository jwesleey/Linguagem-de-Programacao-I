//Exercicio 1

import java.util.Scanner;

public class CalcIdade {

//Atributos

    int d_idade = 365, d_meses = 30, d = 1;
    int idade, meses, dias;

    //Metodo
    public int calcularDias() {
        return ((d_idade * idade) + (d_meses * meses) + (dias * d));
    }

    // Instanciando o objeto pessoa para caracterizar o individuo a receber o atributos.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalcIdade pessoa = new CalcIdade();
        System.out.print("Idade: ");
        pessoa.idade = sc.nextInt();
        System.out.print("Meses: ");
        pessoa.meses = sc.nextInt();
        System.out.print("Dias: ");
        pessoa.dias = sc.nextInt();
        sc.close();

        System.out.println(pessoa.calcularDias()+" dias de idade.");
    }
}
