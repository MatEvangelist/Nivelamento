package aula012;

public class Cachorro extends Lobo {

    public void enterrarOsso() {
        System.out.println("Enterrando o osso.");

    }

    public void abanarRabo() {
        System.out.println("Abanando o rabinho.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }
}
