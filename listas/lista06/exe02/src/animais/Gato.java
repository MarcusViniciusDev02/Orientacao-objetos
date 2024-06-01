package animais;

public class Gato implements Animal{
    private String nome;
    private boolean estaAcordado;
    private boolean estaComFome;

    public Gato(String nome, boolean estaAcordado){
        this.nome = nome;
        this.estaAcordado = estaAcordado;
    }
    public void comer(){
        if(getEstaAcordado() && getEstaComFome()){
            System.out.println(getNome() + " está indo comer sua ração");
        }else if(getEstaAcordado() == false){
            System.out.println(getNome() + " nem viu, está dormindo");
        }else{
            System.out.println(getNome() + " cheirou, lambeu, se esticou e foi embora");
        }
    }

    @Override
    public void emitirSom() {
        if(getEstaAcordado() == true){
            System.out.println(getNome() + "Latiu");
        }else if(getEstaAcordado() == false){
            System.out.println(getNome() + " está dormindo");
        }else{
            System.out.println(getNome() + " ficou quieto");
        }
    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getEstaAcordado() {
        return estaAcordado;
    }

    public void setEstaAcordado(boolean estaAcordado) {
        this.estaAcordado = estaAcordado;
    }

    public boolean getEstaComFome() {
        return estaComFome;
    }

    public void setEstaComFome(boolean estaComFome) {
        this.estaComFome = estaComFome;
    }
}
