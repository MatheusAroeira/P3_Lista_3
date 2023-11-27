public class Cliente {

    private String nome, endereco, profissao;

    public Cliente(String nome, String endereco, String profissao) {
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public void exibirAtributos(){
        System.out.printf("Nome: %S \n Endreco: %S \n Profissão: %S");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
}