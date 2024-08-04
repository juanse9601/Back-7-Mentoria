package Agregacion;

public class Tortuguero {

    private String descripcion;


    private Tortuga lista[];

    public Tortuguero(String descripcion){
        this.descripcion = descripcion;
    }

    public Tortuga[] getLista() {
        return lista;
    }

    public void setLista(Tortuga[] lista) {
        this.lista = lista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void nombreTortugas(){
        System.out.println("Nombre de las tortugas:");
        for (int i = 0; i< 3; i++){
            System.out.println("- " + lista[i].getNombre());
        }
    }


}
