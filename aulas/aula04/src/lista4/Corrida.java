package lista4;

public class Corrida {
    double velocidade;
    double tempo;
    double distancia;

    public void correrRapido(){
        System.out.printf("Passou a correr a uma velocidade de %s km", velocidade);
        System.out.println();
    }

    public void chegarAhDistancia(){
        System.out.printf("Chegarei a distancia de %s km em %s minutos", distancia, tempo);
        System.out.println();
    }

    public void imprimirAtributos() {
        System.out.printf("""
                        VELOCIDADE: %s
                        TEMPO: %s
                        DISTANCIA: %s
                        """,
                velocidade,
                tempo,
                distancia
        );
    }
}



