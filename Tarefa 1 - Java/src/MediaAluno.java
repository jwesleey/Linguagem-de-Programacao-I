//Exercicio 10

import java.util.Scanner;

public class MediaAluno {
    //Atributos:
    float nota1, nota2, soma, media;

    /*Metodo, foi criado separadamente 3 metodos, 1 para Somar n1+n2, outro para calcular a média e por fim verificar o resultado.
    foi feito dessa forma para chamar individualmente os valores de cálculo no final do algoritmo */

    public float Somar() {
        soma = nota1 + nota2;
        return soma;
    }

    public float Calc() {
        media = (soma / 2);
        return media;
    }

    public void Result() {
        if (media >= 6) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MediaAluno aluno = new MediaAluno();

        System.out.println("Informe o valor da avaliação 1: ");
        aluno.nota1 = scan.nextFloat();
        System.out.println("Informe o valor da avaliação 2: ");
        aluno.nota2 = scan.nextFloat();

        System.out.println("Cálculo da média correspondente: \n " + aluno.nota1 + " + " + aluno.nota2 + " = " + aluno.Somar());
        System.out.println(aluno.Somar() + " / 2" + " = " + aluno.Calc());
        scan.close();
        aluno.Result();
    }
}