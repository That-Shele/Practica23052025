package POO.ejercicios.personal;

public class EmpleadoRegular extends Personal {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoRegular() {
        super(); 
    }

    public EmpleadoRegular(String nombre, String id, double sueldoBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, sueldoBase); 
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    

    @Override
    public void registrar() {
        System.out.println("\n--- Registro de Empleado Regular ---");
        System.out.println("Empleado registrado: " + getNombre() + " con ID: " + getId());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Tarifa por hora: $" + String.format("%.2f", getTarifaPorHora()));
    }

    @Override
    public void calcularSueldo() {
        double sueldoTotal = getSueldoBase() + (getHorasTrabajadas() * getTarifaPorHora());
        System.out.println("El sueldo de " + getNombre() + " es: $" + String.format("%.2f", sueldoTotal));
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
