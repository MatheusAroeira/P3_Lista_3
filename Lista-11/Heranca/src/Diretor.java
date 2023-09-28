
public class Diretor extends Funcionario {

    private String segTurno;

    public String getSegTurno() {
        return segTurno;
    }

    public void setSegTurno(String segTurno) {
        this.segTurno = segTurno;
    }

    @Override
    public String funcaoDesempenhar() {
        return "Diretor";
    }

    public void criarDescontos(double valor){
        System.out.println("Desconto de " + valor + 100 + "% criado");
    }

    public void encomendarFardas(){
        System.out.println("Fardas encomendadas!");
    }

    public void gerenciarProfessores(){
        
    }

    

}
