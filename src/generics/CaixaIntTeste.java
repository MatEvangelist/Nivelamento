package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt caix = new CaixaInt();
        caix.guardar(123);
        Integer coisaA = caix.abrir();
        System.out.println(coisaA);
    }
}
