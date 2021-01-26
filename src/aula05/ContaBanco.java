package aula05;

public class ContaBanco {

    // Atributos //
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Construtor //
    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    ///////////////////////////////////////
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    ///////////////////////////////////////
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    ///////////////////////////////////////
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    ///////////////////////////////////////
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    ///////////////////////////////////////
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    ///////////////////////////////////////
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            System.out.println("Você abriu uma conta corrente e ganhou R$50,00.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            System.out.println("Você abriu uma conta poupança.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
            this.setSaldo(150);
        } else {
            System.out.println("ERRO!!");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Retire o seu dinheiro para fechar a conta.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você tem saldo devedor, quite suas dívidas para fechar a conta.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada! ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }

    public void depositar (double valor) {
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Depósito de %.2f na conta de %s.\n", valor, this.getDono());
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        } else {
            System.out.println("Erro! A conta está fechada... ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }

    public void sacar(double valor) {
        if(this.getStatus()) {
            if(this.getSaldo() >= 0) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.printf("Saque de %.2f da conta de %s.\n", valor, this.getDono());
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
            } else {
                System.out.println("Saque excede o saldo.");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
            }
        } else {
            System.out.println("Erro! A conta está fechada... ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }

    public void pagarMensal() {
        if(this.getStatus()) {
            if(this.getTipo() == "CP") {
                if (this.getSaldo() >= 0) {
                    this.setSaldo(this.getSaldo() - 20);
                    System.out.println("Taxa mensal de R$20,00 da conta poupança foi debitada.");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                } else {
                    System.out.println("Pagamento inválido! Adicione mais fundos a sua conta para realizá-lo.");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            } else if (this.getTipo() == "CC") {
                if (this.getSaldo() >= 0) {
                    this.setSaldo(this.getSaldo() - 12);
                    System.out.println("Taxa mensal de R$12,00 da conta corrente foi debitada.");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                } else {
                    System.out.println("Pagamento inválido! Adicione mais fundos a sua conta para realizá-lo.");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
            } else {
                System.out.println("Erro! Tipo inexistente.");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
            }
        } else {
            System.out.println("Erro! A conta está fechada... ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }

    public void status() {
        System.out.println("Dono: " + this.getDono() );
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo() );
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}



