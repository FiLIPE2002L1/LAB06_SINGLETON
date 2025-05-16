package Singleton_SAB;
public class Triangulo implements FiguraPlana {
    private int ladoA, ladoB, ladoC;

    public static void resetarSingletons() {
        trianguloEquilatero = null;
        trianguloIsosceles = null;
        trianguloEscaleno = null;
    }

    private static Triangulo trianguloEquilatero = null;
    private static Triangulo trianguloIsosceles = null;
    private static Triangulo trianguloEscaleno = null;

    private Triangulo(int a, int b, int c) {
        if (!valido(a, b, c)) {
            throw new MedidaInvalidaException();
        }
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }

    public static Triangulo criarEquilatero(int lado) {
        if (trianguloEquilatero == null) {
            trianguloEquilatero = new Triangulo(lado, lado, lado);
        }
        return trianguloEquilatero;
    }

    public static Triangulo criarIsosceles(int ladoIgual, int ladoDiferente) {
        if (trianguloIsosceles == null) {
            trianguloIsosceles = new Triangulo(ladoIgual, ladoIgual, ladoDiferente);
        }
        return trianguloIsosceles;
    }

    public static Triangulo criarEscaleno(int a, int b, int c) {
        if (trianguloEscaleno == null) {
            trianguloEscaleno = new Triangulo(a, b, c);
        }
        return trianguloEscaleno;
    }

    private boolean valido(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a;
    }

    public double obterArea() {
        double semi = obterPerimetro() / 2.0;
        return Math.sqrt(semi * (semi - ladoA) * (semi - ladoB) * (semi - ladoC));
    }

    public double obterPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}