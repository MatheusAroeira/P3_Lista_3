
import java.util.Scanner;

public class question8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número: ");
            numbers[i] = scan.nextDouble();
        }

        // insertion sort
        for (int i = 1; i < numbers.length; i++) {

            double key;

            for (int j = i; j > 0; j--) {

                if (numbers[j] < numbers[j - 1]) {

                    key = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = key;

                }

            }

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        scan.close();

    }

}
