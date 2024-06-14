import loja.NomeInvalidoException;
import loja.PrecoInvalidoException;
import loja.Produto;

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            try {
                Produto produto = new Produto(
                        entrada.nextLine(),
                        Double.parseDouble(entrada.nextLine()));
                System.out.println(produto.getNome());
                System.out.println(produto.getPreco());
                break;
            }catch(NomeInvalidoException | PrecoInvalidoException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println("Ocorreu um erro, tente novamente!");
            }
        }while(true);
    }

}