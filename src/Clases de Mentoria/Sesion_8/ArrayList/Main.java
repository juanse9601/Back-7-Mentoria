package ArrayList;

public class Main {


        public static void main(String[] args) {


            //Crear un array que almacene 5 nombres y saber cual es el nombre mas largo

            String[] nombres = {"Santi", "Omar", "Sebastian", "Mauricio", "Gina"};

            String nombreLargo = "";
            int contadorNombres = 0;

            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].length() > contadorNombres) {
                    nombreLargo = nombres[i];
                    contadorNombres = nombres[i].length();
                }
            }

            System.out.println("El nombre con mas digitos es: " + nombreLargo + " con " + contadorNombres + " de caracteres");

        }
    }
