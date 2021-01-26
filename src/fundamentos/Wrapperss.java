package fundamentos;

import java.util.Scanner;

public class Wrapperss {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entrada.next());
        // Converte string em um valor inteiro!
        // Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3.0);
        // somente com o ponto para mostrar casas decimais

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        // converte a string pro valor booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        entrada.close();

        Character c = '#'; // char
        System.out.println(c + "...");

    }
}
