package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {


        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        //ou
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); //pega a descrição
        // acessar pelo índice
        System.out.println(lista.get(3).nome); //pega atributo específico

        // lista.remove(1); // remoção pelo index volta o valor do objeto
        // lista.remove(new Usuario("Manu")); // remoção pelo valor do objeto volta ele mesmo

        System.out.println("Vai ser removido>>>>" + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));



        for (Usuario u: lista) {
            System.out.println(u); // chama com o método toString ao imprimir
            // "u.toString" está de forma implícita aqui
        }

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }



    }
}
