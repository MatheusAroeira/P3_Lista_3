package Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listaIdades = new ArrayList<>();
        int indexRemovido;

        try {
            System.out.print("Digite 10 idades: ");
            for (int i = 0; i < 10; i++) {
                int idadeAux = scan.nextInt();
                listaIdades.add(idadeAux);
            }

            System.out.print("Digite a posição a ser removida: ");
            indexRemovido = scan.nextInt();
            scan.close();

            listaIdades.remove(indexRemovido);
            System.out.printf("A idade %d na posição %d foi removida!", listaIdades.get(indexRemovido), indexRemovido);
        } catch (Exception e) {
            System.out.println("Posição Inválida");
        }

    }

}
