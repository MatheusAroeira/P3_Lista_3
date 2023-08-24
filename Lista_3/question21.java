package Lista_3;

import java.util.Scanner;

public class question21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numConverted;

        System.out.print("Digite um número decimal: ");
        double num = scan.nextDouble();

        numConverted = (int) num;

        System.out.println("Número convertido: " + numConverted);

        scan.close();

    }

}