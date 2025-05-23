package Autonomo;

// Anombre de estudiante: Arley Salgado
// Fecha de compilación: 23/05/2025

//Se crea clase para calcular el factorial de un número
public class Factorial {

    // Se crea el método para calcular el factorial
    public int CalcularFactorial(int n){

        // Se inidca que el primer número sea 1
        int resultado = 1;

        // Se usa for para multiplicar los númeors desde 1 hasta n
        for (int i = 1; i <= n; i++ ){
            resultado = resultado * i; // Se acumula el resultado
        }

        // Se retorna el resultado
        return resultado;
    }
}
