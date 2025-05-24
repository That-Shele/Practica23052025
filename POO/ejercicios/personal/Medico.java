package POO.ejercicios.personal;

public class Medico implements IProfesion {
    private String nombre;
    private int aniosExperiencia;
    private double sueldoBaseMensual;
    private double bonoPorAnioExperiencia;

    public Medico() {

    }

    public Medico(String nombre, int aniosExperiencia, double sueldoBaseMensual, double bonoPorAnioExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.sueldoBaseMensual = sueldoBaseMensual;
        this.bonoPorAnioExperiencia = bonoPorAnioExperiencia;
    }

    @Override
    public void calcularSueldo() {
        setSueldoBaseMensual((getAniosExperiencia() * getBonoPorAnioExperiencia()));
        System.out.println("El sueldo de " + getNombre() + " es: $" + getSueldoBaseMensual());
    }

    public void diagnosticar() {
        System.out.println(getNombre() + " está realizando un diagnóstico médico.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getSueldoBaseMensual() {
        return sueldoBaseMensual;
    }

    public void setSueldoBaseMensual(double sueldoBaseMensual) {
        this.sueldoBaseMensual = sueldoBaseMensual;
    }

    public double getBonoPorAnioExperiencia() {
        return bonoPorAnioExperiencia;
    }

    public void setBonoPorAnioExperiencia(double bonoPorAnioExperiencia) {
        this.bonoPorAnioExperiencia = bonoPorAnioExperiencia;
    }

    
}
