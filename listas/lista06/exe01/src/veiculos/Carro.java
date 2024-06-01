package veiculos;

import java.util.Scanner;

public class Carro implements Veiculo {
    Scanner entrada = new Scanner(System.in);
    private String modeloCarro;
    private boolean estaLigado;
    private boolean apertouAcelerador;
    private boolean apertouOFreio;
    private boolean estaComEscadinhaNoTeto;

    public Carro(String modeloCarro, boolean estaLigado) {
        this.modeloCarro = modeloCarro;
        this.estaLigado = estaLigado;
    }

    public void perguntarSeEstaComEscadinha() {
        System.out.println("Está com escadinha no teto?");
        boolean resposta = entrada.nextBoolean();
        if (resposta == true) {
            setEstaComEscadinhaNoTeto(true);
            barreiraDoSom();
        }else{
            System.out.println("Vai lentinho mesmo!");
        }
    }

    @Override
    public void ligar() {
        if (!getEstaLigado()) {
            setEstaLigado(true);
            System.out.println("Liguei o carro.");
        }
    }

    @Override
    public void desligar() {
        if (getEstaLigado()) {
            setEstaLigado(false);
            System.out.println("Desliguei o carro.");
        }
    }

    @Override
    public void acelerar() {
        if (getEstaLigado()) {
            setApertouAcelerador(true);
            System.out.println("Acelerando o carro!");
        }else{
            System.out.println("O carro nem tá ligado, irmão");
        }

    }

    @Override
    public void frear() {
        if (getEstaLigado() && getApertouAcelerador()) {
            System.out.println("Freando o carro!");
        }else{
            System.out.println("O carro nem tá andando, irmão");
        }
    }

    @Override
    public void barreiraDoSom() {
        if (getEstaLigado() == true && getEstaComEscadinhaNoTeto()) {
            System.out.println("Ultrapassou a barreira do som!");
        }
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public boolean getApertouAcelerador() {
        return apertouAcelerador;
    }

    public void setApertouAcelerador(boolean apertouAcelerador) {
        this.apertouAcelerador = apertouAcelerador;
    }

    public boolean getApertouOFreio() {
        return apertouOFreio;
    }

    public void setApertouOFreio(boolean apertouOFreio) {
        this.apertouOFreio = apertouOFreio;
    }

    public boolean getEstaComEscadinhaNoTeto() {
        return estaComEscadinhaNoTeto;
    }

    public void setEstaComEscadinhaNoTeto(boolean estaComEscadinhaNoTeto) {
        this.estaComEscadinhaNoTeto = estaComEscadinhaNoTeto;
    }

    
}
