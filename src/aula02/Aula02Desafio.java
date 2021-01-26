package aula02;

import java.util.Scanner;

public class Aula02Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o ano letivo? ");
        int anoLetivo = entrada.nextInt();

        System.out.println("Qual é o código da sala de aula? ");
        String codigo = entrada.nextLine();

        System.out.println("Qual é o nome do professor? ");
        String nome = entrada.nextLine();

        System.out.println("Quantos alunos estão presentes na classe? ");
        int quantidade = entrada.nextInt();

        System.out.println("Qual o turno? ");
        String turno = entrada.nextLine();

        Classroom a1 = new Classroom(anoLetivo, codigo, nome, quantidade, turno);

        a1.comecarAula();
        a1.fazerExercicio();
        a1.terminarAula();

        entrada.close();
    }
}
