public class Carro {
    public String modelo;
    public String marca;
    public int aceleracao;
    public int segundoDeAceleracao;

    public void acelerar(int aceleracao){
        System.out.println("O carro acelera a " + aceleracao + "km");
    }

    public void acelerarEmSegundos(int segundoDeAceleracao){
        System.out.println("O carro acelera em " + segundoDeAceleracao + " segundos.");
    }

    public void imprimirAtributos(String modelo, String marca, int aceleracao, int segundoDeAceleracao){
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Aceleracao: %s\n", aceleracao);
        System.out.printf("Segundo de aceleração: %s por segundo.\n", aceleracao);

    }
}
