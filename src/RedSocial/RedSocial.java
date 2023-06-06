package RedSocial;

import Controller.PrincipalController;
import Model.Grupo;
import Model.Noticia;
import Model.Usuario;
import View.PrincipalView;
import View.RegistroView;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RedSocial {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Grupo> grupos;

    public RedSocial() {
        this.usuarios = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    private static RedSocial instancia;

    public static RedSocial obtenerInstancia() {
        if (instancia == null) {
            instancia = new RedSocial();
        }
        return instancia;
    }

    public void registrarUsuario(String nombre, String apellido, String nick, int edad, String claveAcceso, String correoElectronico) {
        Usuario usuario = new Usuario(nombre, apellido, nick, edad, claveAcceso, correoElectronico);
        usuarios.add(usuario);
    }
    
    public void crearGrupo(String nombre, Usuario popietario, String descripcion, String tipo, Noticia noticia){
        
    }

    public boolean iniciarSesion(String correo, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(correo) && usuario.getClaveAcceso().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void listarGruposEIntegrantes() {

        for (Grupo grupo : grupos) {
            System.out.println("Nombre del grupo: " + grupo.getNombre());
            System.out.println("Descripcion: " + grupo.getDescripcion());
            System.out.println("Tipo: " + grupo.getTipo());
            System.out.println("Contacto propietario: " + grupo.getPropietario().getCorreoElectronico());
            System.out.println("Miembros: ");
            for (Usuario miembros : grupo.getIntegrantes()) {
                System.out.println("- " + miembros.getNick());
            }
            System.out.println("");
        }
    }
    
    

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static boolean validarCorreo(String email) {
        String emailREGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailREGEX);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {

        PrincipalView principalView = new PrincipalView();
        principalView.setVisible(true);
        RegistroView reistroView = new RegistroView();
        PrincipalController controller = new PrincipalController(principalView, reistroView);

    }

}
