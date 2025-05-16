package Singleton_SAB;
public class Quadrado implements FiguraPlana {
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new MedidaInvalidaException();
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double obterArea() {
        return lado * lado;
    }

    public double obterPerimetro() {
        return 4 * lado;
    }
}