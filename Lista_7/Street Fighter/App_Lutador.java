public class App_Lutador {

    public static void main(String[] args) {

        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);

        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }

        System.out.println(bison.getEnergia());

        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);
        }

        System.out.println(ryu.getEnergia());

    }

}
