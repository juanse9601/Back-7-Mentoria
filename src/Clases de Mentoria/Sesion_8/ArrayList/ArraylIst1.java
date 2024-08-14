package ArrayList;

import java.util.ArrayList;

public class ArraylIst1 {
    public static void main(String[] args) {

        //Suponer que tenemos una lista de palabras y nos crearemos otra para guardar unas palabras en especifico

        //Crear el arrayList de palabras

        ArrayList<String> palabras = new ArrayList<>();

        //Ingresaron datos a la lista
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("mango");
        palabras.add("uva");
        palabras.add("melon");
        palabras.add(2,"guayaba");
        palabras.size();

        //Especificar la letra de inicio para filtrar las palabras
        char letraInicio = 'm';

        //Crear una nueva lista que contenga solo las palabras que comienzan con una letra en especifico
        ArrayList<String> palabrasFiltradas = new ArrayList<>();

       //For each
        for (String palabra : palabras){

            if (palabra.charAt(0) == letraInicio){  //   m   a   n   g   o
                palabrasFiltradas.add(palabra);     //   0   1   2   3   4
            }
        }

        //Imprimir la nueva lista de palabras
        System.out.println("Palabras que comienzan con la letra: " + letraInicio + ":");


        for (String g : palabrasFiltradas){
            System.out.println(g);
        }

    }

}
