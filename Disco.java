package Singleton_SAB;
public class Disco implements FiguraPlana {
    private double raio;
    private static Disco instanciaUnica = null;
    private final double PI = Math.PI;

    private Disco(double raio) {
        if (raio <= 0) throw new MedidaInvalidaException();
        this.raio = raio;
    }

    public static Disco getInstancia(double raio) {
        if (instanciaUnica == null) {
            instanciaUnica = new Disco(raio);
        } else {
            instanciaUnica.ajustarRaio(raio);
        }
        return instanciaUnica;
    }

    public double getRaio() {
        return raio;
    }

    public void ajustarRaio(double novoRaio) {
        if (novoRaio <= 0) throw new MedidaInvalidaException();
        this.raio = novoRaio;
    }

    public double obterArea() {
        return PI * raio * raio;
    }

    public double obterPerimetro() {
        return 2 * PI * raio;
    }
}