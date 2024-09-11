public class Subtrair {

    public void calcSubtrair() {
        NumDem number = new NumDem();
        Script s = new Script();
        s.script(number);

        number.setNumerador((number.getNum1() * number.getDem2()) - (number.getDem1() * number.getNum2()));
        number.setDenominador(number.getDem1() * number.getDem2());

        if (number.getDenominador() == 0) {
            System.out.println("Denominador não pode ser zero.");
        } else {
            int n1 = number.getNumerador();
            int d1 = number.getDenominador();
            int menor = Math.min(n1, d1);
            int i;
            for (i = menor; i >= 2; i--)
                if ((n1 % i == 0) && (d1 % i == 0)) {
                    n1 /= i;
                    d1 /= i;
                }
           // System.out.println("Resultado da fração: " + number.getNumerador() + "/" + number.getDenominador());
            System.out.println(("Valor simplificado: " + n1 / i + "/" + d1 / i));
        }
    }
}