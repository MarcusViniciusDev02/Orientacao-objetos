package testes;

public class MainTeste {
    public static void main(String[] args) {
        TesteDois algo = new TesteDois();
        Teste testeUm = new Teste();
        testeUm.algo = "Merda";
        testeUm.algumaCoisa = "Alguma merda";
        testeUm.idade = 11;

        algo.teste.add(testeUm);
        algo.imprimirCoisa();
    }

}