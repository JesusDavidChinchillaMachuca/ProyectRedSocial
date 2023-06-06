package Model;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Noticia {

    private String titulo;
    private Fecha fecha; 
    private String texto;
    private String autor;

    public Noticia() {
    }

    public Noticia(String titulo, Fecha fecha, String texto, String autor) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.texto = texto;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
