public class Cuadrado {
    private int lado;

    // Constructor
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
