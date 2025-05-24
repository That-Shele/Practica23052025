package POO.ejercicios.vehiculos;

public class Barco extends Vehiculo {
    private String tipoPropulsion;

    public Barco() {
        
    }

    public Barco(String marca, String modelo, int anio, String tipoPropulsion) {
        super(marca, modelo, anio);
        this.tipoPropulsion = tipoPropulsion;
    }

    // Sobrescritura del método mover utilizando polimorfismo
    @Override
    public void mover() {
        System.out.println("El barco está navegando en el agua.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de propulsión: " + tipoPropulsion);
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    
}
