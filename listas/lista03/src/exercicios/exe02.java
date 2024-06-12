package exercicios;

import java.util.Scanner;

public class exe02 {
    public static double[] notas = new double[3];
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        receberNotas(notas);
        imprimirMedia();
    }

    public static void receberNotas(double[] notas){
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(entrada.nextLine());
        }


    }

    public static void imprimirMedia(){
        double armazenadorDeNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            armazenadorDeNotas += notas[i];
        }
        double media = (armazenadorDeNotas / 3);
        System.out.printf("Media: %.1f", media);
    }
}
