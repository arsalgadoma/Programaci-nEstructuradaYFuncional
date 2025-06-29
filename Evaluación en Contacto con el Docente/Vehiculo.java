public class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void imprimir() {
        System.out.println("Placa: " + placa);
    }
}
