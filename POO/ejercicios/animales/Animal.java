package POO.ejercicios.animales;

public class Animal {
        private String nombre;
        private String orden;
        private int extremidades;

        public Animal() {
        }

        public Animal(String nombre, String orden, int extremidades) {
            setNombre(nombre);
            setOrden(orden);
            setExtremidades(extremidades);
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
