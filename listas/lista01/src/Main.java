import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static final int TAMANHO_VETOR = 10;
    public static int[] vetor = new int[TAMANHO_VETOR];
    public static void main(String[] args) {
        coletarNumeros();
        System.out.println("Busque o número que deseja no vetor: ");
        Integer pesquisaNumero = Integer.parseInt(entrada.nextLine());
        String resposta = pesquisarNumeros(pesquisaNumero) ? "Achei" : "Não achei";
        System.out.println(resposta);
    }

    public static void coletarNumeros(){
        System.out.println("Preencha o vetor com 10 números.");
        for (int i = 0; i < TAMANHO_VETOR; i++){
            vetor[i] = Integer.parseInt(entrada.nextLine());
        }
    }

    public static boolean pesquisarNumeros(Integer pesquisaNumero){
        for (int i = 0; i < TAMANHO_VETOR; i++){
            if(pesquisaNumero.equals(vetor[i])){
                return true;
            }
        }
        return false;
    }
}