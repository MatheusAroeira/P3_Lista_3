package Lista_3;

import java.util.Scanner;

public class question15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite seu peso: ");
        peso = scan.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("seu IMC é: %.1f", imc);

        scan.close();

    }

}
