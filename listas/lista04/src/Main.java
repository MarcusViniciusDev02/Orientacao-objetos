public class Main {
    public static void main(String[] args) {
        System.out.println("___Carro___");
        Carro carro = new Carro();
        carro.aceleracao = 130;
        carro.segundoDeAceleracao = 10;
        carro.marca = "Chevrolet";
        carro.modelo = "Onix";
        carro.acelerar(carro.aceleracao);
        carro.acelerarEmSegundos(carro.segundoDeAceleracao);
        carro.imprimirAtributos(carro.marca, carro.modelo,carro.aceleracao, carro.segundoDeAceleracao);
        System.out.println();

        System.out.println("___Pessoa___");
        Pessoa pessoa= new Pessoa();
        pessoa.nome = "Anderson";
        pessoa.idade = 19;
        pessoa.profissao = "Programador";
        pessoa.andar(pessoa.nome);
        pessoa.falar(pessoa.nome);
        pessoa.imprimirAtributos(pessoa.nome, pessoa.profissao, pessoa.idade);
        System.out.println();

        System.out.println("___Luta___");
        Luta luta = new Luta();
        luta.lutadores = 2;
        luta.manoAhManoLiberado = true;
        luta.saiuDoControle = true;
        luta.liberarManoAhMano(luta.manoAhManoLiberado);
        luta.sairDoControle(luta.saiuDoControle);
        luta.imprimirAtributos(luta.lutadores, luta.manoAhManoLiberado, luta.saiuDoControle);
        System.out.println();

    }
}