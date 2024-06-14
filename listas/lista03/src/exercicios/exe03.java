package exercicios;

import java.util.Scanner;

public class exe03 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String primeiraPalavra = entrada.nextLine();
        String segundaPalavra = entrada.nextLine();
        String resposta = compararPalavras(primeiraPalavra, segundaPalavra);
        System.out.println(resposta);

    }

    public static String compararPalavras (String primeiraPalavra, String segundaPalavra){
        if(primeiraPalavra.equals(segundaPalavra)){
            return "As palavras são idênticas.";
        }else if(primeiraPalavra.equalsIgnoreCase(segundaPalavra)){
            return "Ignorando maúsculos e minúsculos, as palavras são iguais.";
        } else {
            return "As palavras não são iguais.";
        }

    }

}
