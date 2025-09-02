package exercicio02;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(444044, "Samara", "A"));
        turmaBD.add(new Aluno(444044, "Jaque", "B"));
        turmaBD.add(new Aluno(555055, "Felipe", "C"));
        turmaBD.add(new Aluno(333033, "João", "D"));

        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno(555055, "Felipe", "C"));
        turmaED.add(new Aluno(333033, "João", "D"));
        turmaED.add(new Aluno(222022, "Ana", "E"));

        turmaBD.forEach(aluno -> System.out.println(aluno));
    }
}
