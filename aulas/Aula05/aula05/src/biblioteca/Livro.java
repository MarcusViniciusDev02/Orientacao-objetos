package biblioteca;

public class Livro {
    private String autor;
    private String nome;
    private int anoLancamento;

    public void setAutor(String autor) {
        if (autor.isBlank()) {
            this.autor = "Desconhecido";
        } else {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return this.autor;
    }

    public void setNome(String tipoCapa) {
        this.nome = tipoCapa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento < 2000) {
            this.anoLancamento = 2000;
        }else if(anoLancamento == null){
            
        } 
        else {
            this.anoLancamento = anoLancamento;
        }
    }

    public int setAnoLancamento() {
        return this.anoLancamento;
    }

}
