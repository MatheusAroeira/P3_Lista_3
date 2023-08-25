import java.util.Scanner;
import java.lang.Math;

public class question3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num1,num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();

        if(num1 == num2){
            System.out.println("os numeros são iguais");
        } else{
            System.out.println(Math.max(num1, num2) + " é o maior");
        }

        scan.close();

    }
    
}
