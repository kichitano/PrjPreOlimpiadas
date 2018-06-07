package PkgPresentacion;

import PkgEntidad.ClsEquipo;
import PkgLogico.ClsCircuitoBasketLog;
import PkgLogico.ClsRecogedorPelotasLog;
import PkgNegocios.ClsConexion;
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
public class FrmRecogedorPelotas extends javax.swing.JFrame {
    //instancias de clases
    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    ArrayList<Integer> arrayIdEquipos = new ArrayList();
    ClsRecogedorPelotasLog rplog = new ClsRecogedorPelotasLog();
    PkgEntidad.ClsRecogedorPelotas rpEnt = new PkgEntidad.ClsRecogedorPelotas();
    ClsCircuitoBasketLog circuitoBasketLog = new ClsCircuitoBasketLog();
    
    //variables
    int opt = 1;
    //Arrays
    ArrayList<String> arrayDetalleEquipos = new ArrayList();
    
    public FrmRecogedorPelotas() {
        initComponents();
        t = new Timer(10, acciones);
        cmbSerie.setEnabled(true);
        MtdSerie();
        ListarTabla();
        DeshabilitarControles();
    }
    // Color jtable
     public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRenderer());
        }
    }
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
    public void DeshabilitarControles(){
        lblEquipoParticipante.setVisible(false);
        LblCarga1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbSerie = new javax.swing.JComboBox<>();
        LblCarga1 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPosiciones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cmbEquipos = new javax.swing.JComboBox<>();
        lblEquipoParticipante = new javax.swing.JLabel();
        btnAgregarParticipante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEmpate = new javax.swing.JButton();
        btnDesempate = new javax.swing.JButton();
        btnLanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lanzamientoPelota.png"))); // NOI18N
        jLabel15.setText("Recogedor de Pelotas");
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

        LblCarga1.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblCarga1)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCarga1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        etiquetaTiempo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/temporizador.png"))); // NOI18N

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        tblPosiciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipo Participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        jPanel2.setToolTipText("Equipo Participante");

        cmbEquipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEquiposItemStateChanged(evt);
            }
        });

        lblEquipoParticipante.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEquipoParticipante.setForeground(new java.awt.Color(0, 51, 204));
        lblEquipoParticipante.setText("id");

        btnAgregarParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add-user-symbol-of-interface.png"))); // NOI18N
        btnAgregarParticipante.setBorderPainted(false);
        btnAgregarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblEquipoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquipoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/jugador3.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/jugador1.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/jugador2.png"))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N

        jLabel6.setText("Puntaje:");

        btnEmpate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/igual (4).png"))); // NOI18N
        btnEmpate.setText("Empate");
        btnEmpate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpateActionPerformed(evt);
            }
        });

        btnDesempate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/no-es-igual-a.png"))); // NOI18N
        btnDesempate.setText("Desempate");
        btnDesempate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesempateActionPerformed(evt);
            }
        });

        btnLanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bola.png"))); // NOI18N
        btnLanzar.setText("Lanzar pelota");
        btnLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLanzar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEmpate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesempate)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpate)
                    .addComponent(btnDesempate)
                    .addComponent(btnLanzar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4))
                    .addComponent(etiquetaTiempo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIniciar)
                        .addGap(29, 29, 29)
                        .addComponent(btnPausar)
                        .addGap(15, 15, 15)
                        .addComponent(btnDetener)))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(etiquetaTiempo)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar)
                            .addComponent(btnPausar)
                            .addComponent(btnDetener))
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            if(cmbEquipos.getSelectedIndex() != -1)
            {
                int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex());
                //colocas idEquipo
                lblEquipoParticipante.setText(String.valueOf(idEquipo));   
            }

            opt = 2;
          
        } catch (SQLException ex) {
            Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSerieItemStateChanged

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

    private void cmbEquiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEquiposItemStateChanged
        try {

            //valida combo vacio
            if(cmbEquipos.getSelectedIndex() != -1)
            {
                int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex());
                lblEquipoParticipante.setText(String.valueOf(idEquipo));
            }

        } catch (Exception ex) {
            Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbEquiposItemStateChanged

    private void btnLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarActionPerformed
        ClsConexion conexion = new ClsConexion();
        Connection con = conexion.getConecion();    
       // PkgEntidad.ClsRecogedorPelotas rpEnt = null;
        int id;String posicion;
        try {
            rpEnt = new PkgEntidad.ClsRecogedorPelotas
                      (Integer.valueOf(arrayIdEquipos.get(cmbEquipos.getSelectedIndex())),
                              Integer.valueOf(txtValor.getText())
                              );
        } catch (Exception ex) {
            Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean resp = rplog.AgregarRecogedorPelotas(rpEnt,con);
        if (resp == false) {
            JOptionPane.showMessageDialog(null, "Dato Agregdo");
            ListarTabla();
        
            List<PkgEntidad.ClsRecogedorPelotas> listas = rplog.listado();
            
            //Borrar datos de la tabla puntaje.
            rplog.BorrarDatosRecogedorPelotas();
            for(PkgEntidad.ClsRecogedorPelotas cb : listas)
            {
                rplog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }  
            txtValor.setText("");
            try {
                MtdLlenarComboEquipos(Integer.valueOf(LblCarga1.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dato no Agregdo");
        }
        
    }//GEN-LAST:event_btnLanzarActionPerformed

    private void btnEmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpateActionPerformed
       btnLanzar.setEnabled(false);
       
       try{
           MtdVerificarPuntajesIguales();
       }catch(SQLException ex){
            Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnEmpateActionPerformed

    private void btnDesempateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesempateActionPerformed
         MtdUpdatePuntaje();
         btnLanzar.setEnabled(true);
      
    }//GEN-LAST:event_btnDesempateActionPerformed

    private void btnAgregarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarParticipanteActionPerformed

        //Instancias la clase participante
        FrmParticipante participante = new FrmParticipante();
        //envias FrmSapito a FrmParticipante a traves del metodo FormularioFrmSapito
        participante.FormularioFrmRecogedorPelotas(this);
        // participante.RecibeFormulario(this);
        //muestras el formulario
        participante.show();
    }//GEN-LAST:event_btnAgregarParticipanteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRecogedorPelotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCarga1;
    private javax.swing.JButton btnAgregarParticipante;
    private javax.swing.JButton btnDesempate;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnEmpate;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLanzar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JComboBox<String> cmbEquipos;
    private javax.swing.JComboBox<String> cmbSerie;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEquipoParticipante;
    private javax.swing.JTable tblPosiciones;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    public void MtdSerie(){
        try{
            for(int i = 0; i < metodosVariados.listaSerie().size(); i++){
                cmbSerie.addItem(metodosVariados.listaSerie().get(i).getDescripcionSerie());
            }
        }catch(SQLException e){
            Logger.getLogger(FrmRecogedorPelotas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void ListarTabla() {
        List<PkgEntidad.ClsRecogedorPelotas> listas = rplog.listado();
        tblPosiciones.setModel(new ModeloTablaRecogedorPelotas(listas)); //Lista posicion
        setCellRender(tblPosiciones);
        tblPosiciones.getRowSorter();
        TableColumnModel columnModel = tblPosiciones.getColumnModel();
        // tamaño a cada columna de un jtable
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);

    }
    private void MtdLlenarComboEquipos(int _idSerie) throws SQLException {
        List<ClsEquipo> listaEquipo = circuitoBasketLog.listaEquipos(_idSerie);
        cmbEquipos.removeAllItems();
        arrayIdEquipos.clear();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        
        boolean carga = true;
        
        /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/
        List<PkgEntidad.ClsRecogedorPelotas> listaPuntaje = rplog.listado();
        for(ClsEquipo e : listaEquipo) //recorre equipos completo
        {
            for(PkgEntidad.ClsRecogedorPelotas cb : listaPuntaje) //recorre equipos con puntaje
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
    private void MtdVerificarPuntajesIguales() throws SQLException {
      
    cmbEquipos.removeAllItems();
    arrayDetalleEquipos.clear();        
    arrayIdEquipos.clear();
    DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        

    /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/

    List<PkgEntidad.ClsRecogedorPelotas> listaPuntaje = rplog.listado();

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
    private void MtdUpdatePuntaje(){   

        int idEquipo = arrayIdEquipos.get(cmbEquipos.getSelectedIndex()); 
        int puntajeEquipo = Integer.valueOf(txtValor.getText());
        
        int exitosa = rplog.UpdatePuntaje(idEquipo,puntajeEquipo);
        if(exitosa > 0){
            JOptionPane.showMessageDialog(null, "Dato Modificado");
            ListarTabla();
        
            List<PkgEntidad.ClsRecogedorPelotas> listas = rplog.listado();
            
            //Borrar datos de la tabla puntaje.
            rplog.BorrarDatosRecogedorPelotas();
            //validar jtable de posiciones
            for(PkgEntidad.ClsRecogedorPelotas cb : listas)
            {
                rplog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }
            
            txtValor.setText("");
            
        }else{
             JOptionPane.showMessageDialog(null, "Dato NO Modificado");
        }
       
    }
}

