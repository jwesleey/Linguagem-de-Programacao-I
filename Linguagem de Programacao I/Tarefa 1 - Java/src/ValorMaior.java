//Exercicio 12

import java.util.Scanner;

public class ValorMaior {
    //Atributos
    float n1, n2;

    //Metodo

    public void Verificar() {

        if (n1 > n2) {
            System.out.println("O maior valor digitado corresponde a: " + n1);
        } else {
            System.out.println("O maior valor digitado corresponde a: " + n2);
        }
    }

    /*Instaciado o objeto numero e incluido o algoritmo do if para verificar a igualdade de n1 e n2 em conjunto de do-while
    para criar um loop de repetição até serem digitados numeros diferentes. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ValorMaior numero = new ValorMaior();
        numero.n1 = 0;
        numero.n2 = 0;
        do {
            System.out.println("Você digitou números repetidos, tente novamente: ");
            System.out.println("Digite um número: ");
            numero.n1 = scan.nextFloat();
            System.out.println("Digite outro número: ");
            numero.n2 = scan.nextFloat();
        } while (numero.n1 == numero.n2);
        numero.Verificar();
        scan.close();
    }
}
