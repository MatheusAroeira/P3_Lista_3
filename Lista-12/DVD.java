public class DVD extends ItemBiblioteca {

    private int duracao;

    public double calcularMulta(int diasAtraso) {
        double result = 0;

        for (int i = 0; i < diasAtraso; i++) {
            result += 1.5;
        }

        return result;
    }

    public DVD(String titulo, int ano, int numCopias, int duracao) {
        super(titulo, ano, numCopias);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString() {
        return "(DVD)" + super.toString();
    }

}
