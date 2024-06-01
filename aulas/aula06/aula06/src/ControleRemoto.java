public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;


    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getTocando() {
        return tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?" + getLigado());
        System.out.println("Está tocando?" + getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossível aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Volume: " + getVolume());
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        this.setTocando(false);
    }


}
