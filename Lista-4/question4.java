import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }

        scan.close();

    }
    
}
