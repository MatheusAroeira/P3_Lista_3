package Lista_3;

import java.util.Scanner;
import java.lang.Math;

public class question14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        num2 = input.nextInt();

        System.out.println(Math.max(num1, num2) + " é o maior");

        input.close();

    }

}
