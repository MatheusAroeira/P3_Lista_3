package Lista_3;

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String idade;
        Integer idadeInt;

        System.out.print("Digite sua idade: ");
        idade = scan.next();

        idadeInt = Integer.parseInt(idade);

        System.out.println("sua idade em inteiro: " + idadeInt);

        scan.close();

    }

}
