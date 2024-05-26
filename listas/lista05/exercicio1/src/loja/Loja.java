package loja;

import java.util.ArrayList;

public class Loja {
    String nome;
    String endereco;
    ArrayList <Produto> produtos = new ArrayList<>();

    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
