package POO.ejercicios.vehiculos;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil() {
        
    }

    public Automovil(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    // Sobrescritura del método mover utilizando polimorfismo
    @Override
    public void mover() {
        System.out.println("El automóvil está circulando por la carretera.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo de la clase base
        System.out.println("Número de puertas: " + numeroPuertas);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    
}