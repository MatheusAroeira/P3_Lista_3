package Lista_3;

import java.util.Scanner;

public class question26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        String string;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        System.out.print("Digite algo: ");
        string = scan.next();

        System.out.println(num + " " + string);

        scan.close();

    }

}
