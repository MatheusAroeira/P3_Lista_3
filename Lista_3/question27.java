package Lista_3;

import java.util.Scanner;

public class question27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String produto;
        double preco;

        System.out.print("Digite o nome do produto: ");
        produto = scan.nextLine();

        System.out.print("Digite o preço do produto: ");
        preco = scan.nextDouble();

        System.out.println("Produto: " + produto + "\nPreço: R$" + preco);

        scan.close();

    }

}
