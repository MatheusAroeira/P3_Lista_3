package Lista_3;

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;

        // solicita nome
        System.out.print("Digite seu nome: ");
        nome = scan.next();

        System.out.println("Seja Bem-Vindo " + nome + "!!!!");

        scan.close();

    }

}