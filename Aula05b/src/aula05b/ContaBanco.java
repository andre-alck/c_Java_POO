package aula05b;

public final class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            this.setSaldo(50);
        } else {
            if (t.equals("CP")) {
                this.setSaldo(150);
            }
        }
    }

    public void fecharConta() {
        if (this.getSaldo() != 0) {
            if (this.getSaldo() > 50) {
                System.out.println("Conta não vazia.");
            } else {
                if (this.getSaldo() < 0) {
                    System.out.println("Conta em débito.");
                }
            }
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada.");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Impossível depositar.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() && this.getSaldo() >= v) {
            this.setSaldo(getSaldo() - v);
        } else {
            System.out.println("Impossível sacar valor.");
        }
    }

    public void pagarMensal() {
        if (this.getStatus()) {
            if ("CC".equals(this.getTipo())) {
                this.setSaldo(this.getSaldo() - 12);
            } else {
                if ("CP".equals(this.getTipo())) {
                    this.setSaldo(this.getSaldo() - 20);
                }
            }
        }
    }
}