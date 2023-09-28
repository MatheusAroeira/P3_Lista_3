public abstract class Funcionario {

    private String nome, turno, iscricao;
    private double salario; 

    public void horariosDisponiveis(){

    }

    public void horarioTrabalho(){

    }


    public String informacoesFuncionario() {
        return "Nome: " + this.getNome() + "\nCargo: " + this.funcaoDesempenhar() + "\nInscrição: " + this.getIscricao()
                + "\nTurno: " + this.getTurno() + "\nSalário: " + this.getSalario();
    }

    public abstract String funcaoDesempenhar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getIscricao() {
        return iscricao;
    }

    public void setIscricao(String iscricao) {
        this.iscricao = iscricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 
    
    
}
