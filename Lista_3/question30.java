package Lista_3;

import java.util.Scanner;

public class question30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, soma, diferenca, produto, quociente;

        System.out.print("Digite um número: ");
        num1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        num2 = scan.nextInt();

        soma = num1 + num2;
        diferenca = num1 - num2;
        produto = num1 * num2;
        quociente = num1 / num2;

        System.out.println("A soma é: " + soma);
        System.out.println("A diferença é: " + diferenca);
        System.out.println("O produto é: " + produto);
        System.out.println("O quociente é: " + quociente);

        scan.close();

    }

}
