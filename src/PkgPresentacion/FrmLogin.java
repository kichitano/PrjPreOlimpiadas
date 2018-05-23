/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgPresentacion;

import PkgNegocios.ClsMetodosVariados;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
/**
 *
 * @author VERA
 */
public class FrmLogin extends javax.swing.JFrame implements Runnable{
     
    ClsMetodosVariados metodosVariados;
    final ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/loading_blue2.gif"));;
    Thread Isesion;
    
    public FrmLogin() {
        
        initComponents();    
        metodosVariados = new ClsMetodosVariados();
        lblCarga.setVisible(false);
        lblISesion.setVisible(false);
        this.setSize(420, 185);
        setLocationRelativeTo(null);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblISesion = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtUsuario.setToolTipText("Usuario");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtPass.setToolTipText("Password");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        lblISesion.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblISesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblISesion.setText("Iniciando Sesion...");

        lblCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/loading_blue2.gif"))); // NOI18N
        lblCarga.setName("lblCarga"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtPass)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCarga)
                .addGap(18, 18, 18)
                .addComponent(lblISesion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCarga)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblISesion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        lblCarga.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Isesion = new Thread(this);
        Isesion.start();             
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
       char cTeclaPresionada = evt.getKeyChar();
       if(cTeclaPresionada==KeyEvent.VK_ENTER){
           btnIngresar.doClick();
       }
    }//GEN-LAST:event_txtPassKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    
    //METODO RUN DE INICIO DE SESION
    
    @Override
    public void run() {
        boolean pase = false;
        try {
            //MENSAJE DE INICIO DE SESION
            txtUsuario.setEnabled(false);
            txtPass.setEnabled(false);
            this.setSize(420, 280);
            lblCarga.setVisible(true);
            lblISesion.setVisible(true);
            //INICIAR SESION            
            pase = metodosVariados.MtdIniciarSesion(txtUsuario.getText(), txtPass.getText());
            if (pase == true) {
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema Pre-Olimpiadas" , "Sesion Iniciada",2);
                FrmHome home = new FrmHome();
                home.show();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Revise su usuario o contraseña..!!","Error",0);
                this.setSize(420, 185);
                txtUsuario.setText("");
                txtPass.setText("");
                txtUsuario.setEnabled(true);
                txtPass.setEnabled(true);
            }
        } catch (SQLException ex) { }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblISesion;
    public static javax.swing.JPasswordField txtPass;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
