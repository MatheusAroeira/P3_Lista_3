package Lista_3;

import java.util.Scanner;

public class question35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idadeAno, idadeMes, idadeDia;

        System.out.println("Digite sua idade: ");
        idadeAno = scan.nextInt();

        idadeMes = idadeAno * 12;

        idadeDia = idadeAno * 365;

        System.out.println("Sua idade em anos: " + idadeAno);
        System.out.println("Sua idade em meses: " + idadeMes);
        System.out.println("Sua idade em dias: " + idadeDia);

        scan.close();

    }

}
