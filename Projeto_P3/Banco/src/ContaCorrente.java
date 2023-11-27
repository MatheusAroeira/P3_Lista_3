public class ContaCorrente extends Conta {

    private int taxaManutencao;

    public ContaCorrente(int numAgencia, int numConta, double saldo, Cliente cliente) {
        super(numAgencia, numConta, saldo, cliente);
        this.taxaManutencao = 50;
    }
    public ContaCorrente(int numAgencia, int numConta, Cliente cliente) {
        super(numAgencia, numConta, cliente);
        this.taxaManutencao = 50;
    }

    public double simularOperacao(int meses){
        return this.getSaldo() - (meses * this.taxaManutencao);
    }
    
}
