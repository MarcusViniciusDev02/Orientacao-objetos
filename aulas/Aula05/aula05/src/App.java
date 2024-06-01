import biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro();
        
        livro.setNome("Romeu e Julieta");
        livro.setAutor("William");

        System.out.printf("%s\n",livro.getNome());
        System.out.println(livro.getAutor());
      

    }
}
