package Vector;

import java.util.Arrays;

public class InsertarArray {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6}; // [3][2][][7][5][6]
        int nuevoValor = 99;           //  0  1  2  3  4  5

        //cALCULAR LA POSICION DONDE SE VA INSERTAR EL NUEVO VALOR
        int posicionInsercion = numeros.length;

        //crear un array con mas posiciones para la nueva insercion
        int[] nuevoArray = new int[numeros.length + 1];

        //Copiar la primera mitad del array origina al nuevo array
        for (int i = 0; i < posicionInsercion; i ++){
            nuevoArray[i] = numeros[i];
        }

        //Insertar el nuevo valor
        nuevoArray[posicionInsercion] = nuevoValor;   //  {1,2,3,99,4,5,6}

        //copiar la segunda mitad
        for (int i = posicionInsercion; i < numeros.length; i ++ ){
            nuevoArray[i + 1] = numeros[i];
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Nuevo array con el valor insertado: " + Arrays.toString(nuevoArray));


    }


}
