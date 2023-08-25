import java.util.Scanner;

public class question17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String idadeString;

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        if (idade > 18) {
            idadeString = "Adulto";
        } else if (idade <= 18 && idade >= 13) {
            idadeString = "Adolescente";
        } else if (idade <= 12 && idade > 1) {
            idadeString = "Criança";
        } else {
            idadeString = "Bebê";
        }

        System.out.println(idadeString);

        scan.close();

    }

}
