package Question2;

public class Carro {

    private String marca, modelo;
    private int anoFabricacao;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar(double velocidadeAdicional){
        this.velocidadeAtual += velocidadeAdicional;
        System.out.println(this.velocidadeAtual + " Km/h");
    }

    public void desacelerar(double velocidadeReduzida){
         if (this.velocidadeAtual - velocidadeReduzida <= 0){
            System.out.println("0 Km/h");
        } else {
            System.out.println(this.velocidadeAtual + " Km/h");
        }
    }

    

}