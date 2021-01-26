package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int pessoas = 0;
        double notastotal = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota: ");
            nota = entrada.nextDouble();
            if (1 <= nota && nota <= 10) {
                pessoas++;
                notastotal += nota;
            } else {
                System.out.println("Nota inválida...");
            }
        }
        double media = notastotal / pessoas;

        System.out.printf("Foram registradas %d pessoas e a média" +
                "das notas é igual a %.1f", pessoas, media);


        entrada.close();
    }

}
