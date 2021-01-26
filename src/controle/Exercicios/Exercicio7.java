package controle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int somavalor = 0;

        while (valor >= 0) {
            System.out.println("Digite um número: ");
            valor = entrada.nextInt();
            if (valor >= 0) {
                somavalor += valor;
            }
        }

        System.out.println("A soma dos valores é igual a " + somavalor);
    }

}
