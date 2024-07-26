package Sesion_2;
//Programacion Orienta a objetos
// piLares 4

// encapsulacion -- privatizar nuestros atributos get = ver la informacion de ese atributo
// y los set = modificacion o asignacion de esos atributos
// herencia
// polimorfismo
// abstraccion




// una plantilla
public class Inventario {

   // atributos o caracteristicas
    // constructor
   // metodos o funciones  que en realidad son acciones o verbos
   // encapsular sus atributos

    // public == en visible para cualquier clase que lo invoque
    // private == privado solo es accesible en su misma clase o si se invoca por otra clase tiene que ser atraves de get o su set previamente creados
    // protected == herencia que solo sus hijos pueden accederlo

    //Arrays para almacenar los nombres, precios, y cantidades de los productos


   private String[] nombres;
   private double[] precios;
   private int[] cantidades;

   private int capacidad;
   private int numeroProductos;

   //contructor
    public Inventario(int capacidad){
        this.capacidad= capacidad;
        nombres = new String[capacidad];
        precios = new double[capacidad];
        cantidades = new int[capacidad];
        numeroProductos = 0;
    }

    //Agregar Producto
    public void agregarProducto(String nombre, double precio, int cantidad){
        //Verificar si el numero actual de productos es menor que la capacidad del inventario
        if (numeroProductos < capacidad){
            nombres[numeroProductos] = nombre;
            precios[numeroProductos] = precio;
            cantidades[numeroProductos] = cantidad;
            //incrementar el contador de productosen el inventario
            numeroProductos++;
            System.out.println("Producto agregado exitosamente.");
        } else{
            System.out.println("No se pueden agregar mas productos. Capacida maxima alcanzada");
            // numeros productos a guardar el tamaño del array 10
        }

    }


    //metodo para mostrar el inventario
    public void mostrarInventario(){
        //Verificar si el inventario esta vacio
        if (numeroProductos == 0){
            System.out.println("EL inventario esta vacio");
        } else{
            for (int i = 0; i < numeroProductos; i ++){
                System.out.println("Producto: " + nombres[i] + ", Precio: " + precios[i] + ", Cantidad: " + cantidades[i]);
            }
        }
    }

    //metodo para vender un producto
    public void venderProducto(String nombre, int cantidad){

        //Recorrer todos los productos del inventario
        for (int i = 0; i < numeroProductos; i ++){
            if (nombres[i].equals(nombre)){
                if (cantidades[i] >= cantidad){
                    //Restar la cantidad vendida de la cantidad del producto
                    cantidades[i] -= cantidad;
                    System.out.println("Producto vendido exitosamente.");
                    //si la cantidad del producto llega a 0, ELIMINA EL PRODUCTO DEL INVENTARIO
                    if (cantidades[i] == 0){
                        eliminarProducto(i);
                    }
                }else {
                    System.out.println("no hay suficiente cantidad del producto");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado");

    }


    //crear metodo para eliminar el producto del inventario
    private void eliminarProducto(int indice){
        //Recorrer todos los productos apartir del indice proporcionado hasta el penultimo producto
        for (int i = indice; i < numeroProductos - 1; i ++){
            nombres[i] = nombres[i + 1];
            precios[i] = precios[i + 1];
            cantidades[i] = cantidades[i + 1];
        }

        numeroProductos--;
    }

}


















