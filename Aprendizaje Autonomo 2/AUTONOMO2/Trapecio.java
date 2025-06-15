public class Trapecio {
    private int baseMayor;
    private int baseMenor;
    private int altura;
    private int lado1;
    private int lado2;

    //Constructor
    public Trapecio (int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método para calcular el área
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    //Metodo para calcular el perímetro
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

}
