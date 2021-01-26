package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos há na turma? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas cada aluno terá? ");
        int qtdeNotas = entrada.nextInt();

        System.out.println("-----------------------------");

        double[][] notasAlunos = new double [qtdeAlunos][qtdeNotas];
        double total = 0;

        for(int a = 0; a < notasAlunos.length; a++) {
            System.out.println("Qual o nome do aluno? ");
            String nomeAluno = entrada.next();
            double totalIndividual = 0;

            for( int n = 0; n < notasAlunos[a].length; n++) {
                System.out.printf("Informe a %dª nota do aluno %s: ", n+1, nomeAluno);
                notasAlunos[a][n] = Double.parseDouble(entrada.next());
                totalIndividual += notasAlunos[a][n];
                total += notasAlunos[a][n];

            }
            double mediaIndividual = totalIndividual/qtdeNotas;
            System.out.printf("A média individual do aluno %s é igual a : %.2f\n",
                    nomeAluno, mediaIndividual);
            System.out.println("-----------------------------");


        }
        double mediaTotal = total / (qtdeAlunos * qtdeNotas);
        System.out.println("A média da classe inteira é igual a : " + String.format("%.2f", mediaTotal));

        System.out.println(Arrays.toString(notasAlunos));
        entrada.close();
    }
}
