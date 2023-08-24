package Lista_3;

import java.util.Scanner;

public class question31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double base, altura, areaTriangle;

        System.out.print("Digite a base do triângulo: ");
        base = scan.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        altura = scan.nextDouble();

        areaTriangle = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + areaTriangle);

        scan.close();

    }

}
