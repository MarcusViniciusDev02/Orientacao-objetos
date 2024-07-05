package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    List<T> acervo = new ArrayList<>();

    public void adicionarItem(T item){
        acervo.add(item);
    }
    public void listarItens(){
        for(T item: acervo){
            item.exibirInfo();
            System.out.println();
        }
    }

    public T buscarItem(String titulo){
        for (T item : acervo){
            if(item instanceof Filme){
                Filme filme = (Filme) item;
                if(filme.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(filme.getTitulo());
                    System.out.println(filme.getDiretor());
                    System.out.println(filme.getAtores());
                    return item;
                }
            }
            if(item instanceof Jogo){
                Jogo jogo = (Jogo) item;
                if(jogo.getTitulo().equalsIgnoreCase(titulo)){
                    System.out.println(jogo.getTitulo());
                    System.out.println(jogo.getPlataforma());
                    return item;
                }
                }
            }

        return null;
    }
    }


