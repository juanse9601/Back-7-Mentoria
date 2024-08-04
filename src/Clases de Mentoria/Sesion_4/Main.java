package Sesion_4;

public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal();
        perro.setRaza("doberman");
        perro.cazar();
        perro.desplazarse();
        perro.alimentarse();
        perro.jugar();

        System.out.println("*************************************************************");

        Humano persona = new Humano();
        persona.setCedula(1040047488);
        persona.alimentarse();
        persona.desplazarse();
        persona.jugar();
        persona.razonar();

        System.out.println("*************************************************************");

        Hombre julio = new Hombre();
        julio.setNombre("julio");
        julio.setCedula(1111111111);
        julio.razonar();
        julio.desplazarse();
        julio.jugar();
        julio.trabajar(julio.getNombre(),julio.getCedula());

        System.out.println();

    }
}
