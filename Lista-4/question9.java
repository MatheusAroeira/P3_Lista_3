import java.util.Scanner;

public class question9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura, peso, IMC;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = scan.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC <= 0) {
            System.out.println("Informações Incorretas");
        } else if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Você está no peso ideal!");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Você está levemente a cima do peso ideal!");
        } else if (IMC >= 30 && IMC < 35) {
            System.out.println("Você está com obesidade grau I");
        } else if (IMC > 35) {
            System.out.println("Você está com obesidade severa");
        } else {
            System.out.println("Você está com obesidade mórbida");
        }

        scan.close();

    }

}
