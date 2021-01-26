package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        String s = new String("texto");
        // é a mesma coisa
        // que String s = "texto";
        s.toUpperCase();

        // Wrappers são as versões objeto
        // dos tipos primitivos
        int a = 123;
        System.out.println(a);
    }
}
