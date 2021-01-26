package aula09;

public class Aula09 {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Mathews Evangelista", 21, "M");
        p[1] = new Pessoa("Marilene Pereira", 49, "F");


        l[0] = new Livro("Clube da Luta", "Chuck Palahniuk", 257, p[0]);
        l[1] = new Livro("Watchmen", "Alan Moore", 482, p[1]);

        l[0].abrir();
        l[0].folhear(54);
        System.out.println(l[0].detalhes());

        


    }
}
