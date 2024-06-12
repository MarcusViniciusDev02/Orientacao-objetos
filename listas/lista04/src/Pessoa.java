public class Pessoa {
    public String nome;
    public String profissao;
    public int idade;

    public void falar(String nome){
        System.out.println(nome + " está falando!");
    }

    public void andar(String nome){
        System.out.println(nome + " está andando");
    }

    public void imprimirAtributos(String nome, String profissao, int idade){
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: "+ profissao);
        System.out.println("Idade: " + idade);
    }
}
