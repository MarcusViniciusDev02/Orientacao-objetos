import java.util.ArrayList;

public class Musica {
    String melodia;
    String cifra;
    String letra;
    boolean temLetra;
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void tocarMusica() {
        for (int i = 0; i < musicos.size(); i++) {

            if (musicos.get(i).ehCantor){
                musicos.get(i).cantar();
            }else{
                musicos.get(i).tocarMusica();
            }
        }
    }
}
