package fundamentos.exercicios;

import java.util.Scanner;

public class Quarto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double valor = entrada.nextDouble();

        entrada.close();

        double quadrado = Math.pow(valor, 2);

        double cubo = Math.pow(valor, 3);

        System.out.printf("O quadrado e cubo do número %.1f são respectivamente %.1f e %.1f",
                valor, quadrado, cubo);
    }
}
