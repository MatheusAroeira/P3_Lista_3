package Lista_3;

import java.util.Scanner;

public class question29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email;

        System.out.print("Digite seu e-mail: ");
        email = scan.nextLine();

        System.out.println("Obrigado dono do endereço de email " + email + "!!!");

        scan.close();

    }

}
