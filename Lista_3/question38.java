package Lista_3;

import java.util.Scanner;

public class question38 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3, eq;

        System.out.print("Digite um número: ");
        num1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        num2 = scan.nextInt();

        System.out.print("Digite mais um número: ");
        num3 = scan.nextInt();

        eq = (num1 + num2) * num3;

        System.out.println("O resultado da conta é: " + eq);

        scan.close();

    }

}
