package Vector;public class BuscarArray {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13};
        int numeroABuscar = 17;
        boolean encontrado =  false;

        //Blucle para recorrer el array y buscar el numero
        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i] == numeroABuscar){
                encontrado = true;
                System.out.println("Numero " + numeroABuscar + "encontrado en la posicion: " + i);
                break; //Salir del bucle una encuentre la similitud
            }
        }

        if (!encontrado){
            System.out.println("Numero" + numeroABuscar + "no encontrado en el array.");
        }

    }
}
