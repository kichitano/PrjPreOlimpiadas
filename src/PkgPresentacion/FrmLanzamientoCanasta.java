/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgPresentacion;

import PkgEntidad.ClsCircuitoBasket;
import PkgEntidad.ClsEquipo;
import PkgLogico.ClsCircuitoBasketLog;
import PkgNegocios.ClsConexion;
import PkgNegocios.ClsMetodosEquipo;
import PkgNegocios.ClsMetodosVariados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Vera
 */
public class FrmLanzamientoCanasta extends javax.swing.JFrame {
  //  PkgLogico.ClsCircuitoBasketLog bsklog;
    PkgEntidad.ClsCircuitoBasket bskent;
    
    PkgNegocios.ClsCircuitoBasket clscbsk = new PkgNegocios.ClsCircuitoBasket();
    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    int opt = 1;
    List<ClsEquipo> equipos;
    ClsEquipo equipo;
    ClsCircuitoBasketLog circuitoBasketLog = new ClsCircuitoBasketLog();
    ClsMetodosEquipo metodoEquipo;    
    ArrayList<Integer> arrayIdEquipos = new ArrayList();
    ArrayList<Integer> arrayIdEquiposParticipantes = new ArrayList();
    ArrayList<String> arrayDetalleEquipos = new ArrayList();

    private int puntajeTotal=0;
    
     //Arrays que trabajan con desempate
    ArrayList<Integer> arrayIdEquipoDesempate = new ArrayList();
    ArrayList<Integer> arrayPuntajeEquipoDesempate = new ArrayList();
    
   // ArrayList<Integer> arrayPuntajes = new ArrayList<Integer>();
//    ArrayList<int[]> arrayPuntajes = new ArrayList<int[]>();
   
    
    public FrmLanzamientoCanasta() {
        initComponents(); 
        setLocationRelativeTo(null);
        t = new Timer(10, acciones);
        cmbSerie.setEnabled(true);
        DeshabilitarControles();
        MtdSerie(); 
        ListarTabla();
    }
    // Color jtable
     public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRenderer());
        }
    }
    /*-------------------------------------------------------------------------------------*/
    /* ------------- CRONOMETRO ----------------------------------------------------------*/
    private Timer t;
    private int h, m, s, cs;
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==100){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
        
    };
    
    private void actualizarLabel() {
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
    }
    /*-------------------------------------------------------------------------------------------------*/
   private void ListarTabla() {
        List<PkgEntidad.ClsCircuitoBasket> listas = circuitoBasketLog.listado();
        tblPosiciones.setModel(new ModeloTablaCircuitoBasket(listas)); //Lista posicion
        setCellRender(tblPosiciones);
        tblPosiciones.getRowSorter();
        TableColumnModel columnModel = tblPosiciones.getColumnModel();
        // tamaño a cada columna de un jtable
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);

    }
   
    public void Limpiar() {
        txtPuntaje.setText("");
       
    }
    public void DeshabilitarControles(){
        lblEquipoParticipante.setVisible(false);
        LblCarga1.setVisible(false);
        jlIdApoderado.setVisible(false);
    }
   
    public void MtdSerie(){
        try{
            for(int i = 0; i < metodosVariados.listaSerie().size(); i++){
                cmbSerie.addItem(metodosVariados.listaSerie().get(i).getDescripcionSerie());
            }
        }catch(SQLException e){
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbSerie = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCanasta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        lblEquipoParticipante = new javax.swing.JLabel();
        cmbEquipos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPosiciones = new javax.swing.JTable();
        btnPausar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        cmbAgregarParticipante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegPtje = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LblCarga1 = new javax.swing.JLabel();
        btnEmpate = new javax.swing.JButton();
        btnDesempate = new javax.swing.JButton();
        jlIdApoderado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/canasta-de-baloncesto.png"))); // NOI18N
        jLabel15.setText("Lanzamiento a la Canasta");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Serie:");

        cmbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción" }));
        cmbSerie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSerieItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/temporizador.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");
        getContentPane().add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/camiseta-de-baloncesto.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 70));

        btnCanasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pelota-de-basket.png"))); // NOI18N
        btnCanasta.setText("Lanzar Canasta");
        btnCanasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanastaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCanasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 180, 70));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setText("Equipos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/camiseta-de-baloncesto.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/camiseta-de-baloncesto.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 70));
        getContentPane().add(txtPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 70, -1));

        lblEquipoParticipante.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEquipoParticipante.setForeground(new java.awt.Color(0, 51, 204));
        lblEquipoParticipante.setText("3");
        getContentPane().add(lblEquipoParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 40, 20));

        cmbEquipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEquiposItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 160, 30));

        tblPosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPosiciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 380, 370));

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        cmbAgregarParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario (1).png"))); // NOI18N
        cmbAgregarParticipante.setText("Agregar Participante");
        cmbAgregarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgregarParticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAgregarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/baloncesto.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("Puntaje:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        btnRegPtje.setText("Registrar Ptje.");
        btnRegPtje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPtjeActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegPtje, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/medidas-cancha-basquetbol.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 870, 430));

        LblCarga1.setText("jLabel9");
        getContentPane().add(LblCarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 520, -1, -1));

        btnEmpate.setText("Empate");
        btnEmpate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpateActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 100, 40));

        btnDesempate.setText("Desempate");
        btnDesempate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesempateActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesempate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, 100, 40));

        jlIdApoderado.setText("ID");
        getContentPane().add(jlIdApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanastaActionPerformed
        ClsConexion conexion = new ClsConexion();
        Connection con = conexion.getConecion();    
        PkgEntidad.ClsCircuitoBasket bskent = null;
        int id;String posicion;
        try {
            bskent = new PkgEntidad.ClsCircuitoBasket
                      (Integer.valueOf(arrayIdEquipos.get(cmbEquipos.getSelectedIndex())),
                              Integer.valueOf(txtPuntaje.getText())
                              );
        } catch (Exception ex) {
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean resp = circuitoBasketLog.AgregarCircuitoBasket(bskent,con);
        if (resp == false) {
            JOptionPane.showMessageDialog(null, "Dato Agregdo");
            ListarTabla();
        
            List<PkgEntidad.ClsCircuitoBasket> listas = circuitoBasketLog.listado();
            
            //Borrar datos de la tabla puntaje.
            circuitoBasketLog.BorrarDatosBasket();
            for(PkgEntidad.ClsCircuitoBasket cb : listas)
            {
                circuitoBasketLog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }
            
            Limpiar();
            try {
                MtdLlenarComboEquipos(Integer.valueOf(LblCarga1.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dato no Agregdo");
        }
       
    }//GEN-LAST:event_btnCanastaActionPerformed

    private void cmbSerieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSerieItemStateChanged
       if(cmbSerie.getItemAt(0).equals("Seleccionar opcion"))
       {
            opt = 1;
//            cmbNroPartido.removeAllItems();
//            cmbNroPartido.addItem("Seleccionar opcion");
//            cmbNroPartido.setEnabled(false);
       }
       try 
       {
            //id serie
            LblCarga1.setText(String.valueOf(metodosVariados.listaSerie().get(cmbSerie.getSelectedIndex()-1).getIdSerie()));
 
            /*Metodo para cargar combo de equipos*/          
            MtdLlenarComboEquipos(Integer.valueOf(LblCarga1.getText()));
                      
            //valida combo vacio
//            if(cmbEquipos.getSelectedIndex() != -1)
//            {
//                int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex());
//                //colocas idEquipo
//                lblEquipoParticipante.setText(String.valueOf(idEquipo));
//
//                //Metodo para cargar combo participante*/
//                MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblEquipoParticipante.getText()));
//                
//                //colocas idParticipante
//                jlIdApoderado.setText(String.valueOf(clscbsk.listaParticipantesEquipo(Integer.valueOf(lblEquipoParticipante.getText())).get(cmbParticipantes.getSelectedIndex()).getIdApoderado()));
//            }

            opt = 2;
          
        } catch (SQLException ex) {
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSerieItemStateChanged

    private void cmbEquiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEquiposItemStateChanged
//        try {
//            //valida combo vacio
//            if(cmbEquipos.getSelectedIndex() != -1)
//            {
//                int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex());
//                lblEquipoParticipante.setText(String.valueOf(idEquipo));
//                MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblEquipoParticipante.getText()));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_cmbEquiposItemStateChanged

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        t.start();
        btnIniciar.setEnabled(false);
        btnIniciar.setText("Reanudar");
        btnPausar.setEnabled(true);
        btnDetener.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        t.stop();
        btnIniciar.setEnabled(true);
        btnPausar.setEnabled(false);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        if(t.isRunning()) 
        {
            t.stop();
            btnIniciar.setEnabled(true);
        }
        btnIniciar.setText("Iniciar");
        btnPausar.setEnabled(false);
        btnDetener.setEnabled(false);
        h=0; m=0; s=0; cs=0;
        actualizarLabel();
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void btnEmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpateActionPerformed
        btnCanasta.setEnabled(false);
        try {
            //1. Verificar que idEquipos tienen el mismo puntaje
            MtdVerificarPuntajesIguales();
          
        } catch (SQLException ex) {
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnEmpateActionPerformed

    private void btnDesempateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesempateActionPerformed
        
        MtdUpdatePuntaje(); 
        txtPuntaje.setText(String.valueOf(0));
        btnCanasta.setEnabled(true);
        
    }//GEN-LAST:event_btnDesempateActionPerformed

    private void cmbAgregarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgregarParticipanteActionPerformed
     
        FrmParticipante participante = new FrmParticipante();
        //envias FrmSapito a FrmParticipante a traves del metodo FormularioFrmSapito
        participante.FormularioFrmLanzamientoCanasta(this);
        // participante.RecibeFormulario(this);
        //muestras el formulario
        participante.show();
    }//GEN-LAST:event_cmbAgregarParticipanteActionPerformed

    private void btnRegPtjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPtjeActionPerformed
        int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex()); 
        int puntajeEquipo = Integer.valueOf(txtPuntaje.getText());
        
        arrayIdEquipoDesempate.add(idEquipo);
        arrayPuntajeEquipoDesempate.add(puntajeEquipo);
        
        JOptionPane.showMessageDialog(null, "Se guardo correctamente el puntaje");
        txtPuntaje.setText(String.valueOf(0));
    }//GEN-LAST:event_btnRegPtjeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLanzamientoCanasta().setVisible(true);
            }
        });
    }

    private void SumarPuntaje(int _puntajeIndividual)
    {
        puntajeTotal = puntajeTotal + _puntajeIndividual;        
        txtPuntaje.setText(String.valueOf(puntajeTotal));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCarga1;
    private javax.swing.JButton btnCanasta;
    private javax.swing.JButton btnDesempate;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnEmpate;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnRegPtje;
    private javax.swing.JButton cmbAgregarParticipante;
    private javax.swing.JComboBox<String> cmbEquipos;
    private javax.swing.JComboBox<String> cmbSerie;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlIdApoderado;
    private javax.swing.JLabel lblEquipoParticipante;
    private javax.swing.JTable tblPosiciones;
    public static javax.swing.JTextField txtPuntaje;
    // End of variables declaration//GEN-END:variables
 
    private void MtdUpdatePuntaje(){   

        int puntajeAntiguo=0;
        int puntajeNuevo=0;
        int exitosa=0;
        int puntajeBd = 0 ;
        //100
        //200
                
        for(int i = 0; i<arrayPuntajeEquipoDesempate.size();i++)
        {
            puntajeNuevo = arrayPuntajeEquipoDesempate.get(i); // puntajeNuevo = 200
            
            //Saltamos primera iteracion
            if(i > 0)
            {
                if(puntajeNuevo > puntajeAntiguo) // 2 > 25
                {
                    puntajeBd = circuitoBasketLog.puntajeEquipo(arrayIdEquipoDesempate.get(i));
                    exitosa = circuitoBasketLog.UpdatePuntaje
                                (
                                    arrayIdEquipoDesempate.get(i),
                                    puntajeBd+1
                                );
                }
                else if(puntajeNuevo < puntajeAntiguo) // 2 < 25
                {
                    puntajeBd = circuitoBasketLog.puntajeEquipo(arrayIdEquipoDesempate.get(i));
                    exitosa = circuitoBasketLog.UpdatePuntaje
                                (
                                    arrayIdEquipoDesempate.get(i),
                                    puntajeBd-1
                                );
                }
            }            
            puntajeAntiguo = puntajeNuevo; // puntajeAntiguo = 100
        }
        
        if(exitosa > 0)
        {
            JOptionPane.showMessageDialog(null, "Se actualizo el puntaje");
            ListarTabla();
        
            List<PkgEntidad.ClsCircuitoBasket> listas = circuitoBasketLog.listado();
            
            //Borrar datos de la tabla puntaje.
            circuitoBasketLog.BorrarDatosBasket();
            //validar jtable de posiciones
            for(PkgEntidad.ClsCircuitoBasket cb : listas)
            {
                circuitoBasketLog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }
        }
         else{
             JOptionPane.showMessageDialog(null, "NO se modifico el puntaje");
             
        }   
        
        arrayPuntajeEquipoDesempate.clear();
        arrayIdEquipoDesempate.clear();
    
    }

     private void MtdVerificarPuntajesIguales() throws SQLException {
      
        cmbEquipos.removeAllItems();
        arrayDetalleEquipos.clear();        
        arrayIdEquipos.clear();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        
        
        /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/
                
        List<ClsCircuitoBasket> listaPuntaje = circuitoBasketLog.listado();

        //obtener datos    
//      for (int i = 0; i < tblPosiciones.getRowCount(); i++) {
//       // almaceno los Id y puntajes de los Equipos en un arrayList
//       int[] idEqyPunt = {(Integer) tblPosiciones.getModel().getValueAt(i, 0),  
//           (Integer) tblPosiciones.getModel().getValueAt(i, 1)};
//        arrayPuntajes.add(idEqyPunt);      
//      }

      //int index=0;        
      //obtener puntajes iguales y su id
      int puntajeReferenciaOld=0;
      int puntajeReferenciaNew=0;
      //boolean primeraIteracion = false;
      
      
      for(int i = 0; i< listaPuntaje.size(); i++)
      {
            puntajeReferenciaOld = listaPuntaje.get(i).getPuntajeEquipo();
            
            if(puntajeReferenciaOld == puntajeReferenciaNew)// 5-12-2   ::26
            {
                arrayDetalleEquipos.add(listaPuntaje.get(i-1).getNombreEquipo());
                arrayDetalleEquipos.add(listaPuntaje.get(i).getNombreEquipo());
                
                arrayIdEquipos.add(listaPuntaje.get(i-1).getIdEquipo());
                arrayIdEquipos.add(listaPuntaje.get(i).getIdEquipo());
            }
            
            puntajeReferenciaNew = listaPuntaje.get(i).getPuntajeEquipo();
      }
      
      for(int j = 0; j < arrayDetalleEquipos.size(); j++)
      {
        for(int k = 0; k< arrayDetalleEquipos.size(); k++)
        {
            //Permite comparar con valores diferentes
            if(j != k)
            {
                //Si los valores son iguales se eliminan del array
                if( arrayDetalleEquipos.get(j).equals(arrayDetalleEquipos.get(k)) )
                {
                    arrayDetalleEquipos.remove(j);
                    arrayIdEquipos.remove(j);
                }
            }
        }    
      }
      
      for(String s : arrayDetalleEquipos)
      {
          dcmEquipos.addElement(s);
      }
      
      cmbEquipos.setModel(dcmEquipos);  
    }

    private void MtdLlenarComboEquipos(int _idSerie) throws SQLException {
        List<ClsEquipo> listaEquipo = circuitoBasketLog.listaEquipos(_idSerie);
        cmbEquipos.removeAllItems();
        arrayIdEquipos.clear();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        
        boolean carga = true;
        
        /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/
        List<ClsCircuitoBasket> listaPuntaje = circuitoBasketLog.listado();
        for(ClsEquipo e : listaEquipo) //recorre equipos completo
        {
            for(ClsCircuitoBasket cb : listaPuntaje) //recorre equipos con puntaje
            {
                if(e.getIdEquipo() == cb.getIdEquipo()) //2 != 4 // 2 = 2
                {                    
                    carga = false;                    
                }          
            } 
            if(carga)
            {
                dcmEquipos.addElement(e.getNombreEquipo());
                arrayIdEquipos.add(e.getIdEquipo());
            }
            carga = true;
        }    
        cmbEquipos.setModel(dcmEquipos);  
    }
   
}
