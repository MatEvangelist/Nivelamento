package controle.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

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

        switch (divisor) {
            case 0:
                System.out.println("O número é primo.");
            default:
                System.out.println("Não é primo.");
        }
    }
}
