package Lista_3;

import java.util.Scanner;

public class question23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String data;
        String[] dataSeparada;
        Integer dia, mes, ano;

        System.out.print("Digite a data (dd/mm/aaaa): ");
        data = scan.nextLine();

        dataSeparada = data.split("/");

        dia = Integer.parseInt(dataSeparada[0]);
        mes = Integer.parseInt(dataSeparada[1]);
        ano = Integer.parseInt(dataSeparada[2]);

        System.out.println("dia: " + dia);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);

        scan.close();

    }

}
