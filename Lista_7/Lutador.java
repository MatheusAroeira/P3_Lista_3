public class Lutador {

    private String nome;
    private int energia, forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.forca = forca;
        this.energia = energia;

    }

    public void aplicarGolpe(Lutador oponente) {
        oponente.reduzirEnergia(this.forca);
    }

    public void reduzirEnergia(int forca) {
        this.energia -= forca;
    }

    public int getEnergia() {
        return energia;
    }

    public int getForca() {
        return forca;
    }

    public String getNome() {
        return nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
