public class Professor extends Funcionario {

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String funcaoDesempenhar() {
        return "Professor";
    }

    public void lecionar(){
        
    }

    public void criarAtividade(){
        System.out.println("Atividade criada!!");
    }
    
}
