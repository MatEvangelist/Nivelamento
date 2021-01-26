package controle.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int ano = 0;

        Scanner entrada = new Scanner(System.in);

        while (ano != 999) {
            System.out.println("Digite o ano: ");
            ano = entrada.nextInt();

            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("É um ano bissexto.\n");
            } else {
                System.out.println("Não é bissexto.\n");
            }


        }
    }
}
