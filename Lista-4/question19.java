import java.util.Scanner;

public class question19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int op, num1, num2;

        System.out.println("(1)soma\n(2)subtração\n(3)multiplicação\n(4)divisão");
        System.out.print("Escolha uma operação: ");
        op = scan.nextInt();

        System.out.print("Insira dois números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scan.close();

    }

}
