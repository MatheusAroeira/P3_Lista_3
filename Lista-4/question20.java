import java.util.Scanner;

public class question20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;

        try {

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Digite seu nome: ");
            nome = scan.next();

            System.out.println("Você digitou valores válidos: " + idade + " " + nome);

        } catch (Exception e) {
            System.out.println("Você digitou valores inválidos");
        }

        scan.close();

    }

}
