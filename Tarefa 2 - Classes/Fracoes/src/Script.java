import java.util.Scanner;

public class Script {

    public void script(NumDem number) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da fração considerando o primeiro valor numerador e o segundo denominador (N/D)\n1 - Numerador: ");
        number.setNum1(sc.nextInt());

        System.out.println("1 - Denominador: ");
        number.setDem1(sc.nextInt());

        System.out.println("2 - Numerador: ");
        number.setNum2(sc.nextInt());

        System.out.println("2 - Denominador: ");
        number.setDem2(sc.nextInt());
        sc.close();
    }
}

