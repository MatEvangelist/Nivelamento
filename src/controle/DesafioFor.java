package controle;

public class DesafioFor {

    public static void main(String[] args) {

//        String valor= "#";
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(valor);
//            valor += "#";
//        }

        //Desafio: Não pode usar valor numérico pra controlar o laço!

//        String valor= "#";
//        String contador = "cinco";
//
//        for (int i = 0; i <= contador.length(); i++) {
//            System.out.println(valor);
//            valor += "#";


        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}



