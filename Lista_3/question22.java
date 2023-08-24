package Lista_3;

import java.util.Scanner;

public class question22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s;
        Integer sInt;

        System.out.print("Digite um número: ");
        s = scan.nextLine();

        sInt = Integer.parseInt(s) + 10;

        System.out.println(sInt.toString());

        scan.close();

    }

}
