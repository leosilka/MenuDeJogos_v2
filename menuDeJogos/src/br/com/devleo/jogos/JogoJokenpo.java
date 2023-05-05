package br.com.devleo.jogos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo extends Usuarios {
    private int contador;
    private int player;
    private int acertos;
    private int erros;
    private int empates;
    private int ia;
    private String resposta = "S";
    private ArrayList<String> jokenpo;
    Random geradorNumero = new Random();
    Scanner leitorJokenpo = new Scanner(System.in);

    public JogoJokenpo(String nome) {
        super(nome);
        this.inicializaJokenpo();
    }

    public void inicializaJokenpo() {
        jokenpo = new ArrayList<String>();
        jokenpo.add("Pedra");
        jokenpo.add("Papel");
        jokenpo.add("Tesoura");
    }

    public void jogoJokenpo() {
        System.out.println(String.format("Bem vindo ao jogo jokenpo %s", getNome()));
        while (resposta.equals("S")) {
            contador++;
            ia = geradorNumero.nextInt(3);
            System.out.println("""
                    Escolha sua opcao:
                    [ 0 ] - PEDRA
                    [ 1 ] - PAPEL
                    [ 2 ] - TESOURA
                    
                    O que ira jogar?
                    """);
            player = leitorJokenpo.nextInt();
            System.out.println(String.format("A IA jogou %s", jokenpo.get(ia)));
            System.out.println(String.format("Voce jogou %s", jokenpo.get(player)));
            leitorJokenpo.nextLine();
            if (ia == 0) {
                if (player == 0) {
                    empates++;
                    System.out.println("Empatamos!");
                } else if (player == 1) {
                    acertos++;
                    System.out.println("Voce Ganhou!");
                } else if (player == 2) {
                    erros++;
                    System.out.println("Voce Perdeu!");
                } else {
                    System.out.println("Jogada Invalida!");
                }
                System.out.printf("Deseja jogar novamente? [S/N] ");
                resposta = leitorJokenpo.nextLine().toUpperCase().strip();
            } else if (ia == 1) {
                if (player == 0) {
                    erros++;
                    System.out.println("Voce Perdeu!");
                } else if (player == 1) {
                    empates++;
                    System.out.println("Empatamos!");
                } else if (player == 2) {
                    acertos++;
                    System.out.println("Voce Ganhou!");
                } else {
                    System.out.println("Jogada Invalida!");
                }
                System.out.printf("Deseja jogar novamente? [S/N] ");
                resposta = leitorJokenpo.nextLine().toUpperCase().strip();
            } else if (ia == 2) {
                if (player == 0) {
                    acertos++;
                    System.out.println("Voce Ganhou!");
                } else if (player == 1) {
                    erros++;
                    System.out.println("Voce Perdeu");
                } else if (player == 2) {
                    empates++;
                    System.out.println("Empatamos!");
                } else {
                    System.out.println("Jogada Invalida!");
                }
                System.out.printf("Deseja jogar novamente? [S/N] ");
                resposta = leitorJokenpo.nextLine().toUpperCase().strip();
            }
        }
        System.out.println(String.format("Voce teve %d acertos, %d empates e %d erros.", acertos, empates, erros));
        System.out.println("Retornando ao menu...");
        TelaInicial.main(new String[]{});
    }
}
