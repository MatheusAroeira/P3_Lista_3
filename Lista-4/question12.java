import java.util.Scanner;

public class question12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("O número " + num + " é divisível por 3 e por 5 ao mesmo tempo");
        } else {
            System.out.println("O número " + num + " não é divisível por 3 e por 5 ao memso tempo");
        }

        scan.close();
    }

}
