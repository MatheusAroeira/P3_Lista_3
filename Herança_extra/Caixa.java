
public class Caixa {

    private String id, conteudo;
    private double peso, altura;

    public Caixa(String id, String conteudo, double peso, double altura) {
        this.id = id;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String exibirEtiqueta() {
        return "Caixa [id = " + this.id + ", conteudo =" + this.conteudo + ", peso = " + this.peso + "kg, altura = "
                + this.altura + "cm]";
    }

}