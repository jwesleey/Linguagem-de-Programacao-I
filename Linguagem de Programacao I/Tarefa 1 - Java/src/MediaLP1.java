//Exercicio 17

import java.util.Scanner;

public class MediaLP1 {
    double p1, e1, e2, api, sub, x, media;

    public void CalcMedia() {
        media = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4)
                * 0.5 + (Math.max(((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9), 0) / ((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9))
                * (api * 0.5) + x + (sub * 0.2);

        /* media = (6*0.6+((6+6)/2)*0.4)
         *0.5+(Math.max(((6*0.6+((6+6)/2)*0.4)-5.9),0)/((6*0.6+((6+6)/2)*0.4)-5.9))
         *(7*0.5)+1+(0*0.2);
        Teste para verifica nota, seguinte os calculos acima o valor da média é 7.5
        p1, e1, e2 = 6
        * api = 7, x = 1, sub = 0*/

        System.out.println("A média final do aluno é: " + media);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MediaLP1 aluno = new MediaLP1();

        System.out.println("Informe a nota P1: ");
        aluno.p1 = scan.nextFloat();
        System.out.println("Informe a nota E1: ");
        aluno.e1 = scan.nextFloat();
        System.out.println("Informe a nota E2: ");
        aluno.e2 = scan.nextFloat();
        System.out.println("Informe a nota de API: ");
        aluno.api = scan.nextFloat();
        System.out.println("Informe a nota de SUB: ");
        aluno.sub = scan.nextFloat();
        System.out.println("Informe a nota de Atividades Extras: ");
        aluno.x = scan.nextFloat();
        scan.close();
        aluno.CalcMedia();
    }
}
