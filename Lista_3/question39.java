package Lista_3;

import java.util.Scanner;

public class question39 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempC, tempF;

        System.out.print("Digite a temperatura em °C: ");
        tempC = scan.nextDouble();

        tempF = (tempC * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + tempF + "°F");

        scan.close();

    }

}
