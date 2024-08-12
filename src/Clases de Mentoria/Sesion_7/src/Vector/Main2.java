package Vector;

public class Main2 {
    public static void main(String[] args) {

        String[] estudiantes =  new String[5];

        estudiantes[0] = "Ana";
        estudiantes[1] = "Carlos";
        estudiantes[2] = "";
        estudiantes[3] = "Juan";
        estudiantes[4] = "Lucia";

        System.out.println("Nombres de los estudiantes: ");
        for (int i = 0; i < estudiantes.length; i++){
            System.out.println("Estudiante " + (i + 1) + ": " + estudiantes[i]);
        }

    }
}
