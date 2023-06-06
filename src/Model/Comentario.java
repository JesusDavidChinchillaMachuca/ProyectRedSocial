package Model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Comentario {

    private String texto;
    private Fecha fecha;

    public Comentario() {
    }

    public Comentario(String texto, Fecha fecha) {
        this.texto = texto;
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

}
