import java.io.File;
import java.io.FileNotFoundException;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o primeiro número");
        int numero1 = pedirNumero();
        System.out.println("Digite o segundo número");
        int numero2 = pedirNumero();


    }

    public static int pedirNumero() {
        do {
            try {
                return Integer.parseInt(entrada.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Por favor, envie um número válido.");
            }
        } while (true);

    }

}