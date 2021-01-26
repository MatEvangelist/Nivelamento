package fundamentos.exercicios;

import java.util.Scanner;

public class Terceiro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println(peso);

        System.out.println("Digite  sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println(altura);


        double imc =  peso / (altura * altura);

        entrada.close();
    }
}
