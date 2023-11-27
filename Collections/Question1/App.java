package Question1;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(4);
        Circulo c3 = new Circulo(6);
        Circulo c4 = new Circulo(8);
        Circulo c5 = new Circulo(10);

        HashMap <Double, String> listaCirculos = new HashMap<Double, String>();

        listaCirculos.put(c1.calcularArea(), "C1");
        listaCirculos.put(c2.calcularArea(), "C2");
        listaCirculos.put(c3.calcularArea(), "C3");
        listaCirculos.put(c4.calcularArea(), "C4");
        listaCirculos.put(c5.calcularArea(), "C5");

        System.out.println(listaCirculos);



    }
    
}
