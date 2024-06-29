import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Alien", "Ridley Scott", Arrays.asList("Sigourney Weaver"));
        Jogo jogo = new Jogo("Zelda: Ocarina of Time", "Nintendo 64");

        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);

        locadora.listarItens();

        locadora.buscarItem("Zelda");


    }
}