package POO.ejercicios.vehiculos;

public class Avion extends Vehiculo {
    private int numeroMotores;

    public Avion() {
        
    }

    public Avion(String marca, String modelo, int anio, int numeroMotores) {
        super(marca, modelo, anio);
        this.numeroMotores = numeroMotores;
    }

    // Sobrescritura del método mover utilizando polimorfismo
    @Override
    public void mover() {
        System.out.println("El avión está volando por el cielo.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de motores: " + numeroMotores);
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    
}
