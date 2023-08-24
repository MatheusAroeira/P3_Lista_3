package Lista_3;

import java.util.Scanner;

public class question10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, sobrenome;

        System.out.print("Digite seu nome: ");
        nome = scan.next();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scan.next();

        System.out.println(sobrenome + " " + nome);

        scan.close();

    }

}
