public class SistemaPeaje {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Peaje Sur", "Guayas");

        Vehiculo v1 = new Carro("ABC123");
        Vehiculo v2 = new Moto("XYZ789");
        Vehiculo v3 = new Camion("DEF456", 3);

        peaje.añadirVehiculo(v1);
        peaje.añadirVehiculo(v2);
        peaje.añadirVehiculo(v3);

        peaje.imprimir();
    }
}
