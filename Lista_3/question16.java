package Lista_3;

import java.util.Scanner;

public class question16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        if (nome.length() > 5) {
            System.out.println("Seu nome tem mais de 5 caracteres");
        } else if (nome.length() < 5) {
            System.out.println("Seu nome tem menos de 5 caracteres");
        } else {
            System.out.println("seu nome tem exatamente 5 caracteres");
        }

        scan.close();

    }

}
