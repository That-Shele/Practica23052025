package POO.ejercicios.animales;
import java.util.Scanner;

public class Nivel1 {
        public int puntaje;
        private String respuesta;
        private final String[] animales;
        private final Scanner ent;

        public Nivel1() {
            puntaje = 0;
            ent = new Scanner(System.in);
            animales = new String[2];
            animales[0] = "Perro";
            animales[1] = "Gato";
        }

        private void puntajePerro(){
            if(respuesta.equalsIgnoreCase(animales[0])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 10;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 5;
            }
        }

        private void puntajeGato(){
            if(respuesta.equalsIgnoreCase(animales[1])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 10;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 5;
            }
        }

        public void imprimirPreguntas(){
            System.out.println("¿Es un animal que ladra y come croquetas?");
            respuesta = ent.nextLine();
            puntajePerro();

            System.out.println("¿Es un animal que maulla y toma leche?");
            respuesta = ent.nextLine();
            puntajeGato();
        }
    }
