package Sesion_4;

public class Humano implements InterfazGeneral,InterfaceAccionesHumano{

    private int cedula;

    public int getCedula(){
        return cedula;
    }

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public void razonar(){
        System.out.println("El humano esta razonando, desde la clase humano");
    }


    @Override
    public void desplazarse() {
        System.out.println("El humano se esta desplazando con cedula" + cedula);
    }

    @Override
    public void jugar() {
        System.out.println("El humano con cedula" + cedula + "esta jugando");
    }

    @Override
    public void alimentarse() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void bailar(String nombre) {
        System.out.println(nombre + "esta bailando");
    }

    @Override
    public void trabajar(String nombre, int cedula) {
        System.out.println(nombre + "con cedula" + cedula + "esta trabajando");
    }

    @Override
    public void estudiar() {

    }
}
