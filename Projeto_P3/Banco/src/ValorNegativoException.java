public class ValorNegativoException extends Exception {

    public ValorNegativoException(){
        super("Valor negativo!");
    }
    public ValorNegativoException(String message){
        super(message);
    }
}
