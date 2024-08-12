package Inversion_Dependencia;

//Clase de alto nivel  = solo llamar al metodo y no tiene implementacion
public class Interruptor {

    private Lampara lampara;

    public Interruptor(){
        this.lampara = new Lampara();
    }

    public void presionarInterruptor(){
        lampara.encender();
    }
}
