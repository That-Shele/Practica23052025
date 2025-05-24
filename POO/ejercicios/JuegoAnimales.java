package POO.ejercicios;

import java.util.Scanner;

public class JuegoAnimales {
    public static void main(String[] args) {
        Nivel1 obj1 = new JuegoAnimales().new Nivel1();
        Nivel2 obj2 = new JuegoAnimales().new Nivel2();

        obj1.imprimirPreguntas();
        System.out.println("//************MARCADOR************\\");
        System.out.println("Nivel 1");
        System.out.println("Tu puntaje es: " + obj1.puntaje);

        obj2.imprimirPreguntas();
        System.out.println("//************MARCADOR************\\");
        System.out.println("Nivel 2");
        System.out.println("Tu puntaje es: " + obj2.puntaje);
        System.out.println("Tu puntaje total es: " + (obj1.puntaje + obj2.puntaje));
    }

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

    public class Nivel2 {
        public int puntaje;
        private String respuesta;
        private final String[] animales;
        private final Scanner ent;

        public Nivel2() {
            puntaje = 0;
            ent = new Scanner(System.in);
            animales = new String[2];
            animales[0] = "Oso";
            animales[1] = "Mono";
            animales[2] = "Loro";
            animales[3] = "Tortuga";
        }

        private void puntajeOso(){
            if(respuesta.equalsIgnoreCase(animales[0])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeMono(){
            if(respuesta.equalsIgnoreCase(animales[1])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeLoro(){
            if(respuesta.equalsIgnoreCase(animales[2])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[2]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 10;
            }
        }

        private void puntajeTortuga(){
            if(respuesta.equalsIgnoreCase(animales[3])){
                System.out.println("¡Correcto! Haz ganado 10 puntos");
                puntaje += 20;
            } else {
                System.out.println("¡Incorrecto! La respuesta es: " + animales[3]);
                System.out.println("Has perdido 5 puntos");
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
}
