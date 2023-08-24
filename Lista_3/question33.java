package Lista_3;

import java.util.Scanner;

public class question33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base, altura, perimeter;

        System.out.print("Digite a base: ");
        base = scan.nextInt();

        System.out.print("Digite a altura: ");
        altura = scan.nextInt();

        perimeter = (base + altura) * 2;

        System.out.println("O perímetro é: " + perimeter);

        scan.close();

    }

}
