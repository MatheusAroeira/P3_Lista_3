public abstract class Conta {

    private int numAgencia, numConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numAgencia, int numConta, double saldo, Cliente cliente) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Conta(int numAgencia, int numConta, Cliente cliente) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public void deposito(double value) {
        this.saldo += value;
    }
    public abstract double simularOperacao(int meses);

    public void saque(double value) throws SaldoInvalidoException {
        if (this.saldo < value) {
            throw new SaldoInvalidoException("Saldo Insuficiente");
        } else {
            this.saldo -= value;
        }
    }

    public void transferencia(Conta contaAlvo, double value) throws SaldoInvalidoException {
        if (this.saldo < value) {
            throw new SaldoInvalidoException("Saldo Insuficiente");
        } else {
            contaAlvo.saldo += value;
            this.saldo -= value;
        }
    }

    public void exibirSaldo(){
        System.out.printf("Nome: %S   Saldo: R$%.2f");
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
