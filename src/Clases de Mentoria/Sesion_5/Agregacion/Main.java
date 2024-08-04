package Agregacion;

public class Main {

    public static void main(String[] args) {

        //crear las tortugas

        Tortuga tortugaBlanca = new Tortuga("Blanca");
        Tortuga tortugaAzul = new Tortuga("Azul");
        Tortuga tortugaNegra = new Tortuga("Negra");

        //crear el vector
        Tortuga lista[] = new Tortuga[3];

        //Guardamos las tortugas en el vector
        lista[0] = tortugaBlanca;
        lista[1] = tortugaAzul;
        lista[2] = tortugaNegra;

        Tortuguero tortuguero = new Tortuguero("Variedad de tortugas Marinas");
        tortuguero.setLista(lista);
        tortuguero.nombreTortugas();
    }
}
