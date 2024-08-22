//Exercicio 14

import java.util.Scanner;

public class JogoXadrez {

    //Atributos;
    int inicio, fim, tempo;

    //Metodo:

    public int ContHoras() {
        if (inicio > 23 || fim > 24) {
            System.out.println("Erro, tente novamente, digite apenas valores inteiros, menores que 24.");
        } else if (fim >= inicio) {
            tempo = fim - inicio;
        } else {
            tempo = (24 - inicio) + fim;
        }
        return tempo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoXadrez partida = new JogoXadrez();

        System.out.println("* Atenção - Informe as horas em valores inteiros de 0 a 23.");
        System.out.println("Informe a hora de início da partida: ");
        partida.inicio = scan.nextInt();
        System.out.println("Informe a hora do fim da partida: ");
        partida.fim = scan.nextInt();
        scan.close();
        System.out.println("A duração da partida de Xadrez foi de: " + partida.ContHoras() + " horas.");
    }
}