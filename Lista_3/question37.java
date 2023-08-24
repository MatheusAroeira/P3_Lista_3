package Lista_3;

import java.util.Scanner;
import java.lang.Math;

public class question37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num;
        int numArredondado;

        System.out.print("Digite um número decimal: ");
        num = scan.nextDouble();

        numArredondado = (int) Math.round(num);

        System.out.println("O número arredondado é: " + numArredondado);

        scan.close();

    }

}
