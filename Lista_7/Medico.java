package Lista_7;

public class Medico {

    private String nome, codigo, sexo, especialidade;
    private Endereco endereco;

    public Medico(String nome, String codigo, String sexo, String especialidade, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {

        if(this.sexo.toLowerCase.equals("masculino")) {
            return "Dr. " + this.nome + " ," + this.especialidade + " - " + this.codigo + " - " + this.endereco.toString;
        }
        return "Dra. " + this.nome + " ," + this.especialidade + " - " + this.codigo + " - " + this.endereco.toString;

    }

}
