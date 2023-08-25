import java.util.Scanner;

public class question7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char ch;

        System.out.print("Digite uma letra: ");
        ch = scan.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':

                System.out.println("vogal");
                break;

            case 'e':

                System.out.println("vogal");
                break;

            case 'i':

                System.out.println("vogal");
                break;

            case 'o':

                System.out.println("vogal");
                break;

            case 'u':

                System.out.println("vogal");
                break;

            default:
                System.out.println("consoante");
                break;
        }

        scan.close();

    }

}
