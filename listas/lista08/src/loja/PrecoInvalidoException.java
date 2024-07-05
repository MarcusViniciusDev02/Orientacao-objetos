package loja;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException() {
        super("Preço Inválido!");
    }
}
