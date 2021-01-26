package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // Set <String> listaAprovados = new HashSet <String> (); // só aceita valores do tipo String
        // SortedSet<String> listaAprovados = new TreeSet<>();
        TreeSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidatos: listaAprovados) {
            System.out.println(candidatos);
        }

    }
}
