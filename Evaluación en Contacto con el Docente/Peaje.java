import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        int valor = calcularPeaje(vehiculo);
        totalPeaje += valor;

        if (vehiculo instanceof Carro) {
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
        }

        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            return ((Carro) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Moto) {
            return ((Moto) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Camion) {
            Camion c = (Camion) vehiculo;
            return c.getValorPeajeEje() * c.getNumeroEjes();
        } else {
            return 0;
        }
    }

    public void imprimir() {
        System.out.println("=== Peaje: " + nombre + " - " + departamento + " ===");
        System.out.println("Vehículos registrados:");
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Total Carros: " + totalCarros);
        System.out.println("Total Motos: " + totalMotos);
        System.out.println("Total Camiones: " + totalCamiones);
        System.out.println("Total Recaudado: $" + totalPeaje);
    }
}
