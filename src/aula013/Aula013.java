package aula013;

public class Aula013 {

    public static void main(String[] args) {

        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir("Vai apanhar");

        c.reagir(11, 45);
        c.reagir(21, 0);

        c.reagir(true);
        c.reagir(false);

        c.reagir(2, 12.5);
        c.reagir(17, 4.5);

    }
}
