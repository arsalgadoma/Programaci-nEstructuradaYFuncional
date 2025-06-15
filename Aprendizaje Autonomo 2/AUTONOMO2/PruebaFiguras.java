public class PruebaFiguras {
    public static void main(String[] args) {
        
        Circulo figura1 =  new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Trapecio figura5 = new Trapecio(4, 3, 5, 6, 0);
        
        System.out.println("El área del círculo: " + figura1.calcularArea());
        System.out.println("El perímetro del círculo: " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("El área del rectángulo: " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo: " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("El área del cuadrado: " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado: " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("El área del triángulo: " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo: " + figura4.calcularPerimetro());
        System.out.println("El triángulo es " + figura4.determinarTipoTriangulo());
        System.out.println();

        System.out.println("El área del tracepcio: "+ figura5.calcularArea());
        System.out.println("El perímetro del trapecio: " + figura5.calcularPerimetro());

    }
}
