package Lista_3;

import java.util.Scanner;

public class question34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, num3, media;

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = scan.nextDouble();

        media = (num1 + num2 + num3) / 3;

        System.out.println("A média é: " + media);

        scan.close();

    }

}
