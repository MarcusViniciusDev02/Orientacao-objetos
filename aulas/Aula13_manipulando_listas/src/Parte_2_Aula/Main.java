package Parte_2_Aula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vitrine vitrine = new Vitrine (new ArrayList<>());
        vitrine.adicionarProduto(new Produto(1, "Smartphone", new BigDecimal(1000)));
        vitrine.adicionarProduto(new Produto(2, "Fone de Ouvido", new BigDecimal(30)));
        vitrine.adicionarProduto(new Produto(3, "Capinha de celular", new BigDecimal(40)));
        vitrine.adicionarProduto(new Produto(4, "Caixinha de som", new BigDecimal(300)));

       List<Produto> produtosFiltrados = vitrine.getProdutosFiltrados(produto -> produto.getNome().compareTo(new BigDecimal(50)) == 1);

       for(Produto produto : produtosFiltrados){
           System.out.println(produto.getNome());
       }



        {    //Aplicado para fazer conta monetária.
            //Utilozado para corrigir números quebrados, impeceptíveis que podem gerar erros de lógica no código.
//         '   BigDecimal v1 = new BigDecimal(0.1);
//            BigDecimal v2 = new BigDecimal(0.2);
//            System.out.println(v1.add(v2).compareTo(new BigDecimal(0.3)));'
        }

    }
}

/*
* Solid: 5 princípios da Orientação a Objetos
*
* */