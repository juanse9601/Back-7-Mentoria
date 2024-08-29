package Patron_Observador;

import java.util.ArrayList;
import java.util.Iterator;

//Objeto publicador
public class Clima {

    private double temperatura;
    private double humedad;

    private ArrayList<Observador> observadores = new ArrayList<>();

    public Clima(){
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void registrarObservador(Observador observador){
      if (this.observadores.add(observador)) {
          System.out.println("Observador " + observador + " agregado ");
      } else {
          System.out.println("El observador " + observador + " no pudo ser agregado.");
      }
    }

    public void eliminarObservador(Observador observador){
        if (this.observadores.remove(observador)) {
            System.out.println("Observador " + observador + " removido ");
        } else {
            System.out.println("El observador " + observador + " no pudo ser removido.");
        }
    }

    public void actualizarClima(double temperatura, double humedad){
        this.setTemperatura(temperatura);
        this.setHumedad(humedad);
        this.notificar();

    }

    public void notificar(){
        Iterator var1 = this.observadores.iterator();

        while(var1.hasNext()){
            Observador observador = (Observador) var1.next();
            observador.actualizar(this.temperatura, this.humedad);
        }
    }

    public void mostrarObservadores(){
        System.out.println("La lista de los observadores es:");
        Iterator var1 = this.observadores.iterator();

        while (var1.hasNext()){
            Observador observador = (Observador)var1.next();
            System.out.println(observador);
        }
    }


}
