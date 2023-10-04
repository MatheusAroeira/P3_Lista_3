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
        if (this.stackCaixa.isEmpty()) {
            this.stackCaixa.add(caixa);
            this.topIndex++;
            return true;
        } else if (this.alturaAtual() + caixa.getAltura() <= this.alturaMaxima) {
            this.stackCaixa.add(caixa);
            this.topIndex++;
            return true;
        } else if (this.stackCaixa.get(this.topIndex).getPesoMaxSuportado() <= caixa.getPeso()) {
            this.stackCaixa.add(caixa);
            this.topIndex++;
            return true;
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
        if(this.isEmpty()){
            return "Pilha vazia";
        }
        
        for (int i = this.topIndex; i >= 0; i--) {
            
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
