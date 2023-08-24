package Lista_3;

import java.util.Scanner;

public class question36 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorReais, cotacaoDolar;

        System.out.print("Digite um valor em Reais: ");
        valorReais = scan.nextDouble();

        System.out.print("Digite a cotação atual do Dólar: ");
        cotacaoDolar = scan.nextDouble();

        System.out.println("R$" + valorReais + " convertido em Dólar: U$" + (valorReais * cotacaoDolar));

        scan.close();

    }

}
