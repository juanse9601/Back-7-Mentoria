package Queue;

public class Paciente {

    private String id;
    private String nombre;
    private String servicioRequerido;
    private int prioridad;   //Menor numero indica mayor prioridad

    public Paciente(String id, String nombre, String servicioRequerido, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.servicioRequerido = servicioRequerido;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicioRequerido() {
        return servicioRequerido;
    }

    public void setServicioRequerido(String servicioRequerido) {
        this.servicioRequerido = servicioRequerido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return id + " : " +
                nombre + " (" + servicioRequerido +
                ", prioridad : " + prioridad + " ) ";
    }
}
