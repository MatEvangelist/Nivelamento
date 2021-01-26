package aula012;

public class Aula011 {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3);
        m.setMembros(4);
        m.setIdade(2);
        m.locomover(); // Correndo
        m.alimentar();
        m.emitirSom();

        System.out.println("////////////////////////////");

        Canguru can = new Canguru();
        can.setPeso(55.30);
        can.setIdade(3);
        can.setMembros(4);
        can.locomover(); // Saltando
        can.alimentar();
        can.emitirSom();
        can.usarBolsa();

        System.out.println("////////////////////////////");

        Cachorro k = new Cachorro();
        k.setIdade(5);
        k.setMembros(4);
        k.setPeso(3.94);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();

        System.out.println("////////////////////////////");

        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        System.out.println("////////////////////////////");

        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        System.out.println("////////////////////////////");




    }
}
