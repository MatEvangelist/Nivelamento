package fundamentos.exercicios;

import java.util.Scanner;

public class Segundo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit que deseja converter em Celsius: ");
        double fahren = entrada.nextDouble();
        double celsius = (fahren - 32) * (5.0/9) ;

        System.out.printf("A temperatura de %.2f °F convertida é igual a %.2f °C", fahren, celsius);

        entrada.close();
    }
}
