package POO.ejercicios.animales;
import java.util.Scanner;

public class Nivel2 {
        public int puntaje;
        private String respuesta;
        private final String[] animales;
        private final Scanner ent;

        public Nivel2() {
            puntaje = 0;
            ent = new Scanner(System.in);
            animales = new String[4];
            animales[0] = "Oso";
            animales[1] = "Mono";
            animales[2] = "Loro";
            animales[3] = "Tortuga";
        }

        private void puntajeOso(){
            if(respuesta.equalsIgnoreCase(animales[0])){
                System.out.println("¡Correcto! Haz ganado 20 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
                System.out.println("Has perdido 10 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeMono(){
            if(respuesta.equalsIgnoreCase(animales[1])){
                System.out.println("¡Correcto! Haz ganado 20 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
                System.out.println("Has perdido 10 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeLoro(){
            if(respuesta.equalsIgnoreCase(animales[2])){
                System.out.println("¡Correcto! Haz ganado 20 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[2]);
                System.out.println("Has perdido 10 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeTortuga(){
            if(respuesta.equalsIgnoreCase(animales[3])){
                System.out.println("¡Correcto! Haz ganado 20 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[3]);
                System.out.println("Has perdido 10 puntos");
                puntaje -= 10;
            }
        }

        public void imprimirPreguntas(){
            System.out.println("¿Es un animal peludo que habita en el bosque y es carnívoro?");
            respuesta = ent.nextLine();
            puntajeOso();

            System.out.println("¿Es un animal que come platanos?");
            respuesta = ent.nextLine();
            puntajeMono();

            System.out.println("¿Es un animal con alas que repite sonidos?");
            respuesta = ent.nextLine();
            puntajeLoro();

            System.out.println("¿Es un animal que camina lento y tiene caparazón?");
            respuesta = ent.nextLine();
            puntajeTortuga();
        }
    }
