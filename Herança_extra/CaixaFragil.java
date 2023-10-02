public class CaixaFragil extends Caixa {

    private double pesoMaximoSuportado;

    public CaixaFragil(String id, String conteudo, double peso, double altura) {
        super(id, conteudo, peso, altura);
        this.pesoMaximoSuportado = this.getPeso();
    }

    public double getPesoMaximoSuportado() {
        return pesoMaximoSuportado;
    }

    public String exibirEtiqueta() {
        return "caixa fragil [id = " + this.getId() + ", conteudo = " + this.getConteudo() + ", peso = "
                + this.getPeso() + "kg, altura = " + this.getAltura() + "cm, peso maximo suportado "
                + this.pesoMaximoSuportado + "kg]";
    }

}
