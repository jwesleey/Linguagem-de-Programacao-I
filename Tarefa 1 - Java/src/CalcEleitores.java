// Exercicio 2
import java.util.Scanner;
public class CalcEleitores {

    // Atributos:

    int totalEleitores;
    int vBrancos;
    int vNulos;
    int vValidos;

    // Metodo de cálculo:
    public float percentBrancos() {
        return (float) vBrancos / totalEleitores * 100;
    }

    public float percentNulos() {
        return (float) vNulos / totalEleitores * 100;
    }

    public float percentValidos() {
        return (float) vValidos / totalEleitores * 100;
    }

    // Instaciado o objeto municipio para atribuir o valores da classe.
    public static void main(String[] args) {

        CalcEleitores municipio = new CalcEleitores();
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número total de eleitores do município: ");
        municipio.totalEleitores = scan.nextInt();
        System.out.print("Informe o número de votos válidos: ");
        municipio.vValidos = scan.nextInt();
        System.out.print("Informe o número de votos em branco: ");
        municipio.vBrancos = scan.nextInt();
        System.out.print("Informe o número de votos nulos: ");
        municipio.vNulos = scan.nextInt();
        scan.close();

        System.out.println("\nO município possui o total de " + municipio.totalEleitores + " eleitores. \nSegue abaixo o percentual de tipos de votos: ");
        System.out.print("\nVotos válidos: " + municipio.percentValidos() + "%.");
        System.out.print("\nVotos em branco: " + municipio.percentBrancos() + "%.");
        System.out.print("\nVotos nulos: " + municipio.percentNulos() + "%.");
    }
}