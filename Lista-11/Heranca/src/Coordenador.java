public class Coordenador extends Funcionario {


    @Override
    public String funcaoDesempenhar() {
        return "Coordenanor";
    }

    public void auxiliarProfessores(String nome){
        System.out.println("Horário com o professor " + nome + " marcado com sucesso!");
    }

    public void organizarFestivais(String nome, String data){
        System.out.println("O festival " + nome + " está agendado para o dia " + data);
    }

}
