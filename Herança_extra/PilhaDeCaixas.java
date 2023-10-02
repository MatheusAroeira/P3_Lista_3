public class PilhaDeCaixas {

    private double alturaMaxima;
    private Caixa[] stackCaixa;
    private int topIndex;

    public PilhaDeCaixas(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        this.stackCaixa = new Caixa[100];
        this.topIndex = 0;
    }

    public void push(Caixa caixa){



    }

    public boolean isEmpty(){
        return this.topIndex == 0;
    }

    public boolean isFull(){
        return this.topIndex == this.stackCaixa.length;
    }

    

    

    
    
}
