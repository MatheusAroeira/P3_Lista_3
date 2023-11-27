package Question2;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {

    public static void main(String[] args) {

        HashSet<String> listaCPF = new HashSet<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o CPF: ");
            String aux = scan.next();
            listaCPF.add(aux);
        }

        for (int i = 0; i < listaCPF.size(); i++) {
            System.out.println(listaCPF.toArray()[i]);
        }

        scan.close();

    }

}
