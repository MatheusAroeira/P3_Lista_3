public class SaldoInvalidoException extends Exception {

    public SaldoInvalidoException() {
        super("Saldo invalido ou insuficente");
    }

    public SaldoInvalidoException(String message) {
        super(message);
    }

}
