package Lista_3;

import java.util.Scanner;

public class question24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cidade, estado;

        System.out.print("Digite o nome da cidade: ");
        cidade = scan.nextLine();

        System.out.print("Digite o nome do estado: ");
        estado = scan.nextLine();

        System.out.println("Você mora em " + cidade + ", " + estado);

        scan.close();

    }

}
