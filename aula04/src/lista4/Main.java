package lista4;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.velocidade = 200.00;
        carro.aceleracao = 100.00;
        carro.freio = 50.00;

        Bola bola = new Bola();
        bola.corBola = "Verde";
        bola.velocidade = 30.00;
        bola.forcaNoQuique  = 50.00;

        Corrida corrida = new Corrida();
        corrida.distancia = 10.00;
        corrida.velocidade = 20.00;
        corrida.tempo = 10.00;

        System.out.println("__________Carro________");
        carro.imprimirAtributos();
        carro.acelerarNaLadeira();
        carro.freiarDesesperadamente();
        System.out.println();
        System.out.println("__________Bola________");
        bola.imprimirAtributos();
        bola.jogarBola();
        bola.quicar();
        System.out.println("__________Corrida________");
        corrida.imprimirAtributos();
        corrida.correrRapido();
        corrida.chegarAhDistancia();

    }
}
