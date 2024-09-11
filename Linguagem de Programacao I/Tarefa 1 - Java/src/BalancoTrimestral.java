//Exercicio 16
public class BalancoTrimestral {
    //Atributos:
    float jan = 15000F, fev = 23000F, mar = 17000F;
    float soma, media;

    //Metodo - utilizado a propria classe para como metodo para atribuir valores
    public BalancoTrimestral() {
        soma = jan + fev + mar;
        media = soma / 3;
    }

    public static void main(String[] args) {
        BalancoTrimestral empresa = new BalancoTrimestral();
        System.out.println("Despesa total no trimestre R$ " + empresa.soma);
        System.out.println("Média mensal de gastos R$ " + empresa.media);
    }
}