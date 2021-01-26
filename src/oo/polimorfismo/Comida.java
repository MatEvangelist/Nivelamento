package oo.polimorfismo;

public abstract class Comida {

    private double peso;

    public Comida(double pesoComida) {
        setPeso(pesoComida);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pesoComida) {
        if (pesoComida >= 0) {
            this.peso = pesoComida;
        }
    }
}
