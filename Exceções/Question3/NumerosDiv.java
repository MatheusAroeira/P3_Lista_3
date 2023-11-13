package Question3;

public class NumerosDiv {

    private int n1, n2;

    public NumerosDiv(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double dividir(){
        int divisao ;
        
        try {
            divisao = this.n1/this.n2;
            return divisao;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Impossivel dividir por zero!");
        }
    }

    public int getN1() {
        return this.n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return this.n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
}
