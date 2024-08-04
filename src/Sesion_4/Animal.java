package Sesion_4;

public class Animal implements InterfazGeneral{

    private String raza;

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void cazar(){
        System.out.println("El animal de raza" + raza + "esta cazando desde la clase animal");
    }



    @Override
    public void desplazarse() {
        System.out.println("El animal de raza" + raza + "se esta desplazando desde la clase animal");
    }

    @Override
    public void jugar() {
        System.out.println("El animal de raza" + raza + "esta jugando desde la clase animal");
    }

    @Override
    public void alimentarse() {
        System.out.println("El animal se esta alimentando desde a clase animal");
    }

    @Override
    public void dormir() {

    }
}
