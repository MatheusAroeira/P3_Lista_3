import java.util.Scanner;

public class question6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nome1, nome2;

        System.out.print("Digite o primeiro nome: ");
        nome1 = scan.nextLine();

        System.out.print("Digite o segundo nome: ");
        nome2 = scan.nextLine();

        if(nome1.length() > nome2.length()){
            System.out.println(nome1.toUpperCase() + " é o maior nome");
        } else {
            System.out.println(nome2.toUpperCase() + " é o maior nome");
        }

        scan.close();

    }
    
}
