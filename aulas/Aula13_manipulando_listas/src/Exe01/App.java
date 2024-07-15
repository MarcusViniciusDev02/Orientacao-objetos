package Exe01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica(01, "Triller", 354, true));
        musicas.add(new Musica(02, "Hey Jude", 421, false));
        musicas.add(new Musica(03, "Bohemian Rhapsody", 357, false));
        musicas.add(new Musica(04, "Smooth Criminal", 412, true));
        musicas.add(new Musica(05, "Skyline Pigeon", 210, true));

        for(Musica musica : musicas){
            if(musica.isEstaFavoritada()){
                System.out.println(musica.getTitulo());
            }
        }
    }
}
