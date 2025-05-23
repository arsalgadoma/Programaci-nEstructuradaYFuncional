package Autonomo;

// Anombre de estudiante: Arley Salgado
// Fecha de compilación: 25/05/2025

// Se crea la clase principal
public class Main {
    
    public static void main(String[] args) {

        // Se crea un objeto de la clase Factorial
        Factorial factorialCalculator = new Factorial();

        // Se usa for para utilizar los números del 1 al 13
        for ( int n =1; n<=13; n++){
        
            // Se llama a CalcularFactorial para calcular el factorial
            int resultado = factorialCalculator.CalcularFactorial(n);

            // Se imprime el resultado
            System.out.println("El factorial de " + n + " es: " + resultado);
        }
    }    
}