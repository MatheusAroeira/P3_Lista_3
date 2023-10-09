import java.util.ArrayList;

public class PilhaDeCaixas {

    private double alturaMaxima;
    private ArrayList<Caixa> stackCaixa;
    private int topIndex;

    public PilhaDeCaixas(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        this.stackCaixa = new ArrayList<Caixa>();
        this.topIndex = -1;
    }

    public boolean empilhar(Caixa caixa) {
        if (this.stackCaixa.isEmpty()) {  //pilha vazia;
            this.stackCaixa.add(caixa);
            this.topIndex++;
            return true;
        } else if (this.alturaAtual() + caixa.getAltura() <= this.alturaMaxima) {   // altura maxima não atingida;
            if (this.stackCaixa.get(topIndex) instanceof CaixaFragil) {    // a caixa do topo é uma caixa fragil;
                CaixaFragil aux = (CaixaFragil) this.stackCaixa.get(topIndex); // variavel auxiliar do tipo caixa fragil;
                if (aux.getPesoMaxSuportado() >= caixa.getPeso()) {  // o peso da nova caixa é suportado pela caixa fragil do topo;
                    this.stackCaixa.add(caixa);
                    this.topIndex++;
                    return true;
                } else {
                    return false;
                }
            }
            else {
                this.stackCaixa.add(caixa);
                this.topIndex++;
                return true;
            }
        }

        return false;
    }

    public String desempilhar() {
        if (this.isEmpty()) {
            return "Pilha vazia";
        }
        Caixa aux = this.stackCaixa.get(this.topIndex);
        this.stackCaixa.remove(aux);
        return aux.exibirEtiqueta();
    }

    public double alturaAtual() {
        double alturaCaixas = 0;
        for (Caixa c : this.stackCaixa) {
            alturaCaixas += c.getAltura();
        }
        return alturaCaixas;
    }

    public double pesoAtual() {
        double pesoCaixas = 0;
        for (Caixa c : this.stackCaixa) {
            pesoCaixas += c.getPeso();
        }
        return pesoCaixas;
    }

    public String getInfo() {
        String result = "";
        if (this.isEmpty()) {
            return "Pilha vazia";
        }

        result += "Peso Total: " + this.pesoAtual() + "Altura Total: " + this.alturaAtual() + "\n"; 
        
        for (Caixa caixa : this.stackCaixa) {
            result += caixa.exibirEtiqueta() + "\n";
        }


        return result;
    }

    public boolean isEmpty() {
        return this.topIndex == -1;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

}
