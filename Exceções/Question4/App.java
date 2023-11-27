package Question4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        int num, index = 0;

        System.out.println("Digite 10 números e quando desejar parar digite o 0: ");
        try {
            do {
                num = scan.nextInt();
                vetor[index] = num;
                index++;
            } while (num != 0);

            for (int i = 0; i < index; i++) {
                System.out.print(vetor[i] + " ");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Quantidade de números possíveis ultrapassada!");
        } catch(InputMismatchException e){
            System.out.println("As entradas devem ser apenas números!");
        }

        scan.close();

    }

    
}