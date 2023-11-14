package Question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int a, b;
        try {
            System.out.print("Digite dois números: ");
            a = scan.nextInt();
            b = scan.nextInt();

            NumerosDiv nd = new NumerosDiv(a, b);
            System.out.println(nd.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero!");
        } catch (InputMismatchException e) {
            System.out.println("As entradas devem ser números!");
        }

        scan.close();

    }

}
