import animais.Cachorro;
import animais.Gato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Buba", false);
    cachorro.comer();
    cachorro.emitirSom();
    Gato gato = new Gato("Garfield", true);
    gato.setEstaComFome(true);
    gato.comer();
    gato.emitirSom();
    }
}