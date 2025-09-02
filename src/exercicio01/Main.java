package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("A", 6.5, 10));
        lista.add(new Candidato("B", 3, 2));
        lista.add(new Candidato("C", 9.7, 15));
        lista.add(new Candidato("D", 9.7, 23));

        //CRITÉRIO DE ORDENAÇÃO
        Comparator<Candidato> criterio = Comparator.comparing
                (Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome);

        //APLICA O CRITÉRIO DE ORDENAÇÃO NA LISTA
        lista.sort(criterio);

        //IMPRESSÃO DA LISTA
        lista.forEach(candidato -> System.out.println(candidato));
    }
}
