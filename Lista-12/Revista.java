public class Revista extends ItemBiblioteca {

    private int edicao;

    public double calcularMulta(int diasAtraso) {
        double result = 0;

        for (int i = 0; i < diasAtraso; i++) {
            result += 0.5;
        }

        return result;
    }

    public Revista(String titulo, int ano, int numCopias, int edicao) {
        super(titulo, ano, numCopias);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String toString() {
        return "(Revista)" + super.toString();
    }
    
}