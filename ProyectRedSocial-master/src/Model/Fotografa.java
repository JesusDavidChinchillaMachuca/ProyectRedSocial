package Model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Fotografa {

    private String nombre;
    private String descripcion;
    private int x, y;

    public Fotografa() {
    }

    public Fotografa(String nombre, String descripcion, int x, int y) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
