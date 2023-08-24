package Lista_3;

import java.util.Scanner;

public class question12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }

        scan.close();

    }

}
