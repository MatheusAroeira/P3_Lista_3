package Lista_3;

import java.util.Scanner;

public class question13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("É positivo");
        } else if (num < 0) {
            System.out.println("É negativo");
        } else {
            System.out.println("É zero");
        }

        scan.close();

    }

}
