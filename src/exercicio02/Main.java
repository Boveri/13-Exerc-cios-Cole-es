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

        //LISTAGEM DE TODOS OS ALUNOS MATRICULAS
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED);
        uniao.forEach(aluno -> System.out.println(aluno));

        //LISTAGEM DOS ALUNOS MATRICULAS SOMENTE EM BANCO DE DADOS
        System.out.println("\nLista dos alunos matriculados no banco de dados");
        Set<Aluno> soBanco = new HashSet<>(turmaBD);
        soBanco.removeAll(turmaED);
        soBanco.forEach(aluno -> System.out.println(aluno));

        //LISTAGEM DOS ALUNOS MATRICULAS SOMENTE EM BANCO DE DADOS E ESTRUTURA DE DADOS
        System.out.println("\n Lista dos alunos matriculados em banco de dados e estrutura de dados");
        Set<Aluno> ambos = new HashSet<>(turmaBD);
        ambos.retainAll(turmaED);
//        ambos.forEach(aluno -> System.out.println(aluno));
        ambos.forEach(System.out::println);

//        turmaBD.forEach(aluno -> System.out.println(aluno));
    }
}
