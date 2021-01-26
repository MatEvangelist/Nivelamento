package controle.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        input.close();

        double media = (nota1 + nota2) / 2;

        if (media >= 0 && media <= 10) {
            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media < 7 && media >= 4) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado.");
            }
        } else {
            System.out.println("Nota inválida.");
        }
    }
}
