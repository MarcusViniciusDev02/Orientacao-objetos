import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> atores = new ArrayList<>();
        atores.add("Sigourney Weaver");

        Filme filme = new Filme("Alien", "Ridley Scott", atores);

        Jogo jogo = new Jogo("Zelda: Ocarina of Time", "Nintendo 64");

        Locadora<Filme> locadora = new Locadora<>();
        Locadora<Jogo> locadoraJogo = new Locadora<>();
        Locadora<AudioVisual> locadoraTop = new Locadora<>();
        locadora.adicionarItem(filme);
        locadora.adicionarItem(filme);
        locadoraJogo.adicionarItem(jogo);
        locadoraTop.adicionarItem(filme);
        locadoraTop.adicionarItem(jogo);


        locadora.listarItens();

        locadora.buscarItem("Zelda: Ocarina of time");


    }
}