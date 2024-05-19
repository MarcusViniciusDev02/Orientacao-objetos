public class Musico {
    String nome;
    int idade;
    boolean ehInstrumentista;
    String instrumento;
    boolean ehCantor;

    public void imprimirDetalhes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(ehInstrumentista);
        System.out.println(instrumento);
        System.out.println(ehCantor);
    }

    public void tocar() {
        if (ehInstrumentista) {
            System.out.println("Tirando um som!!");
        } else {
            System.out.println("apdijhsadnapdasihd");
        }
    }

    public void cantar() {
        if (ehCantor) {
            System.out.println("Lalaia Laia");
        } else {
            System.out.println("SHODASHDOA ODHOAUSDAS");
        }
    }
}

