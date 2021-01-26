package aula04;

public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    ///////////////////////////////////////


    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampar();
    }
    ///////////////////////////////////////

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    ///////////////////////////////////////

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    ///////////////////////////////////////

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    ///////////////////////////////////////

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    ///////////////////////////////////////

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
    ///////////////////////////////////////

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("modelo: " + this.getModelo());
        System.out.println("ponta: " + this.getPonta());
        System.out.println("cor: " + this.getCor());
        System.out.println("está destampada? " + this.getTampada());
    }

}
