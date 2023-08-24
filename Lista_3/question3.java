package Lista_3;

import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numInt;
        float numFloat;

        System.out.print("Digite um npumero inteiro: ");
        numInt = scan.nextInt();

        numFloat = (float) numInt;

        System.out.println("Numero convertido em float: " + numFloat);

        scan.close();

    }

}
