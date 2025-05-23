import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ejercicios.Ejercicios;

public class Main {
    public static void main(String[] args) throws IOException{
        boolean salir = false;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        Ejercicios funciones = new Ejercicios();

        while (!salir){
            System.out.println("""
              ╔═════════┌══════════════════┐═════════╗
              ║         │Ejercicios Pág. 32│         ║
              ║         └──────────────────┘         ║
              ║                                      ║
              ║ 0. Salir                             ║   
              ║ 1. Almacenar 10 frutas               ║
              ║ 2. Promedio de 12 enteros            ║
              ║ 3. Pares e impares 12 enteros        ║
              ║ 4. Mayor y menor valor               ║
              ║ 5. 9 nombres de artículos            ║
              ║ 6. Matríz de artículos traspuesta    ║
              ║ 7. Calcular punto de silla           ║
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
                    var frutas = funciones.vectorFrutas();
                    System.out.println(frutas);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 2:
                    var promedio = funciones.vectorEnterosPromedio();
                    System.out.println(promedio);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 3:
                    var paresImpares = funciones.vectorParesImpares();
                    System.out.println(paresImpares);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 4:
                    var mayorMenor = funciones.mayorMenor();
                    System.out.println(mayorMenor);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 5:
                    var articulos = funciones.matrizArticulos();
                    
                    System.out.println(articulos);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                   
                case 6:
                    var transposicion = funciones.transposicion();
                    System.out.println(transposicion);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                case 7:    
                    var puntoDeSilla = funciones.puntoDeSilla();

                    System.out.println(puntoDeSilla);
                    System.out.println("(Presione enter para salir)");
                    consola.readLine();
                    break;
                default:
                    System.out.println("No reconocido.");
            }
        }
    }
}
