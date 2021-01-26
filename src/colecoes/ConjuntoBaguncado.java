package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        //                 // tipo -> wrapper
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste"); // t minúsculo portanto adiciona
        conjunto.add("Teste");
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("abc"));
        // volta um valor false porque não há esse elemento no conjunto

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dosi conjuntos
        conjunto.retainAll(nums); // interseção (mostra só os valores em comum)
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
