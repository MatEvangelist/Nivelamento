package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civicao;
import oo.heranca.desafio.Fusca;

public class CarroTeste {

    public static void main(String[] args) {

        Civicao civic = new Civicao();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.ligarTurbo();
        civic.acelerar();
        System.out.println(civic);

        civic.ligarAr();
        civic.acelerar();
        System.out.println(civic);

        civic.desligarTurbo();
        civic.frear();
        System.out.println(civic);

        civic.desligarAr();
        civic.acelerar();
        System.out.println(civic);

        System.out.println();

        Fusca fusca = new Fusca();

        fusca.acelerar();
        System.out.println(fusca);

        fusca.acelerar();
        System.out.println(fusca);



    }
}
