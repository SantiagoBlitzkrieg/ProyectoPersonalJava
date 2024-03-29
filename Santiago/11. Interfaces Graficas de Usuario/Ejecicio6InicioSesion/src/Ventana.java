
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gomez
 */
public class Ventana extends javax.swing.JFrame {

    
            
    public Ventana() {
        initComponents();
        iniciarFondo();
        
        setLocationRelativeTo(null);
    }
    
    private void iniciarFondo(){
        final ImageIcon imagen = new ImageIcon (getClass().getResource("/Imagenes/transp.png"));
        etiquetaFondoSesion.setIcon(new ImageIcon (imagen.getImage().getScaledInstance(etiquetaFondoSesion.getWidth(), etiquetaFondoSesion.getHeight(), Image.SCALE_SMOOTH)));
    }

    private Usuarios usuario1= new Usuarios("sgomezsan", "nicoesfeito1");    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaFondoSesion = new javax.swing.JLabel();
        botonExit = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaPassword = new javax.swing.JPasswordField();
        botonInicioSesion = new javax.swing.JButton();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaFondoSesion.setBackground(new java.awt.Color(0, 0, 0));
        panel.add(etiquetaFondoSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 230, 220));

        botonExit.setBackground(new java.awt.Color(255, 0, 0));
        botonExit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonExit.setText("Salir");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });
        panel.add(botonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, -1));

        etiquetaUsuario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaUsuario.setText(" Usuario:");
        panel.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, -1));

        etiquetaContraseña.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaContraseña.setText("Contraseña:");
        panel.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        panel.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 30));
        panel.add(cajaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 190, 30));

        botonInicioSesion.setBackground(new java.awt.Color(255, 255, 204));
        botonInicioSesion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonInicioSesion.setText("Iniciar Sesión");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });
        panel.add(botonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 260, 50));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/artud.jpg"))); // NOI18N
        panel.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:
        //dispose();  ///Esta opcion destruye la ventana 
        System.exit(0); //Esta opcion hace que la VM de Java termine
    }//GEN-LAST:event_botonExitActionPerformed

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cajaUsuarioActionPerformed

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        // TODO add your handling code here:       
        
        if(usuario1.getUsuario().equals(cajaUsuario.getText())){
            
            if (usuario1.getContraseña().equals(leerContraseña())){
                JOptionPane.showMessageDialog(null, "Bienvenido "+usuario1.usuario);
            }else{
                JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
            }
        }else{
            System.out.println(cajaUsuario.getText());
            System.out.println(usuario1.getUsuario());
            JOptionPane.showMessageDialog(null, "Error, usuario inexistente");
        }
        
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private String leerContraseña(){
        char []contra=cajaPassword.getPassword();
        String contraseña="";
        for (int i =0; i<contra.length;i++){
            contraseña+=contra[i];
        }     
        return contraseña;
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JPasswordField cajaPassword;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaFondoSesion;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
