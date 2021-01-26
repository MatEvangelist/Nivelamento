package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo, quantas notas deseja registrar? ");
        int qtdNotas = entrada.nextInt();

        double [] notas = new double[qtdNotas];

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dª nota: ", i+1);
            // notas [i] = entrada.nextDouble();
            notas [i] = Double.parseDouble(entrada.next());
        }

        entrada.close();

        double a = 6.8;


        double totalNotas = 0;
        for (double notaSeparada:notas) {
            totalNotas += notaSeparada;
        }

        double media = totalNotas / notas.length;
        System.out.println("A média das notas registradas é igual a: " + String.format("%.2f", media));

    }
}
