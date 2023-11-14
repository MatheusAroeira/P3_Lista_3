package Question6;

public class ContaCorrente {
    
    private double saldo;
    private int numeroDaConta;

    public ContaCorrente(int numeroDaConta, double saldo) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor < saldo && valor > 0){
            this.saldo -= valor;
            System.out.printf("R$%.2f sacado, novo saldo R$%.2f", valor, saldo);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    
    
}
