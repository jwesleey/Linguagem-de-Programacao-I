public class Pessoas {
    //Atributos

    public String nome;
    public int idade;
    public float altura;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
//Métodos

    public void interagir(){
        System.out.println("Olá, tudo bem com você?\nÉ um prazer interagir com você.");
    }

    public void sorrir(){
        System.out.println("\uD83D\uDE04");
    }

    public void comemorar(){
        System.out.println("Uhuul!! nota 10 pra essa tarefa.");
    }
}
