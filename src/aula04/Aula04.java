package aula04;

public class Aula04 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
//        c1.setModelo("BIC");
//        // c1.modelo = "BIC"; (atributos privados)
//        c1.setPonta(0.5f);
//        // c1.ponta = 0.5f; (atributos privados)
        c1.status();
        System.out.println("///////////////////////////////////////");

        Caneta c2 = new Caneta("KKKKK", "Verde", 0.8f);
        c2.status();
    }
}
