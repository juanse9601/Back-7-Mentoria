package Vector;

public class Main1 {

    public static void main(String[] args) {
        //Crear un array que almacene 5 elementos nombres y saber cual es el nombre mas largo
                             //5      4          9          8        4
        String[] nombres = {"Santi","Omar","sebastian","Mauricio","luis"};

        String nombreLargo = "";
        int contadorNombres = 0;

        for (int i = 0; i < 5 ; i ++){
            if (nombres[i].length() > contadorNombres ){
                nombreLargo = nombres[i];
                contadorNombres = nombres[i].length();
            }

        }

        System.out.println("El nombre con mas digitos es: " + nombreLargo + "con " + contadorNombres + "de caracteres");

    }
}
