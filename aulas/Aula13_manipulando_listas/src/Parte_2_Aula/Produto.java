package Parte_2_Aula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private BigDecimal preco;

    public Produto(int id, String smartphone, BigDecimal bigDecimal) {
    this.id = id;
    this.nome = nome;
    this.preco = bigDecimal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }



    //Todas as variáveis
}
