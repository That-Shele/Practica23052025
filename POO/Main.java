package POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import POO.ejercicios.animales.Animal;
import POO.ejercicios.animales.JuegoAnimales;
import POO.ejercicios.personal.EmpleadoRegular;
import POO.ejercicios.personal.Ingeniero;
import POO.ejercicios.personal.Medico;
import POO.ejercicios.personal.Profesor;
import POO.ejercicios.vehiculos.Automovil;
import POO.ejercicios.vehiculos.Avion;
import POO.ejercicios.vehiculos.Barco;

public class Main {
    public static void main(String[] args) throws IOException{
        boolean salir = false;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        while (!salir) {
            System.out.println("""
              ╔═════════┌══════════════════┐═════════╗
              ║         │Ejercicios   40-47│         ║
              ║         └──────────────────┘         ║
              ║                                      ║
              ║ 0. Salir                             ║   
              ║ 1. Ingresar un animal                ║
              ║ 2. Preguntas sobre animales          ║
              ║ 3. Vehículos distintos               ║
              ║ 4. Registrar y calcular sueldo       ║
              ║ 5. Calcular sueldo profesión         ║
              ║                                      ║
              ║                                      ║
              ╚══════════════════════════════════════╝
                """);
            int seleccion = Integer.parseInt(consola.readLine());
            switch (seleccion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    Animal animal = new Animal();
                    System.out.println("Ingrese el nombre del animal:");
                    animal.setNombre(consola.readLine());
                    System.out.println("Ingrese el orden del animal:");
                    animal.setOrden(consola.readLine());
                    System.out.println("Ingrese la cantidad de extremidades del animal:");
                    animal.setExtremidades(Integer.parseInt(consola.readLine()));
                    System.out.println(animal.getNombre());
                    System.out.println(animal.getOrden());
                    System.out.println(animal.getExtremidades());
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 2:
                    String[] args1 = {};
                    JuegoAnimales.main(args1);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 3:
                    Automovil auto = new Automovil();
                    Avion avion = new Avion();
                    Barco barco = new Barco();

                    System.out.println("Ingrese la marca del automovil:");
                    auto.setMarca(consola.readLine());
                    System.out.println("Ingrese el modelo del automovil:");
                    auto.setModelo(consola.readLine());
                    System.out.println("Ingrese el año del automovil:");
                    auto.setAnio(Integer.parseInt(consola.readLine()));
                    System.out.println("Ingrese el número de puertas del automovil:");
                    auto.setNumeroPuertas(Integer.parseInt(consola.readLine()));

                    System.out.println("Ingrese la marca del avion:");
                    avion.setMarca(consola.readLine());
                    System.out.println("Ingrese el modelo del avion:");
                    avion.setModelo(consola.readLine());
                    System.out.println("Ingrese el año del avion:");
                    avion.setAnio(Integer.parseInt(consola.readLine()));
                    System.out.println("Ingrese el número de motores del avion:");
                    avion.setNumeroMotores(Integer.parseInt(consola.readLine()));

                    System.out.println("Ingrese la marca del barco:");
                    barco.setMarca(consola.readLine());
                    System.out.println("Ingrese el modelo del barco:");
                    barco.setModelo(consola.readLine());
                    System.out.println("Ingrese el año del barco:");
                    barco.setAnio(Integer.parseInt(consola.readLine()));
                    System.out.println("Ingrese el tipo de propulsión del barco:");
                    barco.setTipoPropulsion(consola.readLine());

                    System.out.println("Información del automovil:");
                    auto.mostrarInfo();
                    auto.mover();

                    System.out.println("Información del avion:");
                    avion.mostrarInfo();
                    avion.mover();

                    System.out.println("Información del barco:");
                    barco.mostrarInfo();
                    barco.mover();

                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 4:
                    EmpleadoRegular empleado = new EmpleadoRegular();
                    System.out.println("Ingrese el nombre del empleado:");
                    empleado.setNombre(consola.readLine());
                    System.out.println("Ingrese el ID del empleado:");
                    empleado.setId(consola.readLine());
                    System.out.println("Ingrese el sueldo base del empleado:");
                    empleado.setSueldoBase(Double.parseDouble(consola.readLine()));
                    System.out.println("Ingrese las horas trabajadas del empleado:");
                    empleado.setHorasTrabajadas(Integer.parseInt(consola.readLine()));
                    System.out.println("Ingrese la tarifa por hora del empleado:");
                    empleado.setTarifaPorHora(Double.parseDouble(consola.readLine()));

                    empleado.registrar();
                    empleado.calcularSueldo();
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 5:
                    Medico medico = new Medico();
                    Ingeniero ingeniero = new Ingeniero();
                    Profesor profesor = new Profesor();
                    System.out.println("Ingrese el nombre del médico:");
                    medico.setNombre(consola.readLine());
                    System.out.println("Ingrese los años de experiencia del médico:");
                    medico.setAniosExperiencia(Integer.parseInt(consola.readLine()));
                    System.out.println("Ingrese el sueldo base mensual del médico:");
                    medico.setSueldoBaseMensual(Double.parseDouble(consola.readLine()));
                    System.out.println("Ingrese el bono por año de experiencia del médico:");
                    medico.setBonoPorAnioExperiencia(Double.parseDouble(consola.readLine()));

                    System.out.println("Ingrese el nombre del ingeniero:");
                    ingeniero.setNombre(consola.readLine());
                    System.out.println("Ingrese la especialidad del ingeniero:");
                    ingeniero.setEspecialidad(consola.readLine());
                    System.out.println("Ingrese el salario por proyecto del ingeniero:");
                    ingeniero.setSalarioPorProyecto(Double.parseDouble(consola.readLine()));
                    System.out.println("Ingrese el número de proyectos terminados del ingeniero:");
                    ingeniero.setProyectosTerminados(Integer.parseInt(consola.readLine()));

                    System.out.println("Ingrese el nombre del profesor:");
                    profesor.setNombre(consola.readLine());
                    System.out.println("Ingrese el nivel educativo del profesor:");
                    profesor.setNivelEducativo(consola.readLine());
                    System.out.println("Ingrese el salario base por hora del profesor:");
                    profesor.setSalarioBasePorHora(Double.parseDouble(consola.readLine()));
                    System.out.println("Ingrese las horas de clase por semana del profesor:");
                    profesor.setHorasClasePorSemana(Integer.parseInt(consola.readLine()));

                    medico.calcularSueldo();
                    ingeniero.calcularSueldo();
                    profesor.calcularSueldo();
                    
                    medico.diagnosticar();
                    ingeniero.disenar();
                    profesor.ensenar();

                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                default:
                    System.out.println("No reconocido.");
            }    
        }
    }

}




