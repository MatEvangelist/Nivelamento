package aulonaLindona03.aplicacao;

import aulonaLindona03.entidades.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        List<Empregado> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos empregados deseja registrar? ");
        int qtdeRegistrados = scanner.nextInt();
        System.out.println("");

        for(int i = 0; i < qtdeRegistrados; i++) {
            System.out.println("Empregado #" + (i + 1) + ":");
            Empregado empregado = new Empregado();

            System.out.print("Id: ");
            empregado.setId(scanner.nextInt());

            System.out.print("Name: ");
            scanner.nextLine();
            empregado.setName(scanner.nextLine());

            System.out.print("Salário: ");
            empregado.setSalary(scanner.nextDouble());

            lista.add(empregado);
            System.out.println("----------------------");
        }


        System.out.println("Lista de empregados: ");
        for (Empregado emp: lista) {
            System.out.println(emp);
        }

        System.out.println("");
        System.out.println("Digite o id do empregado que terá um aumento: ");
        int idAumento = scanner.nextInt();

        for (Empregado empregado : lista) {
            if (empregado.getId() == idAumento) {
                System.out.println("Usuário encontrado, deseja incrementar um aumento de quanto: ");
                double porcentagem = scanner.nextDouble();
                empregado.aumentarSalario(porcentagem);
                System.out.println(empregado.getSalary());
            } else {
                System.out.println("Usuário não encontrado");
            }
        }


    }
}
