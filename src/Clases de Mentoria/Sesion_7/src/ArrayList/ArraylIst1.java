package ArrayList;

import java.util.ArrayList;

public class ArraylIst1 {
    public static void main(String[] args) {

        //Suponer que tenemos una lista de palabras y nos crearemos otra para guardar unas palabras en especifico

        //Crear el arrayList de palabras

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("mango");
        palabras.add("uva");
        palabras.add("melon");

        //Especificar la letra de inicio para filtrar las palabras
        char letraInicio = 'm';

        //Crear una nueva lista que contenga solo las palabras que comienzan con una letra en especifico
        ArrayList<String> palabrasFiltradas = new ArrayList<>();


        for (String palabra : palabras){

            if (palabra.charAt(0) == letraInicio){
                palabrasFiltradas.add(palabra);
            }
        }

        //Imprimir la nueva lista de palabras
        System.out.println("Palabras que comienzan con la letra: " + letraInicio + ":");


        for (String g : palabrasFiltradas){
            System.out.println(g);
        }

    }

}
