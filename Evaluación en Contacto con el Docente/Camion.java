public class Camion extends Vehiculo {
    private int valorPeajeEje = 1;
    private final int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public void imprimir() {
        System.out.println("Camión - Placa: " + placa + ", Ejes: " + 
        numeroEjes + ", Peaje: $" + (valorPeajeEje * numeroEjes));
    }
}
