package POO.ejercicios.personal;

abstract class Personal {
    private String nombre;
    private String id;
    private double sueldoBase;

    public Personal() {
        
    }

    public Personal(String nombre, String id, double sueldoBase) {
        setNombre(nombre);
        setId(id);
        setSueldoBase(sueldoBase);
    }

    public abstract void registrar();

    public abstract void calcularSueldo();

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Sueldo Base: $" + String.format("%.2f", getSueldoBase()));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    
}


