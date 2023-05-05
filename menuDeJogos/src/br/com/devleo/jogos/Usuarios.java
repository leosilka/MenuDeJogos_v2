package br.com.devleo.jogos;

public class Usuarios {
    private String nome;
    private int idade;

    public Usuarios() {
    }

    public Usuarios(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fichaUsuario() {
        System.out.println("Nome do Jogador: " + getNome());
        System.out.println("Idade do Jogador: " + getIdade());
    }

    public void menuIntroducao() {
        System.out.printf("""
                     ██╗ ██████╗  ██████╗  ██████╗ ███████╗         ██╗ █████╗ ██╗   ██╗ █████╗\s
                     ██║██╔═══██╗██╔════╝ ██╔═══██╗██╔════╝         ██║██╔══██╗██║   ██║██╔══██╗
                     ██║██║   ██║██║  ███╗██║   ██║███████╗         ██║███████║██║   ██║███████║
                ██   ██║██║   ██║██║   ██║██║   ██║╚════██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║
                ╚█████╔╝╚██████╔╝╚██████╔╝╚██████╔╝███████║    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║
                 ╚════╝  ╚═════╝  ╚═════╝  ╚═════╝ ╚══════╝     ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝
                                                                                               \s                                                                                            
                                                                                       
                """);
    }

    public void menuEscolhas(int i) {
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
    }
}
