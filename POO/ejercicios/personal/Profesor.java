package POO.ejercicios.personal;

public class Profesor implements IProfesion {
    private String nombre;
    private String nivelEducativo;
    private double salarioBasePorHora;
    private int horasClasePorSemana;

    public Profesor() {

    }

    public Profesor(String nombre, String nivelEducativo, double salarioBasePorHora, int horasClasePorSemana) {
        setNombre(nombre);
        setNivelEducativo(nivelEducativo);
        setSalarioBasePorHora(salarioBasePorHora);
        setHorasClasePorSemana(horasClasePorSemana);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo de " + getNombre() + " es: $" +
        ((getSalarioBasePorHora() * getHorasClasePorSemana()) * 4));
    }

    public void ensenar() {
        System.out.println(getNombre() + " está enseñando a nivel " + getNivelEducativo() + ".");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public double getSalarioBasePorHora() {
        return salarioBasePorHora;
    }

    public void setSalarioBasePorHora(double salarioBasePorHora) {
        this.salarioBasePorHora = salarioBasePorHora;
    }

    public int getHorasClasePorSemana() {
        return horasClasePorSemana;
    }

    public void setHorasClasePorSemana(int horasClasePorSemana) {
        this.horasClasePorSemana = horasClasePorSemana;
    }

    
}
