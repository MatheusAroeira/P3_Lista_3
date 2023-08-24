package Lista_3;

import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();

        soma = num1 + num2;

        System.out.println("A soma é " + soma);

        scan.close();
    }

}
