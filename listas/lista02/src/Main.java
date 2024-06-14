import java.util.Scanner;

public class Main {
    public static final int QUANTIDADE_PERGUNTAS = 3;
    public static String [] respostaUsuario = new String[QUANTIDADE_PERGUNTAS];
    public static String[] gabarito = new String[QUANTIDADE_PERGUNTAS];
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String nomeJogador = receberNomeFormatado();
        iniciarQuiz(nomeJogador);
        perguntarPrimeiraQuestao(nomeJogador);
        perguntarSegundaQuestao(nomeJogador);
        perguntarTerceiraQuestao(nomeJogador);
        checarRespostasCertasErradas();
        agradecerUsuario(nomeJogador);

    }

    public static String receberNomeFormatado(){
        System.out.println("Olá jogador, tudo bem?\nEspero que sim!\nComece digitando seu nome");
        return(formatadorDeNome(entrada.nextLine()));
    }

    public static String formatadorDeNome(String nome){
        if (nome.isBlank()){
            return "Você não é um player, é um NPC!";
        }

        nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraNome = String.valueOf((primeiroNome.charAt(0)));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static String iniciarQuiz(String nome){
        System.out.printf("""
                
                %s, você está preparado para o Quiz?
                Ele se baseia em uma pergunta com 3 respostas de A, B ou C;
                Vamos começar? Aperte enter. 
                """, nome);
        return entrada.nextLine();

    }

    public static void perguntarPrimeiraQuestao(String nome){
        String resposta = "";
        do{ System.out.println("""
                Qual seleção foi a campeã da copa de 2022?
                A - Argentina
                B - Brasil
                C - França
                """);
            resposta = entrada.nextLine();
        }while(checarEntradaEhInvalida(resposta));

        respostaUsuario[0] = resposta;
        gabarito[0] = "A";
    }

    public static void perguntarSegundaQuestao(String nome){
        String resposta = "";
        do {
            System.out.println("""
                    Quem ganhou a Libertadores em 2019?
                    A - Palmeiras
                    B - River Plate
                    C - Flamengo
                    """);
            resposta = entrada.nextLine();
        }while(checarEntradaEhInvalida(resposta));
        respostaUsuario[1] = resposta;
        gabarito[1] = "C";
    }
    public static void perguntarTerceiraQuestao(String nome){
        String resposta = "";
        do{ System.out.println("""
                Quem ganhou a libertadores 2022?
                A - Palmeiras
                B - River Plate
                C - Flamengo
                """);
            resposta = entrada.nextLine();
        }while(checarEntradaEhInvalida(resposta));

        respostaUsuario[2] = resposta;
        gabarito[2] = "C";
    }

    public static boolean checarEntradaEhInvalida(String resposta){
        if(resposta.isBlank()){
            System.out.println("Entrada valida!");
            return true;
        }else if(!resposta.equals("A") && !resposta.equals("B") && !resposta.equals("C")){
            System.out.println("Entrada inválida");
            return true;
        }
        return false;
    }

    public static void checarRespostasCertasErradas(){
        int acerto = 0;
        int erro = 0;

        System.out.println("Vamos ver se você é bom mesmo de memória!");
        for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++){
            String resposta = respostaUsuario[i].equals(gabarito[i])? "ACERTOU":"ERROU";
            System.out.println(resposta);
            if(resposta.equals("ACERTOU")){
                acerto ++;
            }else{
                erro ++;
            }
        }
        System.out.println("Voce acertou: " + acerto + " perguntas");
        if(acerto > erro){
            System.out.println("Parabens, você é muito bom!");
        }else{
            System.out.println("Não é sempre que se acerta, não desista!");
        }

    }

    public static void agradecerUsuario( String nome){
        System.out.printf("""
                Obrigado por jogar %s, foi bem divertido!
                """, nome);
    }
}