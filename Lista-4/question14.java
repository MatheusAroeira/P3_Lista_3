import java.util.Scanner;

public class question14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Muito Bom");
                break;
            case 2:
                System.out.println("Bom");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Muito Insuficiente");
                break;
            default:
                System.out.println("Valor inválido");
        }

        scan.close();

    }

}
