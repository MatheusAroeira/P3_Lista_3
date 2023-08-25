import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario;

        System.out.print("Digite o seu salário: ");
        salario = scan.nextDouble();

        if (salario > 1500) {
            System.out.println("Aumento de: R$" + 0.1 * salario + "\nSalário Final: " + salario + (0.1 * salario));
        } else {
            System.out.println("Aumento de: R$" + 0.15 * salario + "\nSalário Final: " + salario + (0.15 * salario));
        }

        scan.close();

    }

}
