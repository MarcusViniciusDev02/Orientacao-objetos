import java.util.ArrayList;

public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letra;
    ArrayList<Musico> musicos = new ArrayList<>();

    public void imprimirDetalhes() {

        for (Musico musico : musicos) {
            musico.imprimirDetalhes();
            System.out.println(musico.toString());
        }

    }

    public void tocarMusica() {
        for (int i = 0; i < musicos.size(); i++) {
            if (musicos.get(i).ehCantor) {
                musicos.get(i).cantar();
            } else {
                musicos.get(i).tocar();
            }

        }
    }
}
