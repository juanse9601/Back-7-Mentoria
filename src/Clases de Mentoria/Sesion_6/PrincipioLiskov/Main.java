package PrincipioLiskov;

public class Main {

    public static void main(String[] args) {

        Forma forma = new Cuadrado(5);
        double area = forma.calcularArea();
        Cuadrado cuadrado = new Cuadrado(7);


        System.out.println("El area del cuadrado es:" + area);


        // iNSTANCIAR CLASES HIJAS ATRAVES DE SU CLASE PADRE

    }
}

