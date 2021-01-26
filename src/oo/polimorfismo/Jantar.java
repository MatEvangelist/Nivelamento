package oo.polimorfismo;

import classe.AreaCirc;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidade = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.1);
        // Comida ingrediente3 = new Comida(0.1);
        // classe abstrata não instancia

        System.out.println(convidade.getPeso());

        convidade.comer(ingrediente1);
        convidade.comer(ingrediente2);

        System.out.println(convidade.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidade.comer(sobremesa);
        System.out.println(convidade.getPeso());
    }
}
