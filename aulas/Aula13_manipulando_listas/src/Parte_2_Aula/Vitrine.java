package Parte_2_Aula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Vitrine {
    private List<Produto> produtos;

    public Vitrine(List<Produto> produtos){

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public List<Produto> getProdutosFiltrados(Predicate condicao){
        //Condição enviada por parâmetro.
        return produtos.stream().filter(condicao).toList();
    }
//    public List<Produto> getProdutosFiltrados(String tipoFiltro, BigDecimal valor){
//        List<Produto> produtosFiltrados = new ArrayList<>();
//        if(tipoFiltro.equals("maior")){
//            for(Produto produto : produtos){
//                if(produto.getPreco().compareTo(valor) == 1){
//                    produtosFiltrados.add(produto);
//                }
//            }
//        }
//
//        if(tipoFiltro.equals("menor")){
//
//        }
//
//    }
}
