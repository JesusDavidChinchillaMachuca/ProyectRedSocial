package View;

/**
 *
 * @author Daniel
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblIniciaSesion = new javax.swing.JLabel();
        lblNoTienesCuenta = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistrate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicia Sesión");
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciaSesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblIniciaSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciaSesion.setText("Inicia sesión");
        bg.add(lblIniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 30));

        lblNoTienesCuenta.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNoTienesCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNoTienesCuenta.setText("¿No tienes una cuenta?");
        bg.add(lblNoTienesCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lblCorreoElectronico.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElectronico.setText("Correo electrónico:");
        bg.add(lblCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtCorreoElectronico.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreoElectronico.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoElectronico.setBorder(null);
        bg.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        bg.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 3));

        lblPassword.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");
        bg.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        bg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 30));

        btnRegistrate.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrate.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrate.setForeground(new java.awt.Color(0, 0, 255));
        btnRegistrate.setText("Registrate");
        btnRegistrate.setBorder(null);
        btnRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrateActionPerformed(evt);
            }
        });
        bg.add(btnRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnRegistrate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblIniciaSesion;
    private javax.swing.JLabel lblNoTienesCuenta;
    private javax.swing.JLabel lblPassword;
    public javax.swing.JTextField txtCorreoElectronico;
    public javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}