package Lista_7;

public class Main_clinica {

    public static void main(String[] args) {

        Paciente pas = new Paciente("123456", "Matheus", "14/09/1999", "Masculino", "O+", "987.65432-1");
        System.out.println(pas);

        pas.setNome("Adalberto");
        pas.setDataNascimento("16/09/1966");
        pas.setPlanoSaude("571.57598-3");
        pas.setCodigo("987654321");
        pas.setAlergia("Amendoim");

        System.out.println("\n" + pas);

        Endereco end = new Endereco("Rua Palma", "50", "Camaragibe", "Recife", "PE", "78564-650");
        Medico med = new Medico("Ricardo", "171865", "Masculino", "Cirurgião", end);

        System.out.println("\n" + med);

        med.setNome("Jessica");
        med.setSexo("Feminino");
        med.setEspecialidade("Ortopedista");
        end.setRua("Rua Santa Maria");
        end.setNumero("273");
        end.setBairro("Afogados");
        end.setComplemento("Apto 304 A");

        System.out.println("\n" + med);

    }

}