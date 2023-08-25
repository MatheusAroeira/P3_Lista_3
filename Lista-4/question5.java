import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3;
        double media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.printf("Média: %.1f \n" ,media);
            System.out.println("Aprovado");
        } else {
            System.out.printf("Média: %.1f \n", media);
            System.out.println("Reprovado");
        }

        scan.close();

    }
    
}
