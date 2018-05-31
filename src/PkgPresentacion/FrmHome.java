package PkgPresentacion;

import javafx.scene.paint.Color;
import javax.swing.JPanel;

public class FrmHome extends javax.swing.JFrame {


    public FrmHome() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpRPelotas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpMinifutbol = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpTenis = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpCubilete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpLanzCanasta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpSapito = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Disciplinas");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pre-Olimpiadas");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(45, 118, 232));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 150, 340, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 348, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/navigation.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        jpRPelotas.setBackground(java.awt.SystemColor.controlHighlight);
        jpRPelotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpRPelotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpRPelotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpRPelotasMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("R. de Pelotas");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lanzamientoPelota.png"))); // NOI18N

        javax.swing.GroupLayout jpRPelotasLayout = new javax.swing.GroupLayout(jpRPelotas);
        jpRPelotas.setLayout(jpRPelotasLayout);
        jpRPelotasLayout.setHorizontalGroup(
            jpRPelotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRPelotasLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jpRPelotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21))
        );
        jpRPelotasLayout.setVerticalGroup(
            jpRPelotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRPelotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jpRPelotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 140, 120));

        jpMinifutbol.setBackground(java.awt.SystemColor.controlHighlight);
        jpMinifutbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMinifutbolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMinifutbolMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMinifutbolMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("Minifútbol");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/futbol.png"))); // NOI18N

        javax.swing.GroupLayout jpMinifutbolLayout = new javax.swing.GroupLayout(jpMinifutbol);
        jpMinifutbol.setLayout(jpMinifutbolLayout);
        jpMinifutbolLayout.setHorizontalGroup(
            jpMinifutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinifutbolLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpMinifutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpMinifutbolLayout.setVerticalGroup(
            jpMinifutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinifutbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jpMinifutbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, 120));

        jpTenis.setBackground(java.awt.SystemColor.controlHighlight);
        jpTenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpTenisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpTenisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpTenisMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setText("Tenis de Mesa");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/tenis-de-mesa.png"))); // NOI18N

        javax.swing.GroupLayout jpTenisLayout = new javax.swing.GroupLayout(jpTenis);
        jpTenis.setLayout(jpTenisLayout);
        jpTenisLayout.setHorizontalGroup(
            jpTenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTenisLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jpTenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jpTenisLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26))
        );
        jpTenisLayout.setVerticalGroup(
            jpTenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTenisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jpTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 120));

        jpCubilete.setBackground(java.awt.SystemColor.controlHighlight);
        jpCubilete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCubileteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCubileteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpCubileteMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 232));
        jLabel7.setText("Cubilete");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dados.png"))); // NOI18N

        javax.swing.GroupLayout jpCubileteLayout = new javax.swing.GroupLayout(jpCubilete);
        jpCubilete.setLayout(jpCubileteLayout);
        jpCubileteLayout.setHorizontalGroup(
            jpCubileteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCubileteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpCubileteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jpCubileteLayout.setVerticalGroup(
            jpCubileteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCubileteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jpCubilete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 120));

        jpLanzCanasta.setBackground(java.awt.SystemColor.controlHighlight);
        jpLanzCanasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpLanzCanastaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpLanzCanastaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpLanzCanastaMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 232));
        jLabel9.setText("Lanz. a la Canasta");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/canasta-de-baloncesto.png"))); // NOI18N

        javax.swing.GroupLayout jpLanzCanastaLayout = new javax.swing.GroupLayout(jpLanzCanasta);
        jpLanzCanasta.setLayout(jpLanzCanastaLayout);
        jpLanzCanastaLayout.setHorizontalGroup(
            jpLanzCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLanzCanastaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpLanzCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLanzCanastaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLanzCanastaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36))))
        );
        jpLanzCanastaLayout.setVerticalGroup(
            jpLanzCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLanzCanastaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jpLanzCanasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 140, 120));

        jpSapito.setBackground(java.awt.SystemColor.controlHighlight);
        jpSapito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSapitoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSapitoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpSapitoMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 232));
        jLabel11.setText("Sapo");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sapito.png"))); // NOI18N

        javax.swing.GroupLayout jpSapitoLayout = new javax.swing.GroupLayout(jpSapito);
        jpSapito.setLayout(jpSapitoLayout);
        jpSapitoLayout.setHorizontalGroup(
            jpSapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSapitoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSapitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(52, 52, 52))
        );
        jpSapitoLayout.setVerticalGroup(
            jpSapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSapitoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jpSapito, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jpMinifutbolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinifutbolMouseEntered
        // TODO add your handling code here:
        setColor(jpMinifutbol);
    }//GEN-LAST:event_jpMinifutbolMouseEntered

    private void jpMinifutbolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinifutbolMouseExited
        // TODO add your handling code here:
        resetColor(jpMinifutbol);
    }//GEN-LAST:event_jpMinifutbolMouseExited
     
    
    
    
    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jpTenisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTenisMouseEntered
        // TODO add your handling code here:
        setColor(jpTenis);
    }//GEN-LAST:event_jpTenisMouseEntered

    private void jpTenisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTenisMouseExited
        // TODO add your handling code here:
        resetColor(jpTenis);
    }//GEN-LAST:event_jpTenisMouseExited

    private void jpCubileteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCubileteMouseEntered
        // TODO add your handling code here
        setColor(jpCubilete);
    }//GEN-LAST:event_jpCubileteMouseEntered

    private void jpCubileteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCubileteMouseExited
        // TODO add your handling code here:
        resetColor(jpCubilete);
    }//GEN-LAST:event_jpCubileteMouseExited

    private void jpLanzCanastaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLanzCanastaMouseEntered
        // TODO add your handling code here:
        setColor(jpLanzCanasta);
    }//GEN-LAST:event_jpLanzCanastaMouseEntered

    private void jpLanzCanastaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLanzCanastaMouseExited
        // TODO add your handling code here:
        resetColor(jpLanzCanasta);
        
    }//GEN-LAST:event_jpLanzCanastaMouseExited

    private void jpSapitoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSapitoMouseEntered
        // TODO add your handling code here:
        setColor(jpSapito);
    }//GEN-LAST:event_jpSapitoMouseEntered

    private void jpSapitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSapitoMouseExited
        // TODO add your handling code here:
        resetColor(jpSapito);
    }//GEN-LAST:event_jpSapitoMouseExited

    private void jpRPelotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRPelotasMouseEntered
        // TODO add your handling code here:
        setColor(jpRPelotas);
    }//GEN-LAST:event_jpRPelotasMouseEntered

    private void jpRPelotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRPelotasMouseExited
        // TODO add your handling code here:
        resetColor(jpRPelotas);
    }//GEN-LAST:event_jpRPelotasMouseExited

    private void jpMinifutbolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinifutbolMousePressed

          new FrmMinifutbol().show();
    }//GEN-LAST:event_jpMinifutbolMousePressed

    private void jpTenisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTenisMousePressed
    
       new FrmTenisMesa().show();
    }//GEN-LAST:event_jpTenisMousePressed

    private void jpCubileteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCubileteMousePressed
       new FrmCubilete().show();
    }//GEN-LAST:event_jpCubileteMousePressed

    private void jpSapitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSapitoMousePressed
      new FrmSapito().show();
    }//GEN-LAST:event_jpSapitoMousePressed

    private void jpLanzCanastaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLanzCanastaMousePressed
       new FrmLanzamientoCanasta().show();
    }//GEN-LAST:event_jpLanzCanastaMousePressed

    private void jpRPelotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRPelotasMousePressed
       new FrmRecogedorPelotas().show();
    }//GEN-LAST:event_jpRPelotasMousePressed
 public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
 }
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
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpCubilete;
    private javax.swing.JPanel jpLanzCanasta;
    private javax.swing.JPanel jpMinifutbol;
    private javax.swing.JPanel jpRPelotas;
    private javax.swing.JPanel jpSapito;
    private javax.swing.JPanel jpTenis;
    // End of variables declaration//GEN-END:variables
}
