package Singleton_SAB;
public class MedidaInvalidaException extends RuntimeException {
    public MedidaInvalidaException() {
        super("Medida inválida para criação da figura geométrica.");
    }
}
