/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgPresentacion;

import PkgEntidad.ClsEquipo;
import PkgLogico.ClsSapitoLog;
import PkgNegocios.ClsConexion;
import PkgNegocios.ClsMetodosVariados;
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
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Vera
 */
public class FrmSapito extends javax.swing.JFrame {
    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    ClsSapitoLog sapitoLog = new ClsSapitoLog();
    PkgNegocios.ClsSapito sapitoNeg = new PkgNegocios.ClsSapito();
    
    ArrayList<Integer> arrayIdEquipos = new ArrayList();
    ArrayList<Integer> arrayIdEquiposParticipantes = new ArrayList();
    ArrayList<String> arrayDetalleEquipos = new ArrayList();
    
    // Declaracion de Variables
    boolean participanteJugando = false;
    int opt = 1;
    int puntajeSapito = 0;
    private int puntajeTotal=0;
    int contador = 0;
    /**
     * Creates new form FrmSapito
     */
    public FrmSapito() {
        initComponents();
        cmbSerie.setEnabled(true);
      //  esconderControles();
        MtdLlenarComboSeries(); 
        ListarTabla();
    }
    // Metodos de visualización de formulario
     public void esconderControles(){
        lblIdParticipante.setVisible(false);
        lblIdEquipo.setVisible(false);
        lblIdSerie.setVisible(false);
        lblPuntaje.setVisible(false);
     }
    // Color jtable
     public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRenderer());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbSerie = new javax.swing.JComboBox<>();
        lblIdSerie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEmpate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPosiciones = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        cmbParticipantes = new javax.swing.JComboBox<>();
        btnParticipar = new javax.swing.JButton();
        btnDesempate = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cmbEq = new javax.swing.JComboBox<>();
        lblIdEquipo = new javax.swing.JLabel();
        btnAgregarParticipante = new javax.swing.JButton();
        lblPuntaje = new javax.swing.JLabel();
        lblIdParticipante = new javax.swing.JLabel();
        txtPuntajeAcumulado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblFichas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sapito.png"))); // NOI18N
        jLabel15.setText("Sapito");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Serie:");

        cmbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción" }));
        cmbSerie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSerieItemStateChanged(evt);
            }
        });

        lblIdSerie.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIdSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdSerie))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puntajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N

        btn1.setText("1000");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("500");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("700");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("500");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("500");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("400");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("600");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("400");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("2000");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setText("600");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setText("4000");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn15.setText("600");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn14.setText("400");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn13.setText("500");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn12.setText("300");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn16.setText("400");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setText("1000");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setText("500");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setText("700");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setText("500");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn13)
                    .addComponent(btn14)
                    .addComponent(btn15)
                    .addComponent(btn16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btn0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn20)))
                .addContainerGap())
        );

        btnEmpate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/igual (3).png"))); // NOI18N
        btnEmpate.setBorderPainted(false);
        btnEmpate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpateActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/check.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Participantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        jPanel7.setToolTipText("Participantes");

        cmbParticipantes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbParticipantesItemStateChanged(evt);
            }
        });

        btnParticipar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/checkParticipacion.png"))); // NOI18N
        btnParticipar.setBorderPainted(false);
        btnParticipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParticiparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnParticipar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnParticipar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnDesempate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/no-es-igual-a.png"))); // NOI18N
        btnDesempate.setBorderPainted(false);
        btnDesempate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesempateActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipo Participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        jPanel8.setToolTipText("Equipo Participante");

        cmbEq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEqItemStateChanged(evt);
            }
        });

        lblIdEquipo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblIdEquipo.setForeground(new java.awt.Color(0, 51, 204));
        lblIdEquipo.setText("id");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add-user-symbol-of-interface.png"))); // NOI18N
        btnAgregarParticipante.setBorderPainted(false);
        btnAgregarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarParticipanteActionPerformed(evt);
            }
        });

        lblPuntaje.setText("0");

        lblIdParticipante.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblIdParticipante.setForeground(new java.awt.Color(0, 51, 204));
        lblIdParticipante.setText("idP");

        txtPuntajeAcumulado.setText("0");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("Ptje. Acumulado:");
        jLabel1.setToolTipText("");

        lblFichas.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesempate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFichas)
                                    .addComponent(lblPuntaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPuntajeAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPuntaje)
                                    .addComponent(txtPuntajeAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDesempate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichas))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpateActionPerformed
        participanteJugando = false;
        contador = 1;
      //  btnGuardar.setEnabled(false);
        try {
            //1. Verificar que idEquipos tienen el mismo puntaje
            if(MtdVerificarPuntajesIguales())
            {
                JOptionPane.showMessageDialog(null, "No hay equipos empatados");
            }else{
                lblFichas.setText(String.valueOf(6));
                participanteJugando = true; //verifica que se presiono el btn Empate
                if(participanteJugando){ // verificando que se presiono el btn Empate
                    int idEquipo = arrayIdEquipos.get(cmbEq.getSelectedIndex());
                    MtdLlenarComboParticipantesEquipoEmpate(idEquipo);
                    //entonces llama al metodo de carga de comboBox de participantes que ya jugaron
                }
                else // NO se presiono el btnEmpate
                {
                     //Metodo para cargar combo participante*/
                     MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText()));
                }
            }           
        } catch (SQLException ex) {
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnEmpateActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ClsConexion conexion = new ClsConexion();
        Connection con = conexion.getConecion();    
        PkgEntidad.ClsSapito sap = null;
        int id;
        String posicion;
        
        try {
            sap = new PkgEntidad.ClsSapito
                      (Integer.valueOf(arrayIdEquipos.get(cmbEq.getSelectedIndex())),
                              Integer.valueOf(txtPuntajeAcumulado.getText())
                              );
        } catch (Exception ex) {
            Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean resp = sapitoLog.AgregarPuntajeSapito(sap,con);
        if (resp == false) {
            JOptionPane.showMessageDialog(null, "Dato Agregdo");
            ListarTabla();
        
            List<PkgEntidad.ClsSapito> listas = sapitoLog.listado();
            
            //Borrar datos de la tabla puntaje.
            sapitoLog.BorrarDatosSapito();
            for(PkgEntidad.ClsSapito cb : listas)
            {
                sapitoLog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }
//            contador = 0;
            txtPuntajeAcumulado.setText("");
            try {
                MtdLlenarComboEquipos(Integer.valueOf(lblIdSerie.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dato no Agregdo");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbParticipantesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbParticipantesItemStateChanged
        //JOptionPane.showMessageDialog(null, cmbParticipantes.getItemCount());
        try {
            //valida combo vacio
            if(cmbParticipantes.getSelectedIndex() != -1)
            {
                lblIdParticipante.setText(String.valueOf(sapitoNeg.listaParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText())).get(cmbParticipantes.getSelectedIndex()).getIdApoderado()));
                habilitarBotones();
            }

        } catch (Exception ex) {
            Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(contador == 1){
            lblFichas.setText(String.valueOf(6));
        }
    }//GEN-LAST:event_cmbParticipantesItemStateChanged

    private void btnDesempateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesempateActionPerformed
        MtdUpdatePuntaje();       
        contador = 0;
    }//GEN-LAST:event_btnDesempateActionPerformed

    private void cmbEqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEqItemStateChanged
        lblPuntaje.setText(String.valueOf(0));
        try{    
        //valida combo vacio
            if(cmbEq.getSelectedIndex() != -1)
            {
                int idEquipo = arrayIdEquipos.get(cmbEq.getSelectedIndex());
                lblIdEquipo.setText(String.valueOf(idEquipo));
               
                if(participanteJugando){ // verificando que se presiono el btn Empate
                    int idEquipos = arrayIdEquipos.get(cmbEq.getSelectedIndex());
                    MtdLlenarComboParticipantesEquipoEmpate(idEquipos);  //entonces llama al metodo de carga de comboBox de participantes que ya jugaron
                    
                    if(cmbParticipantes.getSelectedIndex() != -1)
                    {
                    lblIdParticipante.setText(String.valueOf(sapitoNeg.listaParticipantesEquipoEmpate(Integer.valueOf(lblIdEquipo.getText())).get(cmbParticipantes.getSelectedIndex()).getIdApoderado()));
                  
                    }
                }
                else // NO se presiono el btnEmpate
                {
                     //Metodo para cargar combo participante*/
                     MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText()));
                     if(cmbParticipantes.getSelectedIndex() != -1)
                     {
                     lblIdParticipante.setText(String.valueOf(sapitoNeg.listaParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText())).get(cmbParticipantes.getSelectedIndex()).getIdApoderado()));
                     }
                     if(cmbParticipantes.getItemCount()>0){
                     habilitarBotones();
                     }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbEqItemStateChanged

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
            participanteJugando =false;
            //id serie
            lblIdSerie.setText(String.valueOf(metodosVariados.listaSerie().get(cmbSerie.getSelectedIndex()-1).getIdSerie()));

            //Metodo carga Equipo y Participantes
            CargarComboEquipoParticipante();
            
            opt = 2;

        } catch (SQLException ex) {
            Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSerieItemStateChanged

    private void btnAgregarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarParticipanteActionPerformed
    
        //Instancias la clase participante
        FrmParticipante participante = new FrmParticipante();
        //envias FrmSapito a FrmParticipante a traves del metodo FormularioFrmSapito
        participante.FormularioFrmSapito(this);
     // participante.RecibeFormulario(this);
      //muestras el formulario
        participante.show();
    }//GEN-LAST:event_btnAgregarParticipanteActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        puntajeSapito = 1000;
      //  lblPuntaje.setText(String.valueOf(puntajeSapito));
       contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        puntajeSapito = 500;
     //   lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        puntajeSapito = 700;
       // lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        puntajeSapito = 500;
      //  lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        puntajeSapito = 500;
      //  lblPuntaje.setText(String.valueOf(puntajeSapito));
        
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       puntajeSapito = 400;
     //  lblPuntaje.setText(String.valueOf(puntajeSapito));
       
        contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        puntajeSapito = 600;
    //    lblPuntaje.setText(String.valueOf(puntajeSapito));
        
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        puntajeSapito = 400;
      //  lblPuntaje.setText(String.valueOf(puntajeSapito));
        
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        puntajeSapito = 2000;
       // lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        puntajeSapito = 600;
      //  lblPuntaje.setText(String.valueOf(puntajeSapito));
        
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        puntajeSapito = 4000;
        //lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
      puntajeSapito = 300;
  //    lblPuntaje.setText(String.valueOf(puntajeSapito));
   contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        puntajeSapito = 500;
       // lblPuntaje.setText(String.valueOf(puntajeSapito));
       
        contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        puntajeSapito = 400;
  //      lblPuntaje.setText(String.valueOf(puntajeSapito));
        contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
         puntajeSapito = 600;
       //  lblPuntaje.setText(String.valueOf(puntajeSapito));
         
          contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
       puntajeSapito = 400;
    //   lblPuntaje.setText(String.valueOf(puntajeSapito));
     contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
         puntajeSapito = 1000;
    //     lblPuntaje.setText(String.valueOf(puntajeSapito));
     contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
         puntajeSapito = 500;
        // lblPuntaje.setText(String.valueOf(puntajeSapito));
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
         puntajeSapito = 700;
      //   lblPuntaje.setText(String.valueOf(puntajeSapito));
       contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        puntajeSapito = 500;
       // lblPuntaje.setText(String.valueOf(puntajeSapito));
        contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btnParticiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParticiparActionPerformed
        try{
              MtdUpdateEstadoParticipante();
            /*  int puntajeIndividual;
              puntajeIndividual = Integer.parseInt(lblPuntaje.getText());
          //    SumarPuntaje(puntajeIndividual);*/
                habilitarBotones();
        }catch (SQLException ex) {
            Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnParticiparActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         puntajeSapito = 0;
         //lblPuntaje.setText(String.valueOf(puntajeSapito));
         
         contabilizarIntentosDeFichas(puntajeSapito);
    }//GEN-LAST:event_btn0ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSapito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSapito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSapito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSapito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSapito().setVisible(true);
            }
        });
    }
    private void SumarPuntaje(int _puntajeIndividual)
    {
        puntajeTotal = puntajeTotal + _puntajeIndividual;        
        txtPuntajeAcumulado.setText(String.valueOf(puntajeTotal));
    }
    
    public void CargarComboEquipoParticipante() throws SQLException
    {
        /*Metodo para cargar combo de equipos*/
            MtdLlenarComboEquipos(Integer.valueOf(lblIdSerie.getText()));

            //valida combo vacio
            if(cmbEq.getSelectedIndex() != -1)
            {
                int idEquipo = arrayIdEquipos.get(cmbEq.getSelectedIndex());
                //colocas idEquipo
                lblIdEquipo.setText(String.valueOf(idEquipo));
                
                if(participanteJugando){ // verificando que se presiono el btn Empate
                    MtdLlenarComboParticipantesEquipoEmpate(Integer.valueOf(lblIdEquipo.getText()));
                    //entonces llama al metodo de carga de comboBox de participantes que ya jugaron
                }
                else // NO se presiono el btnEmpate
                {
                     //Metodo para cargar combo participante*/
                     MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText()));
                }
               // sirve para verificar si el cmb esta vacio o no
                if(cmbParticipantes.getSelectedIndex() != -1)
                {
                    lblIdParticipante.setText(String.valueOf(sapitoNeg.listaParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText())).get(cmbParticipantes.getSelectedIndex()).getIdApoderado()));
                }
                //colocas idParticipante
                
            }
    }
    public void contabilizarIntentosDeFichas(int puntuacion){
        int valorInicial = Integer.valueOf(lblFichas.getText()); // nro de fichas (10)
        valorInicial -= 1;
        lblFichas.setText(String.valueOf(valorInicial));
        int ptjeAcumulado = Integer.valueOf(lblPuntaje.getText());  // ptje acumulado ahora 0
        int nuevoPuntaje = ptjeAcumulado + puntuacion;
        lblPuntaje.setText(String.valueOf(nuevoPuntaje));
        txtPuntajeAcumulado.setText(String.valueOf(nuevoPuntaje));
        if(valorInicial == 0){
           //bloquear
           JOptionPane.showMessageDialog(null, "Jugador termino sus fichas");
           deshabilitarBotones();
        } 
       
    }
    public void habilitarBotones(){
         btn1.setEnabled(true);
         btn2.setEnabled(true);
          btn3.setEnabled(true);
           btn4.setEnabled(true);
            btn5.setEnabled(true);
             btn6.setEnabled(true);
              btn7.setEnabled(true);
               btn8.setEnabled(true);
                btn9.setEnabled(true);
                 btn10.setEnabled(true);
                  btn11.setEnabled(true);
                   btn12.setEnabled(true);
                    btn13.setEnabled(true);
                     btn14.setEnabled(true);
                      btn15.setEnabled(true);
                       btn16.setEnabled(true);
                        btn17.setEnabled(true);
                         btn18.setEnabled(true);
                          btn19.setEnabled(true);
                           btn20.setEnabled(true);
                            btn0.setEnabled(true);
    }
    public void deshabilitarBotones(){
        btn1.setEnabled(false);
         btn2.setEnabled(false);
          btn3.setEnabled(false);
           btn4.setEnabled(false);
            btn5.setEnabled(false);
             btn6.setEnabled(false);
              btn7.setEnabled(false);
               btn8.setEnabled(false);
                btn9.setEnabled(false);
                 btn10.setEnabled(false);
                  btn11.setEnabled(false);
                   btn12.setEnabled(false);
                    btn13.setEnabled(false);
                     btn14.setEnabled(false);
                      btn15.setEnabled(false);
                       btn16.setEnabled(false);
                        btn17.setEnabled(false);
                         btn18.setEnabled(false);
                          btn19.setEnabled(false);
                           btn20.setEnabled(false);
                            btn0.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAgregarParticipante;
    private javax.swing.JButton btnDesempate;
    private javax.swing.JButton btnEmpate;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnParticipar;
    private javax.swing.JComboBox<String> cmbEq;
    private javax.swing.JComboBox<String> cmbParticipantes;
    private javax.swing.JComboBox<String> cmbSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFichas;
    public static javax.swing.JLabel lblIdEquipo;
    private javax.swing.JLabel lblIdParticipante;
    private javax.swing.JLabel lblIdSerie;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JTable tblPosiciones;
    private javax.swing.JTextField txtPuntajeAcumulado;
    // End of variables declaration//GEN-END:variables
    
    /* METODO PARA ACTUALIZAR ESTADOS Y PUNTAJES */
     private void MtdUpdateEstadoParticipante() throws SQLException{
        int idParticipante = Integer.valueOf(lblIdParticipante.getText());
      
        int exitosa = sapitoLog.UpdateEstadoApoderado(idParticipante);
        if(exitosa > 0){
            JOptionPane.showMessageDialog(null, "Estado de Participante Modificado");
            contador = 0;
            lblFichas.setText(String.valueOf(10));
            cmbParticipantes.removeAllItems();
            MtdLlenarComboParticipantesEquipo(Integer.valueOf(lblIdEquipo.getText()));
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Estado de Participante NO Modificado");
        }
    }
      private void MtdUpdatePuntaje(){   

        int idEquipo = arrayIdEquipos.get(cmbEq.getSelectedIndex()); 
        int puntajeEquipo = Integer.valueOf(lblPuntaje.getText());
        int div = 0;
        int resultado = 0;
        div = puntajeEquipo / 100;
        resultado = puntajeEquipo + div;
        txtPuntajeAcumulado.setText(String.valueOf(resultado));
        lblPuntaje.setText(String.valueOf(resultado));
        
        int exitosa = sapitoLog.UpdatePuntaje(idEquipo,resultado);
        if(exitosa > 0){
            JOptionPane.showMessageDialog(null, "Dato Modificado");
            ListarTabla();
        
            List<PkgEntidad.ClsSapito> listas = sapitoLog.listado();
            
            //Borrar datos de la tabla puntaje.
            sapitoLog.BorrarDatosSapito();
            //validar jtable de posiciones
            for(PkgEntidad.ClsSapito cb : listas)
            {
                sapitoLog.InsertarPosicion
                    (
                        cb.getIdEquipo(),
                        cb.getPuntajeEquipo(),
                        cb.getPosicionEquipo()
                    ); 
            }
//            
//            Limpiar();
            
        }else{
             JOptionPane.showMessageDialog(null, "Dato NO Modificado");
        }
       
    }

     private boolean MtdVerificarPuntajesIguales() throws SQLException {
      
        boolean noHayEmpates = true;
        cmbEq.removeAllItems();
        arrayDetalleEquipos.clear();        
        arrayIdEquipos.clear();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        
        
        /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/
                
        List<PkgEntidad.ClsSapito> listaPuntaje = sapitoLog.listado();

    
      //obtener puntajes iguales y su id
      int puntajeReferenciaOld=0;
      int puntajeReferenciaNew=0;    
      
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
      if(arrayDetalleEquipos.isEmpty())
      {
        noHayEmpates = true;

      }else{
         noHayEmpates = false;
           for(String s : arrayDetalleEquipos)
            {
                dcmEquipos.addElement(s);
            }
           cmbEq.setModel(dcmEquipos);  
      }
    
      return noHayEmpates;
      
    }

    /* METODO PARA LLENAR EL JTABLE */
    private void ListarTabla() {
        List<PkgEntidad.ClsSapito> listas = sapitoLog.listado();
        tblPosiciones.setModel(new ModeloTablaSapito(listas)); //Lista posicion
        setCellRender(tblPosiciones);
        tblPosiciones.getRowSorter();
        TableColumnModel columnModel = tblPosiciones.getColumnModel();
        // tamaño a cada columna de un jtable
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(200);

    }
    /* METODOS PARA LLENAR COMBOBOX */
    public void MtdLlenarComboSeries(){
          try{
              for(int i = 0; i < metodosVariados.listaSerie().size(); i++){
                  cmbSerie.addItem(metodosVariados.listaSerie().get(i).getDescripcionSerie());
              }
          }catch(SQLException e){
              Logger.getLogger(FrmSapito.class.getName()).log(Level.SEVERE, null, e);
          }
     }
    private void MtdLlenarComboEquipos(int _idSerie) throws SQLException {
        List<ClsEquipo> listaEquipo = sapitoLog.listaEquipos(_idSerie);
        cmbEq.removeAllItems();
        arrayIdEquipos.clear();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        
        boolean carga = true;
        
        /*Metodo para verificar que idEquipo se encuentran ya registrados en el jtable*/
        List<PkgEntidad.ClsSapito> listaPuntaje = sapitoLog.listado();
        for(ClsEquipo e : listaEquipo) //recorre equipos completo
        {
            for(PkgEntidad.ClsSapito cb : listaPuntaje) //recorre equipos con puntaje
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
        cmbEq.setModel(dcmEquipos);  
    }
      public void MtdLlenarComboParticipantesEquipo(int _idEquipo) throws SQLException {
        List<ClsEquipo> listsParticipantesEquipo = sapitoLog.listaParticipantesEquipo(_idEquipo);
        cmbParticipantes.removeAllItems();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        

        for(ClsEquipo e : listsParticipantesEquipo) //recorre equipos completo
        {
                dcmEquipos.addElement(e.getApePaterno() + " " + e.getApeMaterno() + ", " + e.getNombresApoderado());

        }    
        cmbParticipantes.setModel(dcmEquipos);  
    }
    private void MtdLlenarComboParticipantesEquipoEmpate(int _idEquipo) throws SQLException {
        List<ClsEquipo> listaParticipantesEquipoEmpate = sapitoLog.listaParticipantesEquipoEmpate(_idEquipo);
        cmbParticipantes.removeAllItems();
        DefaultComboBoxModel dcmEquipos = new DefaultComboBoxModel();        

        for(ClsEquipo e : listaParticipantesEquipoEmpate) //recorre equipos completo
        {
                dcmEquipos.addElement(e.getApePaterno() + " " + e.getApeMaterno() + ", " + e.getNombresApoderado());

        }    
        cmbParticipantes.setModel(dcmEquipos);  
    }
}

