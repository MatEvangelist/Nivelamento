package controle.Exercicios;

import java.security.KeyStore;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 0;
        while (i != 999) {
            System.out.println("Digite um número (999 pra parar): ");
            i = entrada.nextInt();
            if (i >= 0 && i <= 10) {
                if (i % 2 == 0) {
                    System.out.println("O número está entre 0 e 10 e é par.\n");
                } else {
                    System.out.println("O número está entre 0 e 10 e é ímpar.\n");
                }
            } else if (i == 999) {
                System.out.println("Fim.\n");

            } else {
                System.out.println("O número não está entre 0 e 10...\n");;
            }
        }
        entrada.close();
    }

}
