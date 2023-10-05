public class CaixaFragil extends Caixa {

    private double pesoMaxSuportado;

    public CaixaFragil(String id, String conteudo, double peso, double altura, double pesoMaxSuportado) {
        super(id, conteudo, peso, altura);
        this.pesoMaxSuportado = this.getPeso();
    }

    public double getPesoMaximoSuportado() {
        return pesoMaxSuportado;
    }

    public String exibirEtiqueta() {
        return "caixa fragil [id = " + this.getId() + ", conteudo = " + this.getConteudo() + ", peso = "
                + this.getPeso() + "kg, altura = " + this.getAltura() + "cm, peso maximo suportado "
                + this.pesoMaxSuportado + "kg]";
    }

}
