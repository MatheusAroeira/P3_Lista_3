package Lista_3;

import java.util.Scanner;
import java.lang.Math;

public class question5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float num;
        double squareNum;

        System.out.print("Digite num número: ");
        num = scan.nextFloat();

        squareNum = Math.pow(num, 2);

        System.out.println("O quadrado do numero é " + squareNum);

        scan.close();

    }

}
