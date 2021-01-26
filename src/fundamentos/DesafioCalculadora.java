package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {


    // ler num1
    // ler num2
    // + - / * %

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double num2 = entrada.nextDouble();

        System.out.println("Qual operação deseja efetuar? ");
        String operacao = entrada.next();

        double resultado = operacao.equals("+")? num1 + num2 : 0;
        resultado = operacao.equals("-")? num1 - num2 : resultado;
        resultado = operacao.equals("*")? num1 * num2 : resultado;
        resultado = operacao.equals("/")? num1 / num2 : resultado;
        resultado = operacao.equals("%")? num1 % num2 : resultado;


        System.out.printf("%.1f %s %.1f = %.1f ", num1, operacao, num2, resultado);



    entrada.close();

    }
}
