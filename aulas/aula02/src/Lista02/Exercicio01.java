package Lista02;

import java.util.Scanner;

public class Exercicio01 {
    public static final int QUANTIDADE_PERGUNTAS = 3;
    public static String[] RESPOSTAS = new String[QUANTIDADE_PERGUNTAS];
    public static String[] GABARITO = new String[QUANTIDADE_PERGUNTAS];
    public static Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeDoJogador = receberNome();
        iniciarQuiz(nomeDoJogador);
        perguntarPrimeiraQuestao(nomeDoJogador);
        perguntarSegundaQuestao(nomeDoJogador);
        perguntarTerceiraQuestao(nomeDoJogador);
        avaliarDesempenho(nomeDoJogador);

    }

    public static String formatarNomeJogador(String nomeJogador) {
        if (nomeJogador.isBlank()) {
            return "NPC";
        }
        //Código para formatar a primeira letra do nome.
        String[] nomeCompleto = nomeJogador.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf((primeiroNome.charAt(0)));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() +
                primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static String receberNome() {
        System.out.println("Seja bem vindo, digite seu nome para " +
                "darmos inicio a aventura. ");
        return formatarNomeJogador(ENTRADA.nextLine());
        //Pegando a função de cima para executar no main.
    }

    public static void iniciarQuiz(String nomeJogador) {
        System.out.printf(
                """
                        %s vamos iniciar o Quiz?
                        Para que isso aconteça, aperte o ENTER.
                        """, nomeJogador);
        ENTRADA.nextLine();
    }

    public static void perguntarPrimeiraQuestao(String nomeJogador) {
        String resposta = "";
        do {
            System.out.println(
                    """
                            1 - Quem foi o melhor jogador de todos os tempos?
                                                
                            A - Pelé
                            B - Ronaldo
                            C - Messi
                            """
            );
            resposta = ENTRADA.nextLine();
        } while (!checarResposta(resposta));
        GABARITO[0] = "A";
        RESPOSTAS[0] = resposta;
    }

    public static void perguntarSegundaQuestao(String nomeJogador) {
        String resposta = "";
        do {
            System.out.println(
                    """
                            2 - Qual seleção ganhou a Copa do Mundo de 2022?
                                                
                            A - Argentina
                            B - França
                            C - Alemanha
                            """
            );
            resposta = ENTRADA.nextLine();
        } while (!checarResposta(resposta));
        GABARITO[1] = "A";
        RESPOSTAS[1] = resposta;
    }

    public static void perguntarTerceiraQuestao(String nomeJogador) {
        String resposta = "";
        do {
            System.out.println(
                    """
                            3 - Quem foi o melhor jogador da Copa do mundo 
                            de 2022?
                                                
                            A - Cristiano Ronaldo
                            B - Mbappé
                            C - Messi
                            """
            );
            resposta = ENTRADA.nextLine();
        } while (!checarResposta(resposta));
        GABARITO[2] = "C";
        RESPOSTAS[2] = resposta;
    }

    public static boolean checarResposta(String resposta) {
        if (resposta.isBlank() || !resposta.equalsIgnoreCase("A") &&
                !resposta.equalsIgnoreCase("B") &&
                !resposta.equalsIgnoreCase("C")) {
            System.out.println("""
                    Resposta inválida.
                    Perguntaremos novamente.
                    """);
            return false;
        }
        return true;
    }

    public static void avaliarDesempenho(String nomeJogador){
        System.out.printf("""
                Ok %s agora vamos avaliar o seu desempenho, ok?
                """, nomeJogador );
        for (int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
            System.out.printf("""
                    %s - %s 
                    """, (i + 1),  RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU");
        }
    }


}
