package aula06;

public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menuAberto;

    // Métodos Especiais
    public ControleRemoto() {
        this.setVolume(5);
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getMenuAberto() {
        return menuAberto;
    }

    public void setMenuAberto(boolean menuAberto) {
        this.menuAberto = menuAberto;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            this.setMenuAberto(true);
            System.out.println("\nLigado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("\nVolume: " + this.getVolume());
            if(this.getVolume() != 0) {
                for (int barra = 0; barra <= this.getVolume(); barra++){
                    System.out.print(" | ");
                }
            }
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getMenuAberto()) {
            this.setMenuAberto(false);
            System.out.println("Fechando o menu... ");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() < 10) {
                this.setVolume(this.getVolume() + 1);
                System.out.print("\nVolume: " + this.getVolume());
                for (int v = 0; v <= this.getVolume(); v++) {
                    System.out.print(" | ");
                }
            } else {
                System.out.println("Volume máximo atingido!");
            }
        }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 1);
                System.out.print("\nVolume: " + this.getVolume());
                for (int v = 0; v < this.getVolume(); v++) {
                    System.out.print(" | ");
                }
            } else {
                System.out.println("Volume mínimo atingido!");
            }
        }

    @Override
    public void ligarMudo() {
        if(this.getLigado()) {
            this.setVolume(0);
            System.out.println("Volume: " + this.getVolume());
            System.out.println("Volume mínimo atingido");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) {
                this.setVolume(5);
                System.out.print("Volume: " + this.getVolume());
                for (int v = 0; v < this.getVolume(); v++) {
                    System.out.print(" | ");
                }
            }
        }


    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.println("\nEstou tocando!!!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("\nPausado.");
        }

    }
}
