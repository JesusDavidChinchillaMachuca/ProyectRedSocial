package Controller;

import View.RegistroView;
import RedSocial.RedSocial;
import View.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class RegistroController implements ActionListener {

    private final RedSocial redSocial;
    private final RegistroView registroView;
    private final PrincipalView principalView;

    public RegistroController( RegistroView registroView, PrincipalView principalView) {
        this.redSocial = RedSocial.obtenerInstancia();
        this.registroView = registroView;
        this.principalView = principalView;
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registroView.btnRegistrarse.addActionListener(controller);
    }

    public void limpiarCampos() {
        registroView.txtNombre.setText("");
        registroView.txtApellido.setText("");
        registroView.txtNick.setText("");
        registroView.txtEdad.setText("");
        registroView.txtCorreo.setText("");
        registroView.txtPassword.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().contentEquals("Registrarse")) {
            String nombre = registroView.txtNombre.getText();
            String apellido = registroView.txtApellido.getText();
            String nick = registroView.txtNick.getText();
            int edad = Integer.parseInt(registroView.txtEdad.getText());
            String correo = registroView.txtCorreo.getText();
            String password = registroView.txtPassword.getText();

            if (redSocial.validarCorreo(correo)) {
                redSocial.registrarUsuario(nombre, apellido, nick, edad, password, correo);
                JOptionPane.showMessageDialog(registroView, "Se registro correctamente. Inicia sesion");
                PrincipalController principalController = new PrincipalController(principalView, registroView);
                principalView.setVisible(true);
                registroView.setVisible(false);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(registroView, "Correo invalido. Introduce un correo valido \nexample@example.com");
                limpiarCampos();
            }

        }

    }

}
