package Lista_7;

public class Main_q1 {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("51651-65", "João", "14/05/1996", "Masculino");

        System.out.println(p1.getCodigo());
        System.out.println(p1.getNome());
        System.out.println(p1.getDataNascimento());
        System.out.println(p1.getSexo());
        System.out.println(p1.getPlanoSaude());
        System.out.println(p1.getAlergia());
        System.out.println(p1.getTipoSanguineo());

        p1.setAlergia("Amendoim");
        p1.setTipoSanguineo("O+");
        p1.setPlanoSaude("123.456.000-714.1");

        System.out.println(p1);

    }

}