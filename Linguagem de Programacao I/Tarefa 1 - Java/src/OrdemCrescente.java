//Exercicio 13

import java.util.Scanner;

public class OrdemCrescente {
    //Atributos:
    float n1, n2;

    //Metodo

    public void Verificar() {

        if (n1 == n2) {
            System.out.println("Você digitou números repetidos, tente novamente: ");
        } else if (n1 > n2) {
            System.out.println(n2);System.out.println(n1);
        } else {
            System.out.println(n1);System.out.println(n2);
        }
    }

    /*Instaciado o objeto numero e incluido o algoritmo do if para verificar a igualdade de n1 e n2 em conjunto de do-while
    para criar um loop de repetição até serem digitados numeros diferentes. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OrdemCrescente numero = new OrdemCrescente();

        if (numero.n1 == numero.n2) {
            do {
                System.out.println("Digite um número: ");
                numero.n1 = scan.nextFloat();
                System.out.println("Digite outro número: ");
                numero.n2 = scan.nextFloat();
                System.out.println("Os números em ordem crescente são correspondidos da seguinte forma: ");
                numero.Verificar();
            } while (numero.n1 == numero.n2);
            scan.close();
        }
    }
}
