package Lista_3;

import java.util.Scanner;

public class question7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, sobrenome, nomeCompleto;

        System.out.print("Seu nome: ");
        nome = scan.next();

        System.out.print("Seu sobrenome: ");
        sobrenome = scan.next();

        nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto + " é seu nome completo");

        scan.close();

    }

}
