public class Secretario extends Funcionario {

    @Override
    public String funcaoDesempenhar() {
        return "Secretário";
    }

    public void receberEnconmendas(String encomenda){
        System.out.println("Recebimento da encomenda" + encomenda + "registrada com sucesso!");
    }

    public void receberPagamentos(double valor, String nome, String tipo){
        System.out.printf("Pagamento de %2f, efetuada por %s, referente a(o) %s", valor, nome, tipo);
    }

}
