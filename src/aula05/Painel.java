package aula05;

public class Painel {
    public static void main(String[] args) {

        ContaBanco cb1 = new ContaBanco();
        cb1.setDono("Mathews Pereira Evangelsita");
        cb1.setNumConta(12345);
        cb1.abrirConta("CC");
        cb1.status();

        ContaBanco cb2 = new ContaBanco();
        cb2.setDono("Marilene Pereira dos Santos");
        cb2.setNumConta(54321);
        cb2.abrirConta("CP");
        cb2.status();

        cb2.depositar(100);
        cb2.status();
        cb2.fecharConta();

        cb2.pagarMensal();
        cb2.status();

        cb2.sacar(200);
        cb2.fecharConta();

        cb2.sacar(30);
        cb2.status();
        cb2.fecharConta();

    }
}
