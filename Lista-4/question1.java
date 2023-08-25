import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();
        
        if(n > 0){
            System.out.println("O número é positivo");
        } else if(n < 0){
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        scan.close();

    }

    
}