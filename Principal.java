package Singleton_SAB;
public class Principal {
    public static void main(String[] args) {
        try {
            System.out.println("📌 RELATÓRIO DE FIGURAS GEOMÉTRICAS\n");

            Disco d = Disco.getInstancia(15);
            System.out.println("Disco:");
            System.out.printf("- Perímetro: %.2f%n", d.obterPerimetro());
            System.out.printf("- Área: %.2f%n%n", d.obterArea());

            Quadrado q = new Quadrado(6);
            System.out.println("Quadrado:");
            System.out.printf("- Perímetro: %.2f%n", q.obterPerimetro());
            System.out.printf("- Área: %.2f%n%n", q.obterArea());

            Triangulo t1 = Triangulo.criarEquilatero(8);
            System.out.println("Triângulo Equilátero:");
            System.out.printf("- Perímetro: %.2f%n", t1.obterPerimetro());
            System.out.printf("- Área: %.2f%n%n", t1.obterArea());

            Triangulo t2 = Triangulo.criarIsosceles(6, 4);
            System.out.println("Triângulo Isósceles:");
            System.out.printf("- Perímetro: %.2f%n", t2.obterPerimetro());
            System.out.printf("- Área: %.2f%n%n", t2.obterArea());

            Triangulo t3 = Triangulo.criarEscaleno(5, 6, 7);
            System.out.println("Triângulo Escaleno:");
            System.out.printf("- Perímetro: %.2f%n", t3.obterPerimetro());
            System.out.printf("- Área: %.2f%n%n", t3.obterArea());

            System.out.println("✅ Encerrado.");

        } catch (MedidaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}