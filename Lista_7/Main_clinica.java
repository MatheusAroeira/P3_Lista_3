package Lista_7;

import java.util.Random;
import java.util.Scanner;

public class Main_clinica {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random geradorCodigo = new Random();

        String nome, codigo, sexo, especialidade, dataNascimento, alergia, tipoSanguineo, planoSaude, rua, numero,
                bairro, cidade, uf, cep, complemento;

        Paciente[] paciente;
        Medico[] medico;
        Endereco endereco;
        int op;

        System.out.println(
                "Cadastrar um paciente (1)\nEditar um paciente (2)\nExcluir um paciente (3)\nCadastrar um Médico (4)\nEditar um médico (5)\nExcluir um médico(6)\nSair(0)");

        System.out.print("Escolha: ");
        op = scan.nextInt();

        do {

            switch (op) {
                case 1:


                    break;

                default:
                    break;
            }

        } while (op != 0);

    }

}