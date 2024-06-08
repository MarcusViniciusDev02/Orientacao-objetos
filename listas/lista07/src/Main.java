import escola.Aluno;
import escola.Professor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedrinho", "p@gmail.com", "11111");
        Professor professor = new Professor("Sérgio", "sergiao@gmail.com", "Playstationlogia");
        aluno.exibirInfo(aluno.getNome(), aluno.getEmail(), aluno.getMatricula());
        System.out.println();
        professor.exibirInfo(professor.getNome(), professor.getEmail(), professor.getDisciplina());
        System.out.println();

        System.out.println("Sobrecarga");
        System.out.println("___Aluno___");
        aluno.exibirInfo(true, true, true);
        System.out.println("___Professor___");
        professor.exibirInfo(true, false, true);
    }
}