package Question6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente c1;
        double saldo, valor;
        int numeroDaConta;

        try {
            System.out.print("Digite o número da conta a ser criada: ");
            numeroDaConta = scan.nextInt();

            System.out.print("Digite o saldo da conta: ");
            saldo = scan.nextDouble();
            c1 = new ContaCorrente(numeroDaConta, saldo);

            System.out.print("Digite o valor a ser sacado: ");
            valor = scan.nextDouble();
            c1.sacar(valor);

        } catch (InputMismatchException e) {
            System.out.println("As entradas devem ser numéricas!");
        } catch (SaldoInsuficienteException e){
            System.out.println("Saldo Insuficiente!");
        }

        scan.close();
    }

}
