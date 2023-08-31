package Lista_7;

public class Endereco {

    private String rua, numero, bairro, cidade, uf, cep;
    private String complemento = "Não consta";

    public Endereco(String rua, String numero, String bairro, String cidade, String uf, String cep,
            String complemento) {

        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.complemento = complemento;

    }

    public Endereco(String rua, String numero, String bairro, String cidade, String uf, String cep) {

        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;

    }

    public Endereco() {

    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        if (this.complemento.equals("Não consta")) {
            return "Rua " + this.rua + ", " + this.numero + ", " + this.bairro + ", " + this.cidade + " - " + this.uf
                    + ", " + this.cep;
        }
        return "Rua " + this.rua + ", " + this.numero + " " + this.complemento + " ," + this.bairro + ", " + this.cidade
                + " - " + this.uf + ", " + this.cep;

    }

}
