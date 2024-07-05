
public class App {
    public static void main(String[] args) throws Exception{
        Musica musica1 = new Musica("Smells Like a Teen Spirit", "Nirvana", "Nevermind");
        BibiotecaMusical bibliotecaMusical = new BibiotecaMusical();
        bibliotecaMusical.adicionarMusica("Smells Like a Teen Spirit", musica1);
        bibliotecaMusical.listarMusicas();
        try{
        bibliotecaMusical.buscarMusica("Ai foi que o barraco desandou");
        }catch(MusicaNaoEncontradaException e){
            System.out.println(e.getMessage());
        }
    }
}
