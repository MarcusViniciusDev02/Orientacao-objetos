package veiculos;

public class Caminhao implements Veiculo {


    private String modelo;
    private boolean ehUmaCilada;
    private boolean estaLigado;
    private boolean estaApressado;


    private boolean precisaParar;

    public Caminhao(String modelo, boolean estaLigado) {
        this.estaLigado = estaLigado;
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        if (getEstaLigado()  && getEstaApressado()) {
            System.out.println(getModelo() + " está acelerando!");
        }else{
            System.out.println("Dirigindo sem pressa.");
        }
    }

    @Override
    public void frear() {
        if (getEstaLigado() && getEhUmaCilada()) {
            System.out.println(getModelo() + " frea rápido!");
        } else {
            System.out.println(getModelo() + " continua em frente!");
        }
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void barreiraDoSom() {

    }


    public boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public boolean getEstaApressado() {
        return estaApressado;
    }

    public void setEstaApressado(boolean estaApressado) {
        this.estaApressado = estaApressado;
    }

    public boolean getEhUmaCilada() {
        return ehUmaCilada;
    }

    public void setEhUmaCilada(boolean ehUmaCilada) {
        this.ehUmaCilada = ehUmaCilada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getPrecisaParar() {
        return precisaParar;
    }

    public void setPrecisaParar(boolean precisaParar) {
        this.precisaParar = precisaParar;
    }
}
