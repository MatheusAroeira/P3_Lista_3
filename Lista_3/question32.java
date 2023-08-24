package Lista_3;

import java.util.Scanner;
import java.lang.Math;

public class question32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio, perimeter;

        System.out.print("Digite o valor do raio: ");
        raio = scan.nextDouble();

        perimeter = 2 * Math.PI * raio;

        System.out.println("O perímetro é: " + perimeter);

        scan.close();

    }

}
