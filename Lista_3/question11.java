package Lista_3;

import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String string = scan.next();

        System.out.println("A palavra tem " + string.length() + " caracteres");

        scan.close();

    }

}
