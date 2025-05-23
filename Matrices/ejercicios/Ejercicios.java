package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios {

    public Ejercicios() {
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public String vectorFrutas() throws IOException{
        String[] frutas = new String[10];
        String result = "";
        for(int i = 0; i < frutas.length; i++){
            System.out.println("Introduce la fruta " + (i+1) + ": ");
            frutas[i] = in.readLine();
        }

        for(int i = frutas.length - 1; i >= 0 ; i--){
            result += "Fruta " + (i + 1) + ": " + frutas[i] + "\n";
        }

        return result;
    }

    public String vectorEnterosPromedio() throws IOException{
        String result = "";
        int[] numeros = new int[12];
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(in.readLine());
            suma += numeros[i];
        }

        result += "El promedio de los numeros es: " + (suma/numeros.length);
        return result;
    }

    public String vectorParesImpares() throws IOException {
        String result = "";
        int pares = 0;
        int impares = 0;
        int[] numeros = new int[12];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(in.readLine());
            if(numeros[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        result += "La cantidad de numeros pares es: " + pares + "\n";
        result += "La cantidad de numeros impares es: " + impares + "\n";

        return result;
    }

    public String mayorMenor() throws IOException{
        String result = "";
        double[] numeros = new double[10];
        double mayor = 0;
        double menor = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero " + (i+1) + ": ");
            numeros[i] = Double.parseDouble(in.readLine());
            if(i == 0){
                mayor = numeros[i];
                menor = numeros[i];
            }else{
                if(numeros[i] > mayor){
                    mayor = numeros[i];
                }
                if(numeros[i] < menor){
                    menor = numeros[i];
                }
            }
        }

        result += "El numero mayor es: " + mayor + "\n";
        result += "El numero menor es: " + menor + "\n";

        return result;
    }

    public String matrizArticulos() throws IOException{
        String result = "";
        String[][] articulos = new String[3][3];
        for(int i = 0; i < articulos.length; i++){
            for(int j = 0; j < articulos[i].length; j++){
                System.out.println("Introduce el articulo [" + (i) + "],[" + (j) + "]: ");
                articulos[i][j] = in.readLine();
            }
        }

        for(int i = articulos.length - 1; i >= 0; i--){
            for(int j = articulos[i].length - 1; j >= 0; j--){
                result += "Articulo [" + (i) + "],[" + (j) + "]: " + articulos[i][j] + "\n";
            }
            result += "\n";
        }

        return result;
    }

    public String transposicion() throws IOException{
        String result = "Matriz original:\n";	
        double[][] matriz = new double[3][3];
        double[][] transpuesta = new double[3][3];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduce el numero [" + (i) + "],[" + (j) + "]: ");
                matriz[i][j] = Double.parseDouble(in.readLine());
                result += matriz[i][j] + " ";
            }
            result += "\n";
        }

        result += "\nMatriz transpuesta:\n";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                transpuesta[j][i] = matriz[i][j];

            }
        }

        for(int i = 0; i < transpuesta.length; i++){
            for(int j = 0; j < transpuesta[i].length; j++){
                result += transpuesta[i][j] + " ";
            }
            result += "\n";
        }

        return result;
    }

    public String puntoDeSilla() throws IOException{
        String result = "";
        int puntosEncontrados = 0;
        double[][] matriz = new double[3][4];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduce el numero [" + (i) + "],[" + (j) + "]: ");
                matriz[i][j] = Double.parseDouble(in.readLine());
            }
        }

        for(int posFila = 0; posFila < matriz.length; posFila++){
            for(int posColumna = 0; posColumna < matriz[posFila].length; posColumna++){
                if(obtenerPuntoDeSilla(matriz, posFila, posColumna) == 1){
                    result += "Punto de silla se encontrado en: [" + posFila + "], [" + posColumna + "]."
                            + " Con el valor de: " + matriz[posFila][posColumna] + "\n";
                    puntosEncontrados++;
                }
            }
        }

        return puntosEncontrados > 0 ? result : "No se encontraron puntos de silla en la matriz.";
    }

    public int obtenerPuntoDeSilla(double[][] matriz, int fila, int columna) {
        double valor = matriz[fila][columna];
        boolean esPuntoDeSilla = true;

        // Verificar si es el mínimo de su fila
        for (int i = 0; i < matriz[fila].length; i++) {
            if (matriz[fila][i] < valor) {
                esPuntoDeSilla = false;
                break;
            }
        }

        // Verificar si es el máximo de su columna
        if (esPuntoDeSilla) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][columna] > valor) {
                    esPuntoDeSilla = false;
                    break;
                }
            }
        }

        return esPuntoDeSilla ? 1 : 0;
    }
}
