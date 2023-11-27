public abstract class ItemBiblioteca {

    private String titulo;
    private int ano, numCopias, diasAtraso;
    private Data dataEmprestimo, dataDevolucao, dataLimiteDevolucao;

    public abstract double calcularMulta(int diasAtraso);

    public ItemBiblioteca(String titulo, int ano, int numCopias) {
        this.titulo = titulo;
        this.ano = ano;
        this.numCopias = numCopias;
    }

    public void fazerEmprestimo(Data data) {
        numCopias--;
        this.dataEmprestimo = data;
        data.setDia(data.getDia() + 7);
        this.dataLimiteDevolucao = data;
        
    }

    public void fazerDevolucao(Data data) {
        numCopias++;
        this.dataDevolucao = data;
    }

    public int calculDiasAtraso() {
        int dias, meses;

        dias = this.dataDevolucao.getDia() - this.dataLimiteDevolucao.getDia();
        meses = this.dataDevolucao.getMes() - this.dataLimiteDevolucao.getMes();

        meses *= 30;

        return dias + meses;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public Data getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Data dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.numCopias + "copias";
    }

    public Data getDataLimiteDevolucao() {
        return dataLimiteDevolucao;
    }

    public void setDataLimiteDevolucao(Data dataLimiteDevolucao) {
        this.dataLimiteDevolucao = dataLimiteDevolucao;
    }

}