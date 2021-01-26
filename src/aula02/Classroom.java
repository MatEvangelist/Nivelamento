package aula02;

public class Classroom {
    int anoLetivo;
    String codigoSala;
    String nomeProfessor;
    int qtdeAlunos;
    String turno;
    boolean aulaIniciada;

    Classroom(int anoLetivo, String codigoSala, String nomeProfessor,
              int qtdeAlunos, String turno) {
        this.anoLetivo = anoLetivo;
        this.codigoSala = codigoSala;
        this.nomeProfessor = nomeProfessor;
        this.qtdeAlunos = qtdeAlunos;
        this.turno = turno;
    }

    boolean comecarAula () {
        if (this.qtdeAlunos > 0) {
            System.out.println("A aula está começando!");
            return this.aulaIniciada;
        } else {
            System.out.println("Esperando os alunos entrarem na sala... ");
            return !this.aulaIniciada;
        }
    }
    void fazerExercicio() {
        if (this.aulaIniciada) {
            System.out.println("Os alunos estão fazendo os exercícios! ");
        } else {
            System.out.println("Não há alunos na sala de aula para realizar os exercícios.");
        }
    }

    int terminarAula () {
        System.out.println("Aula terminada.");
        return this.qtdeAlunos = 0;
    }
}
