package animais;

public class Cachorro implements Animal{
        private String nome;
        private boolean estaAcordado;
        private boolean estaComFome;

        public Cachorro(String nome, boolean estaAcordado){
            this.nome = nome;
            this.estaAcordado = estaAcordado;
        }
        @Override
        public void comer(){
            if(getEstaAcordado() && getEstaComFome()){
                System.out.println(getNome() + " está indo comer sua ração");
            }else if(getEstaAcordado() == false){
                System.out.println(getNome() + " nem viu, está dormindo");
            }else{
                System.out.println(getNome() + " cheirou, lambeu e meteu o pé");
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


