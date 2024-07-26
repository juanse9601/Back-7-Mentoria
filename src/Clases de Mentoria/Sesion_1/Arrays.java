import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Pedir al usuario la cantidad de numeros a ingresar
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        int cantidadNumeros = scanner.nextInt();

        //Declarar un vector para almacenar los numeros ingresados
        int[] numeros = new int[cantidadNumeros];

        //Llenar el vector con los numeros ingresados por el usuario
        for (int i = 0; i < cantidadNumeros; i++){
            System.out.println("Ingrese el numero #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //Encontrar numero maximo
        int maximo = numeros[0];
        for (int i = 1; i < cantidadNumeros; i++ ){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }

        //Encuentrar el numero minimo dentro del vector
        int minimo = numeros[0];
        for (int i = 1; i < cantidadNumeros; i ++){
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }

        //calcular el promedio
        int suma = 0;
        for (int i = 0; i < cantidadNumeros; i++){
            suma += numeros[i];
        }
        double promedio = (double)suma/ cantidadNumeros;

        //Mostrar los resultados
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        System.out.println("El promedio de los numeros es: " + promedio);

        //Verificar si algun numero en el vector es igual al promedio
        boolean encontrado = false;
        for (int i = 0; i < cantidadNumeros; i++){
            if (numeros[i] == promedio) {
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("Hay un numero igual al promedio en el vector");
        } else {
            System.out.println("No hay ningun numero igual al promedio en el vector.");
        }

        scanner.close();

    }

}
