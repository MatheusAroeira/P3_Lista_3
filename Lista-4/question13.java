import java.util.Scanner;

public class question13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String diaSemana;

        System.out.print("Digite um dia da semana: ");
        diaSemana = scan.nextLine();

        if (diaSemana.toLowerCase().equals("sabado") || diaSemana.toLowerCase().equals("domingo")) {
            System.out.println(diaSemana + " é final de semana");
        } else {
            System.out.println(diaSemana + " não é final de semana");
        }

        scan.close();

    }

}
