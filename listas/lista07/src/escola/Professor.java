package escola;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo(String exibirNome, String exibirEmail, String exibirMatricula) {
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(getDisciplina());
    }

    @Override
    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
        if (exibirNome) {
            System.out.println(getNome());
        }
        if (exibirEmail) {
            System.out.println(getEmail());
        }
        if (exibirDisciplina) {
            System.out.println(getDisciplina());
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

}
