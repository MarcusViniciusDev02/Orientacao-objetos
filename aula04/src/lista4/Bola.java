package lista4;

public class Bola {
     double velocidade;
     double forcaNoQuique;
     String corBola;

     public void imprimirAtributos() {
          System.out.printf("""
                        VELOCIDADE: %s
                        FORÇA DO QUIQUE: %s
                        COR: %s
                        """,
                  velocidade,
                  forcaNoQuique,
                  corBola
          );
     }

     public void quicar(){
          System.out.printf("A bola %s está quicando muito alto, pois foi jogada a uma força de %s\n", corBola, forcaNoQuique);
          System.out.println();
     }

     public void jogarBola(){
          System.out.printf("Na descida, a bola rolou a %s km", velocidade);
          System.out.println();
     }
}
