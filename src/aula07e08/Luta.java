package aula07e08;

import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) &&
        l1 != l2) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("----- DESAFIADO -----");
            this.desafiado.apresentar();

            System.out.println("----- DESAFIANTE -----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1 e 2
            System.out.println("------------------------------------------");
            System.out.println("----- RESULTADO -----");
            switch (vencedor) { // escolha
                case 0: // empate
                    System.out.println("------------------------------------------");
                    System.out.println("A luta finalizou em empate!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("------------------------------------------");
                    System.out.println("A luta finalizou com a vitória do desafiante " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println("A luta finalizou com a vitória do desafiado " + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
        } else {
            System.out.println("------------------------------------------");
            System.out.println("A luta não pode acontecer!!!!");
        }
    }

    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
