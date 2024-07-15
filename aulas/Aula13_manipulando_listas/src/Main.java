import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<Curso> instituto = new ArrayList<>();
        List<Modalidade> modalidades = new ArrayList<>();
        modalidades.add(Modalidade.PRESENCIAL);
        modalidades.add(Modalidade.EAD);
        //Isolamento de escopo - Adicionando cursos
        {
            instituto.add(new Curso(0, "Ciencia da computação",
                    modalidades));

            instituto.add(new Curso(1, "Matemática aplicada",
                    new ArrayList<>(List.of(Modalidade.PRESENCIAL))));
            instituto.add(new Curso(1, "Química",
                    new ArrayList<>(List.of(Modalidade.EAD))));

        }

        for(int i = 0; i < instituto.size(); i++){
            if(instituto.get(i).getModalidades().contains(Modalidade.EAD)){
                System.out.println(instituto.get(i).getTitulo());
            }
        }

        for(Curso curso : instituto){
            if(curso.getModalidades().contains(Modalidade.PRESENCIAL)){
                System.out.println(curso.getTitulo());
            }

        }


    }



}