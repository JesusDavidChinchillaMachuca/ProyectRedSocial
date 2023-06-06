package Controller;

import Model.Usuario;
import View.PrincipalView;
import View.RegistroView;
import RedSocial.RedSocial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class PrincipalController implements ActionListener {

    private final PrincipalView principalView;
    private final RegistroView registroView;
    private final RedSocial redSocial;

    public PrincipalController(PrincipalView principalView, RegistroView registroView) {
        this.redSocial = RedSocial.obtenerInstancia();
        this.principalView = principalView;
        this.registroView = registroView;
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        principalView.btnIniciarSesion.addActionListener(controller);
        principalView.btnRegistrate.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getActionCommand().contentEquals("Iniciar sesion")){
            
            String correo = principalView.txtCorreoElectronico.getText();
            String password = principalView.txtPassword.getText();
            
            if(redSocial.iniciarSesion(correo, password)){
                JOptionPane.showMessageDialog(principalView, "Datos correcto. iniciaste secion");
                limpiarCampos();
            } else{
                JOptionPane.showMessageDialog(principalView, "Datos Incorrectos. Introduce una cuenta valida");
                limpiarCampos();
            }
            
        }
        
        if(event.getActionCommand().contentEquals("Registrate")){
            
            RegistroController registroController = new RegistroController(registroView, principalView);
            registroView.setVisible(true);
            principalView.setVisible(false);
        }
            
    }

    public void limpiarCampos() {
        registroView.txtNombre.setText("");
        registroView.txtApellido.setText("");
        registroView.txtNick.setText("");
        registroView.txtEdad.setText("");
        registroView.txtCorreo.setText("");
        registroView.txtPassword.setText("");
    }
    

}
