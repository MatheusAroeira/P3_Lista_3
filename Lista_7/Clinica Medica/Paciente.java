package Lista_7;

public class Paciente {

    private String codigo, nome, dataNascimento, sexo, alergia, planoSaude, tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, String sexo, String tipoSanguineo,
            String alergia, String planoSaude) {

        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.alergia = alergia;
        this.planoSaude = planoSaude;

    }

    public Paciente(String codigo, String nome, String dataNascimento, String sexo, String tipoSanguineo,
            String planoSaude) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.planoSaude = planoSaude;
        this.alergia = "Não Consta";

    }

    // metodos acessadores

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    // metodos modificadores

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Paciente " + this.codigo + "\nNome: " + this.nome + "\nData de Nascimento: " + this.dataNascimento
                + "\nSexo: " + this.sexo + "\nPlano de Saúde: " + this.planoSaude + "\nAlergias: " + this.alergia
                + "\nTipo de Sanguíneo: " + this.tipoSanguineo;
    }

}