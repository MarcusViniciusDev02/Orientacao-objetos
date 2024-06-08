package escola;

public abstract class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println(getNome());
        System.out.println(getEmail());
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract void exibirInfo(String exibirNome, String exibirEmail, String exibirMatricula);

    public abstract void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula);
}
