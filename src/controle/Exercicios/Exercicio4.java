package controle.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        int contador = 1;
        int divisor = 0;

        while (contador <= numero) {
            if (numero % contador == 0) {
                divisor++;
            }
            contador++;
        }

        if (divisor <= 2) {
            System.out.printf("O número %d é primo.", numero);
        } else {
            System.out.printf("O número %d não é primo.", numero);
        }

    }
}
