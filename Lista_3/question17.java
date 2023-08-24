import java.util.Scanner;

public class question17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String estadoCivil;

        System.out.println("Digite o estado civil: ");
        estadoCivil = scan.nextLine();

        System.out.println("Você é " + estadoCivil);

        scan.close();

    }

}
