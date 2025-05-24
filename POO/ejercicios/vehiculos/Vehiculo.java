package POO.ejercicios.vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }



    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
}

class Automovil extends Vehiculo {
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

// Clase derivada Barco
class Barco extends Vehiculo {
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

// Clase derivada Avión
class Avion extends Vehiculo {
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

