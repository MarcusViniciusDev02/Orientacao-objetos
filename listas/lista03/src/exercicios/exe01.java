package exercicios;

import java.util.Scanner;

public class exe01 {
    public static final int ANO_ATUAL = 2024;
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Em que ano você nasceu?");
        int anoNascimento = Integer.parseInt(entrada.nextLine());
        int idadePrevista = preverIdadeAteFinalDoAno(anoNascimento, ANO_ATUAL);
        System.out.println("Até o final de " + ANO_ATUAL + " você terá " + idadePrevista + " anos.");

    }
    public static int preverIdadeAteFinalDoAno(int anoNascimento, int ANO_ATUAL){
        return ANO_ATUAL - anoNascimento;
    }
}
