import veiculos.Caminhao;
import veiculos.Carro;

public class App {
     public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fiat Uno", false);
        carro.ligar();
        carro.acelerar();
        carro.perguntarSeEstaComEscadinha();
        carro.frear();
        carro.desligar();
        carro.acelerar();
        carro.frear();

         System.out.println("\nCaminhão");
         Caminhao caminhao = new Caminhao("Volvo FH540", true);
         caminhao.setEstaApressado(false);
         caminhao.acelerar();
         caminhao.setEhUmaCilada(false);
         caminhao.frear();
    }
}
