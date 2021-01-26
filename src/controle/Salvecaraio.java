package controle;

import java.util.Scanner;

public class Salvecaraio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String sensacao = "";

        do {
            System.out.println("Boa tarde minha vida, " +
                    "você tá bem?");
            sensacao = entrada.nextLine();
            if (sensacao.equalsIgnoreCase("não tô lecal :C ")) {
                System.out.println("Fica assim não, você é linda <3");
            } else if (sensacao.equalsIgnoreCase("sla carai, cala boca")) {
                System.out.println("Me desculpa senpai :(");
            } else if (sensacao.equalsIgnoreCase("tô bem meu amorzinho")) {
                System.out.println("Opa, manda foto da teta aí garai, desfio hardcore mermão");
            } else {
                System.out.println("Que lingua é essa filho daputa??????");
            }
        } while (!sensacao.equalsIgnoreCase("tô dibas")) ;


        entrada.close();
    }
}
