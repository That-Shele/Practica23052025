package POO.ejercicios.personal;

public class Ingeniero implements IProfesion {
    private String nombre;
    private String especialidad;
    private double salarioPorProyecto;
    private int proyectosTerminados;

    public Ingeniero(){
        
    }

    public Ingeniero(String nombre, String especialidad, double salarioPorProyecto, int proyectosTerminados) {
        setNombre(nombre);
        setEspecialidad(especialidad);
        setSalarioPorProyecto(salarioPorProyecto);
        setProyectosTerminados(proyectosTerminados);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("El sueldo de " + getNombre() + " es: $" +
         (getSalarioPorProyecto() * getProyectosTerminados()));
    }

    public void disenar() {
        System.out.println(getNombre() + " está diseñando un nuevo sistema de " + getEspecialidad() + ".");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalarioPorProyecto() {
        return salarioPorProyecto;
    }

    public void setSalarioPorProyecto(double salarioPorProyecto) {
        this.salarioPorProyecto = salarioPorProyecto;
    }

    public int getProyectosTerminados() {
        return proyectosTerminados;
    }

    public void setProyectosTerminados(int proyectosTerminados) {
        this.proyectosTerminados = proyectosTerminados;
    }

    
}
