import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        saudarUsuario();
    }

    public static String escanearNome(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void saudarUsuario()
    {
        System.out.printf("Olá %s", escanearNome());
    }

}
