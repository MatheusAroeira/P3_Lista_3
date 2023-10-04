package Question1;

public class ContaBancaria {

    private String nomeTitular, numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}