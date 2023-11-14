package Question3;

public class NumerosDiv extends Exception {

    private int n1, n2;

    public NumerosDiv(Integer n1, Integer n2) throws Exception {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double dividir() {
        try {
            return this.n1 / this.n2;
        } catch (Exception e) {
            throw new ArithmeticException("Divisão por zero");
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
