public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numAgencia, int numConta, double saldo, Cliente cliente) {
        super(numAgencia, numConta, saldo, cliente);
        this.taxaRendimento = 0.05;
    }
    public ContaPoupanca(int numAgencia, int numConta, Cliente cliente) {
        super(numAgencia, numConta, cliente);
        this.taxaRendimento = 0.05;
    }

    public double simularOperacao(int meses) {
        return this.getSaldo() + (meses * (this.taxaRendimento * this.getSaldo()));
    }

}
