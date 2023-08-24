package Lista_3;

import java.util.Scanner;

public class question6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ano, idade, anoAtual;
        anoAtual = 2023;

        System.out.print("Digite seu ano de nascimento: ");
        ano = scan.nextInt();

        idade = anoAtual - ano;

        System.out.println("Você tem " + idade + " anos");

        scan.close();

    }

}
