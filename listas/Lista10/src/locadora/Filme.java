package locadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filme implements AudioVisual{
    private String titulo;
    private String diretor;
    List<String > atores;

    public Filme(String titulo, String diretor, List<String> atores){
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }


    @Override
    public void exibirInfo() {
        System.out.printf("""
                Filme: %s
                Diretor: %s
                Atores: %s
                """, titulo, diretor, atores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
}
