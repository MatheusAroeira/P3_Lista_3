package Question5;

public class App1 {

    public static void main(String[] args)throws DimensoesInvalidasException {

        try {
            Triangulo t1 = new Triangulo(3,4,5);
            t1.setA(10);
        } catch (DimensoesInvalidasException e) {
            System.out.println("Os números não satisfazem a condição de existência dos triângulos!");
        }

    }
    
}
