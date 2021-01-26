package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        //Offer e Add -> Adicionam elementos na fila
        // Diferença ocorre quando a fila está cheia.
        fila.add("Ana");
        fila.offer("Bia"); // adiciona o valor e
        // retorna valor true/false caso consiga adicionar elemento ou não
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obter o próximo elemento da fila (sem remover)
        //Diferneça ocorre quando a fila está vazia
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna uma exceção se a fila estiver vazia
        System.out.println(fila.element());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);

        //Poll e Remove -> Obter o próximo elemento da fila e remove!
        // Diferença do comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // pega o ultimo elemento da fila e remove
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retorna null quando vazia
        System.out.println(fila.remove()); // retorna exceção
    }
}
