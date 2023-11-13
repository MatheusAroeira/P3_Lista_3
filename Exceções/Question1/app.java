package Question1;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int index;

        try {
            System.out.print("Digite um nome: ");
            nome = scan.next();
            char[] arrayCharNome = nome.toCharArray();
            System.out.printf("Digite um numero entre 0 e %d: ", arrayCharNome.length - 1);
            index = scan.nextInt();

            scan.close();
            System.out.println(arrayCharNome[index]);
        } catch (Exception e) {
            System.out.println("Posição Inválida");
        }
    }

}