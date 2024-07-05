
public class App {
    public static void main(String[] args) throws Exception{
        Musica musica1 = new Musica("Smells Like a Teen Spirit", "Nirvana", "Nevermind");
        BibiotecaMusical bibliotecaMusical = new BibiotecaMusical();
        bibliotecaMusical.adicionarMusica("Smells Like a Teen Spirit", musica1);
        bibliotecaMusical.listarMusicas();
        bibliotecaMusical.buscarMusica("Smells Like a Teen Spirit");
        bibliotecaMusical.buscarMusica("Closer");
        
    }
}
