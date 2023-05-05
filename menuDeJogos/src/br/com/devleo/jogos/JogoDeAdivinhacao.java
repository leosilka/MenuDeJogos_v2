package br.com.devleo.jogos;

import java.util.Random;
import java.util.Scanner;
import br.com.devleo.jogos.TelaInicial;

public class JogoDeAdivinhacao extends Usuarios {
    private int contador;
    private int escolhaNumero;
    private int acertos;
    private int erros;
    private int ia;
    private String resposta = "S";
    Random geradorNumero = new Random();
    Scanner leitorAdivinhacao = new Scanner(System.in);

    public JogoDeAdivinhacao(String nome) {
        super(nome);
    }

    public void jogoAdivinhacao() {
        System.out.println(String.format("Bem vindo ao jogo de adivinhacao %s", getNome()));
        while (resposta.equals("S")) {
            contador++;
            ia = geradorNumero.nextInt(10);
            System.out.printf("Tente adivinhar o numero que estou pensando entre 0 e 10: ");
            escolhaNumero = leitorAdivinhacao.nextInt();
            leitorAdivinhacao.nextLine();
            if (escolhaNumero == ia) {
                System.out.println("Parabens, voce acertou o numero que eu estava pensando!");
                acertos++;
                System.out.printf("Deseja continuar jogando? [S/N] ");
                resposta = leitorAdivinhacao.nextLine().toUpperCase().strip();
            }
            else if (escolhaNumero != ia) {
                System.out.println(String.format("Infelizmente voce errou o numero que eu estava pensando." +
                        "O numero que pensei foi %d", ia));
                erros++;
                System.out.printf("Deseja continuar jogando? [S/N]");
                resposta = leitorAdivinhacao.nextLine().toUpperCase().strip();
            }
        }
        System.out.println(String.format("Voce jogou %d vezes, teve %d acertos e %d erros.", contador, acertos, erros));
        System.out.println("Retornando ao menu...");
        TelaInicial.main(new String[]{});
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
