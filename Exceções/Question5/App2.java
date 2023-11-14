package Question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws DimensoesInvalidasException {

        Scanner scan = new Scanner(System.in);
        int lA, lB, lC;

        try {
            System.out.print("Digite os 3 lados: ");
            lA = scan.nextInt();
            lB = scan.nextInt();
            lC = scan.nextInt();
            Triangulo t = new Triangulo(lA, lB, lC);
            System.out.printf("Triângulo %d, %d, %d criado com sucesso", lA, lB, lC);

        } catch (DimensoesInvalidasException e) {
            System.out.println("Os lados escolhidos não satisfazem a condição de existência de um triângulo!");
        } catch (InputMismatchException e) {
            System.out.print("As entradas devem ser apenas números!");
        }

        scan.close();

    }
}
