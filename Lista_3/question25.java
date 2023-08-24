package Lista_3;

import java.util.Scanner;

public class question25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.print("Digite o seu ano de nascimento: ");
        ano = scan.nextInt();

        System.out.printf("Bem-vindo ao nosso programa, nascido em %d!", ano);

        scan.close();

    }

}
