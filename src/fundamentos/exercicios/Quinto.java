package fundamentos.exercicios;

import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do triângulo: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o tamanho da altura do triângulo: ");
        double altura = entrada.nextDouble();

        entrada.close();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo corresponde a %.1f", area);


    }
}
