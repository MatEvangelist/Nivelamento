package oo.heranca.desafio;

public interface Luxo {

    public abstract void ligarAr();
    public abstract void desligarAr();
    default int nivelDoAr() {
        return 1;
    }
}
