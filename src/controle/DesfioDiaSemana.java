package controle;

import java.util.Scanner;

public class DesfioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next();

        entrada.close();

        if (dia.equals("domingo")) {
            System.out.println("1");
        } else if (dia.equals("segunda")) {
            System.out.println("2");
        }else if (dia.equals("terça")) {
            System.out.println("2");
        }else if (dia.equals("quarta")) {
            System.out.println("2");
        }else if (dia.equals("quinta")) {
            System.out.println("2");
        }else if (dia.equals("sexta")) {
            System.out.println("2");
        }else if (dia.equals("sábado")) {
            System.out.println("2");
        }else {
            System.out.println("Inválido.");
        }


    }
}
