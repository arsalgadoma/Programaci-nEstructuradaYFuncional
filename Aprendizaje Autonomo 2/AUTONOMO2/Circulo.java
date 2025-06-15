public class Circulo {
    private int radio;

    // Constructor
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}