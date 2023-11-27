public class Livro extends ItemBiblioteca {

    private String autor;

    public double calcularMulta(int diasAtraso) {
        double result = 0;

        for (int i = 0; i < diasAtraso; i++) {
            result++;
        }

        return result;
    }

    public Livro(String titulo, int ano, int numCopias, String autor) {
        super(titulo, ano, numCopias);
        this.autor = autor;
    }

    public void fazerEmprestimo(Data data) {
        this.setNumCopias(this.getNumCopias() - 1);
        this.setDataEmprestimo(data);
        data.setDia(data.getMes() + 2);
        this.setDataLimiteDevolucao(data);
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "(Livro)" + super.toString();
    }

    

}
