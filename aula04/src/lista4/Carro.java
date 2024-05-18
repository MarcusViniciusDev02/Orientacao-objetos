package lista4;

public class Carro {
    double velocidade;
    double aceleracao;
    double freio;

    public void imprimirAtributos() {
        System.out.printf("""
                        VELOCIDADE: %s
                        ACELERAÇÃO: %s
                        FREIO: %s
                        """,
                velocidade,
                aceleracao,
                freio
        );
    }

    public void acelerarNaLadeira() {
        System.out.printf("O carro acelerou a %s por hora e chegou a uma velocidade de %s descendo uma ladeira.\n", aceleracao, velocidade);
        System.out.println();
    }

    public void freiarDesesperadamente() {
        System.out.printf("""
                Depois de fazer besteira (como acelerar descendo uma ladeira),
                ele teve que freiar, para não bater no muro a frente, porém seu 
                freio teve uma força de %s e ele acabou capotando.
                """, freio);
        System.out.println();
    }

}


