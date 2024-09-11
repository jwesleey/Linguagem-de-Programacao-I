import java.util.Scanner;

public class Menu {
    private int n;
    private int op;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public void escolher() {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma opção para acessar as classes: \n1 - Alunos\n2 - Cães\n3 - Carros\n4 - Celulares\n5 - Computadores\n6 - Guitarras\n7 - Pessoas\n8 - Portas\n9 - Relógios\n10 - Roupas");
            setN(sc.nextInt());
            do {
                switch (getN()) {
                    case 1:
                        Alunos aluno = new Alunos();
                        System.out.println("*Classe Alunos*\nDigite um número para acessar as seguintes ações.\n1 - Perguntar?\n2 - Escrever.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                aluno.perguntar();
                                break;
                            case 2:
                                aluno.escrever();
                                break;
                        }
                        break;

                    case 2:
                        Caes c = new Caes();
                        System.out.println("*Classe Cães*\nDigite um número para acessar as seguintes ações.\n1 - Latir\n2 - Brincar.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                c.latir();
                                break;
                            case 2:
                                c.brincar();
                                break;
                        }
                        break;
                    case 3:
                        Carros carro = new Carros();
                        System.out.println("*Classe Carro*\nDigite um número para acessar as seguintes ações.\n1 - Acelerar\n2 - Reduzir.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                carro.acelerar();
                                break;
                            case 2:
                                carro.reduzir();
                                break;
                        }
                        break;
                    case 4:
                        Celulares celular = new Celulares();
                        System.out.println("*Classe Celular*\nDigite um número para acessar as seguintes ações.\n1 - Ligar\n2 - Desligar.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                celular.ligar();
                                break;
                            case 2:
                                celular.desligar();
                                break;
                        }
                        break;
                    case 5:
                        Computadores computador = new Computadores();
                        System.out.println("Classe Computador*\nDigite um número para acessar as seguintes ações.\n1 - Ligar\n2 - Executar Programa.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                computador.ligar();
                                break;
                            case 2:
                                computador.executarPrograma();
                                break;
                        }
                        break;
                    case 6:
                        Guitarras guitarra = new Guitarras();
                        System.out.println("*Classe Guitarras*\nDigite um número para acessar as seguintes ações.\n1 - Tocar\n2 - Afinar.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                guitarra.tocar();
                                break;
                            case 2:
                                guitarra.afinar();
                                break;
                        }
                        break;
                    case 7:
                        Pessoas p = new Pessoas();
                        System.out.println("*Classe Pessoas*\nDigite um número para acessar as seguintes ações.\n1 - Interagir\n2 - Sorrir.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                p.interagir();
                                break;
                            case 2:
                                p.sorrir();
                                break;
                        }
                        break;
                    case 8:
                        Portas porta = new Portas();
                        System.out.println("*Classe Portas*\nDigite um número para acessar as seguintes ações.\n1 - Fechar\n2 - Abrir.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                porta.fechar();
                                break;
                            case 2:
                                porta.abrir();
                                break;
                        }
                        break;
                    case 9:
                        Relogios relogio = new Relogios();
                        System.out.println("*Classe Relógio*\nDigite um número para acessar as seguintes ações.\n1 - Verificar hora\n2 - Ajustar hora.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                relogio.verificarHora();
                                break;
                            case 2:
                                relogio.ajustarHora();
                                break;
                        }
                        break;
                    case 10:
                        Roupas roupa = new Roupas();
                        System.out.println("*Classe Roupas*\nDigite um número para acessar as seguintes ações.\n1 - Escolher\n2 - Comprar.\n0 - Sair.");
                        setOp(sc.nextInt());
                        switch (getOp()) {
                            case 1:
                                roupa.escolher();
                                break;
                            case 2:
                                roupa.comprar();
                                break;
                        }
                        break;
                }
            } while (getOp() != 0);
        } while (getN() != 0);
    }
}