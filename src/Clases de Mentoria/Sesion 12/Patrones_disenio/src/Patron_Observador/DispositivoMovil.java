package Patron_Observador;


//Objeto suscriptor
public class DispositivoMovil implements Observador{

    private String nombre;

    public DispositivoMovil(String nombre){
        this.nombre = nombre;
    }


    @Override
    public void actualizar(double temperatura, double humedad) {
        System.out.println("Actualizando clima desde dispositivo movil: " + this.nombre + ", temperatura: " + temperatura + "C , humedad: " + humedad + " %. ");
    }

    @Override
    public String toString() {
        return "DispositivoMovil{" +
                "nombre='" + this.nombre + '\'' +
                '}';
    }
}
