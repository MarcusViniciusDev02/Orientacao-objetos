import org.w3c.dom.ls.LSOutput;

public class Luta {
    public int lutadores;
    public boolean manoAhManoLiberado;
    public boolean saiuDoControle;

    public void liberarManoAhMano(boolean manoAhManoLiberado){
        if(manoAhManoLiberado){
            System.out.println("O mano a mano foi liberado!");
        }else{
            System.out.println("O adm não liberou o mano a mano!");
        }
    }

    public void sairDoControle(boolean saiuDoControle){
        if(saiuDoControle){
            System.out.println("Até o Juiz tá apanhando!");
        }else{
            System.out.println("Luta tá respeitosa!");
        }
    }

    public void imprimirAtributos(int lutadores, boolean manoAhManoLiberado, boolean saiuDoControle){
        System.out.println("Quantidade de Lutadores: " + lutadores);
        System.out.println("Mano a mano está liberado: " + manoAhManoLiberado);
        System.out.println(saiuDoControle);
    }
}
