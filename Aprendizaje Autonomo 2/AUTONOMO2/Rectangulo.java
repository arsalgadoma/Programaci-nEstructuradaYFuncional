public class Rectangulo {
    private int base;
    private int altura;

    // Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
