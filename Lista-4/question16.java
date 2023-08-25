import java.util.Scanner;
import java.lang.Math;

public class question16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;

        try {
            System.out.print("Digite um número: ");
            numero = scan.nextDouble();
            System.out.println((int) Math.round(numero));
        } catch (Exception e) {
            System.out.println("Entrada Inválida!!");
        }

        scan.close();

    }

}
