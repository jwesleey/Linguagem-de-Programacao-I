//Exercicio 15

import java.util.Scanner;

public class HoraExtra {
    //Atributos
    int horasMes = 160;
    int horasT;
    float hExtra = 0.5F, salarioH, salarioT;


    public void CalcHExtras() {
        if (horasT > 160) {
            salarioT = ((horasMes * salarioH) + ((horasT - horasMes) * (salarioH + (salarioH * hExtra))));
            System.out.println("O salario total do funcionário equivale a R$: " + salarioT);
        } else {
            salarioT = horasT * salarioH;
            System.out.println("Não foi feito hora extra.");
            System.out.println("O salario total do funcionário equivale a R$: " + salarioT);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HoraExtra funcionario = new HoraExtra();

        System.out.println("Informe o total de horas trabalhadas no mês: ");
        funcionario.horasT = scan.nextInt();
        System.out.println("Informe o valor do salário/hora: ");
        funcionario.salarioH = scan.nextFloat();
        scan.close();
        funcionario.CalcHExtras();
    }
}
