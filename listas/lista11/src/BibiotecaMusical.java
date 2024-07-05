import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class BibiotecaMusical {
    private Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica) {
        acervo.put(titulo, musica);
    }

    public void listarMusicas() {
        for (Entry<String, Musica> listaMusicas : this.acervo.entrySet()) {
            System.out.println(listaMusicas.getKey());
            System.out.println(listaMusicas.getValue());
        }
    }

    public void buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        Musica musica = acervo.get(titulo);
        if(musica == null){
            throw new MusicaNaoEncontradaException();
        }else{
            System.out.println(musica);
        }
    }
}
