package POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        boolean salir = false;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        while (!salir) {
            System.out.println("""
              ╔═════════┌══════════════════┐═════════╗
              ║         │Ejercicios Pág. 32│         ║
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
                    
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 2:
                    
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 3:
                    
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 4:
                    
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 5:
                   
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                default:
                    System.out.println("No reconocido.");
            }    
        }
    }

    public class Animal {
        private String nombre;
        private String orden;
        private int extremidades;

        public Animal() {
        }

        public Animal(String nombre, String orden, int extremidades) {
            this.nombre = nombre;
            this.orden = orden;
            this.extremidades = extremidades;
        }

        public String getNombre() {
            return "Nombre: " + nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getOrden() {
            return "Orden: " + orden;
        }

        public void setOrden(String orden) {
            this.orden = orden;
        }

        public String getExtremidades() {
            return "Cant. de Extremidades: " + extremidades;
        }

        public void setExtremidades(int extremidades) {
            this.extremidades = extremidades;
        }
    }    

}


