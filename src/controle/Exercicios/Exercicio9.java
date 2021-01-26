package controle.Exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maiorvalor = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.printf("Digite o %d° valor: ", contador+1);
            int valor = entrada.nextInt();
            if (contador == 1) {
                maiorvalor = valor;
            } else {
                if (valor > maiorvalor) {
                    maiorvalor = valor;
                }
            }
            contador++;
        }
        System.out.println("O maior valor foi " + maiorvalor);
        entrada.close();
    }
}
