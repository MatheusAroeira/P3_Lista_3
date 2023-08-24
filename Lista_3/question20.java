package Lista_3;

import java.util.Scanner;

public class question20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextDouble();

        System.out.println(num1 % num2);

        scan.close();

    }

}
