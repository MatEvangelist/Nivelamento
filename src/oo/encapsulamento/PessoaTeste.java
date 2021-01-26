package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(-45,"Romildo");

        // p1.idade = -30; // alterar
        p1.setIdade(230);

        // System.out.println(p1.idade); // ler
        System.out.println(p1.getIdade());
        System.out.println(p1); // toString


    }
}
