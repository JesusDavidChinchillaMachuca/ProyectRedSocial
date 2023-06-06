package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Grupo {

    private String nombre;
    private Usuario propietario;
    private String descripcion;
    private String tipo;
    private Noticia noticiaReciente;
    private ArrayList<Usuario> integrantes;
    private ArrayList<Usuario> solicitudesPendientes;

    public Grupo() {
    }

    public Grupo(Usuario propietario, String descripcion, String tipo, Noticia noticiaReciente) {
        this.propietario = propietario;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.noticiaReciente = noticiaReciente;
        this.integrantes = new ArrayList<>();
        this.solicitudesPendientes = new ArrayList<>();
    }

    public void agregarIntegrante(Usuario usuario) {
        integrantes.add(usuario);
    }

    public void enviarSolicitud(Usuario usuario) {
        solicitudesPendientes.add(usuario);
    }

    public void aceptarSolicitud(Usuario usuario) {
        solicitudesPendientes.remove(usuario);
        integrantes.add(usuario);
    }

    public void rechazarSolicitud(Usuario usuario) {
        solicitudesPendientes.remove(usuario);
    }

    public ArrayList<Usuario> getIntegrantes() {
        return integrantes;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Noticia getNoticiaReciente() {
        return noticiaReciente;
    }

    public void setNoticiaReciente(Noticia noticiaReciente) {
        this.noticiaReciente = noticiaReciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
