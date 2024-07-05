package locadora;

public class Jogo implements AudioVisual{
    private String titulo;
    private String plataforma;

    public Jogo (String titulo, String plataforma){
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("""
                Filme: %s
                Plataforma: %s
                """, titulo, plataforma);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }

}
