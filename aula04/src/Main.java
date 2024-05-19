public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();


        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.ehInstrumentista = true ;
        guitarrista.idade = 13;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";

        Musico cantor = new Musico();
        cantor.ehCantor = true;
        cantor.idade = 27;
        cantor.instrumento = "Voz";
        cantor.nome = "Vinicius";

        musica.musicos.add(guitarrista);
        musica.musicos.add(cantor);
        musica.tocarMusica();

        musica.imprimirDetalhes();

    }

}
