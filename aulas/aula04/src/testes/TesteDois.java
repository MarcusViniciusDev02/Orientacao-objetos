package testes;

import java.util.ArrayList;

public class TesteDois {
    ArrayList<Teste> teste = new ArrayList<>();

    public void imprimirCoisa() {
        for (Teste umMonteDeCoisa : teste) {
            umMonteDeCoisa.listagemCoisas();
            System.out.println(umMonteDeCoisa.toString());
        }
    }
}
