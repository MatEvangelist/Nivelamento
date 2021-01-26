package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos() {
        // System.out.println(mae.segredo); private
        // System.out.println(mae.facoDentroDeCasa); outro pacote

        // System.out.println(mae.formaDeFalar);
        // protected pode e deve ser acessado pela classe filha
        // sem precisar instanciar um objeto da classe mãe
        // assim como a classe pública também

        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        System.out.println(mae.todosSabem);
    }
}
