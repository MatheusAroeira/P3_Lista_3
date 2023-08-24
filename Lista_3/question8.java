package Lista_3;

import java.util.Scanner;

public class question8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String num = scan.nextLine();

        System.out.println("você digitou " + num.split(" ").length + " numeros");

        scan.close();

    }

}
