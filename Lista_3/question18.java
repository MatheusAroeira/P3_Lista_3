import java.util.Scanner;

public class question18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite a base: ");
        base = scan.nextInt();

        System.out.println("Digite a altura: ");
        altura = scan.nextInt();

        area = (base * altura);

        System.out.println("A área do retangulo é: " + area);

        scan.close();

    }
}
