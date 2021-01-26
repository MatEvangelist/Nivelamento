package fundamentos.exercicios;

import java.util.Scanner;

public class Primeiro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C que deseja converter: ");
        double celsius = entrada.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("A sua temperatura de %.2f °C é igual a %.2f °F.", celsius, farenheit);

        entrada.close();
    }
}
