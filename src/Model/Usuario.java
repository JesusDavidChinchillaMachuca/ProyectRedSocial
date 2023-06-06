package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String claveAcceso;
    private String correoElectronico;
    private ArrayList<Comentario> comentarios;
    private ArrayList<Fotografa> fotosEtiquetado;

    
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nick, int edad, String claveAcceso, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.claveAcceso = claveAcceso;
        this.correoElectronico = correoElectronico;
        this.comentarios = new ArrayList<>();
        this.fotosEtiquetado = new ArrayList<>();
    }
    
    

    public void hacerComentario(String texto, int dia, int mes, int anio) {
        
        Fecha fecha = new Fecha(dia, mes, anio);
        Comentario comentario = new Comentario(texto,fecha);
        comentarios.add(comentario);
    }


    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
