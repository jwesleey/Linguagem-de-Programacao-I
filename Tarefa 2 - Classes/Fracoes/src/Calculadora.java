import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Frações");
        System.out.println("Informe qual operações você deseja realizar: \n1 - Adição.\n2 - Subtração.\n3 - Multiplicação.\n4 - Divisão.");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                Somar somar = new Somar();
                somar.calcSoma();
                break;
            case 2:
                Subtrair subtrair = new Subtrair();
                subtrair.calcSubtrair();
                break;

            case 3:
                Mult mult = new Mult();
                mult.calcMult();
                break;

            case 4:
                Divisao divisao = new Divisao();
                divisao.calcDiv();
                break;
        }
    }
}
