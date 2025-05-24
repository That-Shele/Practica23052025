package POO.ejercicios.animales;

public class JuegoAnimales {
    public static void main(String[] args) {
        Nivel1 obj1 = new Nivel1();
        Nivel2 obj2 = new Nivel2();

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

    

    
}
