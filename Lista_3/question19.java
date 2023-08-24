import java.util.Scanner;

public class question19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cidade;

        char[] cidadeArrayChar;

        System.out.println("Digite a cidade: ");
        cidade = scan.nextLine();

        cidadeArrayChar = cidade.toUpperCase().toCharArray();

        if (cidadeArrayChar[0] == 'S') {
            System.out.println("O nome da cidade começa com S");
        }

        scan.close();

    }

}
