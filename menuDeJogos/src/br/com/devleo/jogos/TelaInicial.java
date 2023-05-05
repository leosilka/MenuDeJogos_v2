package br.com.devleo.jogos;

import br.com.devleo.jogos.JogoDeAdivinhacao;
import br.com.devleo.jogos.Usuarios;

import java.util.Scanner;

public class TelaInicial {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        int selecionaMenu;

        Usuarios inicioJogo = new Usuarios();
            inicioJogo.menuIntroducao();
            System.out.printf("Informe seu nome: ");
            inicioJogo.setNome(leitor.nextLine());
            System.out.printf("Informe a sua idade: ");
            inicioJogo.setIdade(leitor.nextInt());
            leitor.nextLine();
            System.out.println(String.format("Seja bem vindo(a) %s", inicioJogo.getNome()));

            while (continuar) {
                System.out.printf("""
                     -------------------------------------
                                JOGOS EM JAVA
                     -------------------------------------
                    | [1] Jogo de Adivinhacao             |
                    | [2] Jokenpo                         |
                    | [9] Sair                            |
                     _____________________________________
                    
                    Selecione uma das opcoes acima:  
                    """);

                selecionaMenu = leitor.nextInt();
                leitor.nextLine();

                switch (selecionaMenu) {
                    case 1:
                        JogoDeAdivinhacao inicioAdivinhacao = new JogoDeAdivinhacao(inicioJogo.getNome());
                        inicioAdivinhacao.jogoAdivinhacao();
                        break;

                    case 2:
                        JogoJokenpo inicioJokenpo = new JogoJokenpo(inicioJogo.getNome());
                        inicioJokenpo.jogoJokenpo();
                        break;

                    case 9:
                        System.out.println("Obrigado por acessar nosso jogo!");
                        continuar = false;
                        return;

                    default:
                        System.out.println("Opcao selecionada e invalida! Tente novamente!");
                        break;
                }
            }
        }
}