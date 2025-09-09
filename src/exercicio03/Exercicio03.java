package exercicio03;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        Map<Character, Integer> contador = new HashMap<>();

        System.out.print("Frase --> ");
        frase = sc.nextLine();

        for(char c : frase.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                /*int valor = contador.get(c);
                System.out.println(valor);*/
                contador.put(c, contador.getOrDefault(c, 0)+1);
            }
        }

        //IMPRESSÃO EM ORDEM ALFABÉTICA
        Set<Character> chave = contador.keySet();
        TreeSet<Character> arvore = new TreeSet(chave);
        for (char c : arvore){
            System.out.println(c + " --> "+contador.get(c));
        }
    }
}
