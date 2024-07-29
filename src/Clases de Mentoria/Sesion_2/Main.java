package Sesion_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(2);

        while (true){
            System.out.println("----Menu de Opciones");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar un producto");
            System.out.println("3. Vender un producto");
            System.out.println("4. Salir");
            System.out.println("Selccione una opcion: ");


            int opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    inventario.mostrarInventario();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingrese la cantidad del producto");
                    int cantidad = scanner.nextInt();
                    inventario.agregarProducto(nombre,precio,cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a vender:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la cantidad a vender");
                    cantidad = scanner.nextInt();
                    inventario.venderProducto(nombre,cantidad);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. !Hasta Luego");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, por favor, seleccione una opcion correcta.");
                    break;
            }
        }
    }

}
