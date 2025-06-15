public class TrianguloRectangulo {
    private int base;
    private int altura;

    // Constructor
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    // Método para calcular el perímetro (base + altura + hipotenusa)
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Método para calcular la hipotenusa
    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    // Método para determinar el tipo de triángulo según sus lados
    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();

        if (base == altura && altura == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || altura == hipotenusa || base == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
