package pessoas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(23);
        v1.setSexo("M");

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setCurso("INformática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(11111);
        b1.setNome("Jubileu");
        b1.setSexo("M");
        b1.pagarMensalidade();

        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());



    }
}