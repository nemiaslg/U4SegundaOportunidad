package com.mycompany.hospitalbd;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;

public class Consultorio extends javax.swing.JFrame {

    private ControladorPaciente controladorPaciente;
    private ControladorCita controladorCita;
    private ControladorConsulta controladorConsulta;
    private ControladorReceta controladorReceta;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Consultorio.class.getName());

    public Consultorio() {
        initComponents();

        controladorPaciente = new ControladorPaciente();
        controladorCita = new ControladorCita();
        controladorConsulta = new ControladorConsulta();
        controladorReceta = new ControladorReceta();

    }

    private void limpiarCamposReceta() {
        txtIDReceta.setText("");
        txtIdConsultaReceta.setText("");
        txtMedicamento.setText("");
        txtDosis.setText("");
        txtFrecuencia.setText("");
        txtDuracion.setText("");
        txtIndicaciones.setText("");
        txtObservacionesReceta.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacionesCita = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtMotivoCita = new javax.swing.JTextArea();
        btnGuardarCita = new javax.swing.JButton();
        txtIdCitaRegistro = new javax.swing.JTextField();
        txtIdPacienteCita = new javax.swing.JTextField();
        dateFechaCita = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        btnMostraPacientes = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        txtIdCita2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        txtIdConsulta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacionesSalida = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        txtPresionArterial = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacionesConsulta = new javax.swing.JTextArea();
        txtEstadoConsulta = new javax.swing.JTextField();
        dateFechaIngreso = new com.toedter.calendar.JDateChooser();
        dateFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        btnGuardarConsulta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIDReceta = new javax.swing.JTextField();
        txtMedicamento = new javax.swing.JTextField();
        txtObservacionesReceta = new javax.swing.JTextField();
        txtIndicaciones = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnGuardarReceta = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtIdConsultaReceta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFrecuencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        btnGenerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id_paciente");

        jLabel2.setText(" nombre");

        jLabel3.setText("apellido paterno");

        jLabel4.setText("apellido materno");

        jLabel5.setText("fecha nacimiento");

        jLabel6.setText("Peso");

        jLabel9.setText("activo");

        jTextField1.setEditable(false);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel8.setText("edad");

        jLabel10.setText("fecha registro");

        jButton1.setText("Registrar Paciente");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel11.setText("Genero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Paciente", jPanel1);

        jLabel20.setText("ID cita:");

        jLabel33.setText("ID paciente:");

        jLabel34.setText("Fecha de cita:");

        jLabel35.setText("Motivo");

        jLabel36.setText("Observaciones");

        txtObservacionesCita.setColumns(20);
        txtObservacionesCita.setRows(5);
        jScrollPane1.setViewportView(txtObservacionesCita);

        txtMotivoCita.setColumns(20);
        txtMotivoCita.setRows(5);
        jScrollPane5.setViewportView(txtMotivoCita);

        btnGuardarCita.setText("Guardar Cita");
        btnGuardarCita.addActionListener(this::btnGuardarCitaActionPerformed);

        txtIdCitaRegistro.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCitaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPacienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarCita)
                .addGap(195, 195, 195))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel33)
                    .addComponent(txtIdCitaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPacienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(dateFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(95, 95, 95)
                .addComponent(btnGuardarCita)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cita", jPanel3);

        btnMostraPacientes.setText("Mostrar Pacientes");
        btnMostraPacientes.addActionListener(this::btnMostraPacientesActionPerformed);

        jLabel21.setText("id consulta ");

        jLabel22.setText("id cita");

        jLabel23.setText("fecha  ingreso ");

        jLabel24.setText("fecha salida ");

        jLabel25.setText("diagnostico");

        txtTratamiento.setColumns(20);
        txtTratamiento.setRows(5);
        jScrollPane2.setViewportView(txtTratamiento);

        txtIdConsulta.setEditable(false);

        jLabel26.setText("observaciones consulta ");

        jLabel27.setText("observaciones salida");

        txtObservacionesSalida.setColumns(20);
        txtObservacionesSalida.setRows(5);
        jScrollPane3.setViewportView(txtObservacionesSalida);

        jLabel28.setText("temperatura ");

        jLabel29.setText("presion arterial");

        jLabel30.setText("tratamiento ");

        jLabel31.setText("estado consulta");

        txtObservacionesConsulta.setColumns(20);
        txtObservacionesConsulta.setRows(5);
        jScrollPane4.setViewportView(txtObservacionesConsulta);

        jLabel19.setText("Seleccione un paciente:");

        btnGuardarConsulta.setText("Guardar Consulta");
        btnGuardarConsulta.addActionListener(this::btnGuardarConsultaActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(dateFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdCita2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEstadoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostraPacientes))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(202, 202, 202)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarConsulta)
                .addGap(244, 244, 244))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(txtIdCita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addComponent(dateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addComponent(dateFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtEstadoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostraPacientes)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarConsulta)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel4);

        jLabel13.setText("id receta");

        jLabel14.setText("medicamento ");

        jLabel15.setText("Observaciones");

        jLabel16.setText("Indicaciones");

        txtIDReceta.setEditable(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sigue internado");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("dado de alta");

        btnGuardarReceta.setText("Guardar");
        btnGuardarReceta.addActionListener(this::btnGuardarRecetaActionPerformed);

        jLabel32.setText("id consulta");

        jLabel12.setText("Dosis: ");

        jLabel17.setText("Frecuencia: ");

        jLabel18.setText("Duracion: ");

        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addActionListener(this::btnGenerarPDFActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(80, 80, 80)
                                .addComponent(btnGuardarReceta)
                                .addGap(68, 68, 68)
                                .addComponent(btnGenerarPDF))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtObservacionesReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdConsultaReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtIDReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtIdConsultaReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtObservacionesReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(btnGuardarReceta)
                    .addComponent(btnGenerarPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Receta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        // TODO add your handling code here:
        try {

            if (txtMedicamento.getText().trim().isEmpty()
                    || txtDosis.getText().trim().isEmpty()
                    || txtFrecuencia.getText().trim().isEmpty()
                    || txtDuracion.getText().trim().isEmpty()
                    || txtIndicaciones.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Complete los datos de la receta antes "
                        + "de generar el PDF."
                );

                return;
            }

            if (txtIDReceta.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Primero guarde la receta."
                );

                return;
            }

            int idReceta = Integer.parseInt(
                    txtIDReceta.getText().trim()
            );

            String nombrePaciente
                    = controladorReceta.obtenerNombrePaciente(idReceta);

            if (nombrePaciente == null) {

                JOptionPane.showMessageDialog(
                        this,
                        "No se encontró el paciente asociado a la receta."
                );

                return;
            }

            Receta receta = new Receta();

            receta.setIdConsulta(
                    Integer.parseInt(
                            txtIdConsultaReceta
                                    .getText()
                                    .trim()
                    )
            );

            receta.setIdReceta(idReceta);

            receta.setMedicamento(
                    txtMedicamento.getText().trim()
            );

            receta.setDosis(
                    txtDosis.getText().trim()
            );

            receta.setFrecuencia(
                    txtFrecuencia.getText().trim()
            );

            receta.setDuracion(
                    txtDuracion.getText().trim()
            );

            receta.setIndicaciones(
                    txtIndicaciones.getText().trim()
            );

            receta.setFechaEmision(
                    new java.sql.Timestamp(
                            System.currentTimeMillis()
                    )
            );

            boolean generado
                    = GeneradorPDFReceta.generar(
                            receta,
                            nombrePaciente,
                            txtObservacionesReceta
                                    .getText()
                                    .trim()
                    );

            if (generado) {

                JOptionPane.showMessageDialog(this, """
                    PDF generado correctamente.
                    Se guard\u00f3 en la carpeta RecetasHospital.""");
                limpiarCamposReceta();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "No se pudo generar el PDF."
                );
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "El ID de la consulta debe ser "
                    + "un número entero."
            );

        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al generar el PDF: "
                    + e.getMessage()
            );

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnGuardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRecetaActionPerformed
        try {
            // Validar campos obligatorios
            if (txtMedicamento.getText().trim().isEmpty()
                    || txtDosis.getText().trim().isEmpty()
                    || txtFrecuencia.getText().trim().isEmpty()
                    || txtDuracion.getText().trim().isEmpty()
                    || txtIndicaciones.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Complete todos los datos de la receta."
                );
                return;
            }

            // Convertir el ID de consulta
            int idConsulta = Integer.parseInt(
                    txtIdConsultaReceta.getText().trim()
            );

            // Crear el objeto Receta
            Receta receta = new Receta();

            receta.setIdConsulta(idConsulta);
            receta.setMedicamento(txtMedicamento.getText().trim());
            receta.setDosis(txtDosis.getText().trim());
            receta.setFrecuencia(txtFrecuencia.getText().trim());
            receta.setDuracion(txtDuracion.getText().trim());
            receta.setIndicaciones(txtIndicaciones.getText().trim());

            receta.setFechaEmision(
                    new java.sql.Timestamp(System.currentTimeMillis())
            );

            // Guardar usando el controlador
            int idRecetaGenerado
                    = controladorReceta.guardarReceta(receta);

            if (idRecetaGenerado > 0) {

                receta.setIdReceta(idRecetaGenerado);

                txtIDReceta.setText(
                        String.valueOf(idRecetaGenerado)
                );

                JOptionPane.showMessageDialog(
                        this,
                        """
                        Receta registrada correctamente.
                        ID generado: """
                        + idRecetaGenerado
                );

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "No se pudo registrar la receta."
                );
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "El ID de la consulta debe ser un número entero."
            );

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al registrar la receta: " + e.getMessage()
            );

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarRecetaActionPerformed

    private void btnGuardarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConsultaActionPerformed
        // TODO add your handling code here:
        try {

            // Validaciones
            if (txtIdCita2.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese el ID de la cita.");
                return;
            }

            if (dateFechaIngreso.getDate() == null) {
                JOptionPane.showMessageDialog(this,
                        "Seleccione la fecha de ingreso.");
                return;
            }

            if (txtDiagnostico.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese el diagnóstico.");
                return;
            }

            if (txtTemperatura.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese la temperatura.");
                return;
            }

            if (txtPresionArterial.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese la presión arterial.");
                return;
            }

            if (txtTratamiento.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese el tratamiento.");
                return;
            }

            if (txtEstadoConsulta.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese el estado de la consulta.");
                return;
            }

            Consulta consulta = new Consulta();

            consulta.setIdCita(
                    Integer.parseInt(txtIdCita2.getText().trim())
            );

            consulta.setFechaIngreso(
                    new java.sql.Timestamp(
                            dateFechaIngreso.getDate().getTime())
            );

            if (dateFechaSalida.getDate() != null) {
                consulta.setFechaSalida(
                        new java.sql.Timestamp(
                                dateFechaSalida.getDate().getTime()));
            } else {
                consulta.setFechaSalida(null);
            }

            consulta.setDiagnostico(
                    txtDiagnostico.getText().trim());

            consulta.setObservacionesConsulta(
                    txtObservacionesConsulta.getText().trim());

            consulta.setObservacionesSalida(
                    txtObservacionesSalida.getText().trim());

            consulta.setTemperatura(
                    Double.parseDouble(
                            txtTemperatura.getText().trim()));

            consulta.setPresionArterial(
                    txtPresionArterial.getText().trim());

            consulta.setTratamiento(
                    txtTratamiento.getText().trim());

            consulta.setEstadoConsulta(
                    txtEstadoConsulta.getText().trim());

            boolean guardada
                    = controladorConsulta.guardarConsulta(consulta);

            if (guardada) {

                JOptionPane.showMessageDialog(this,
                        "Consulta registrada correctamente.");

                limpiarCamposConsulta();

            } else {

                JOptionPane.showMessageDialog(this,
                        "No se pudo registrar la consulta.");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "El ID de cita y la temperatura deben ser numéricos.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this,
                    "Error: " + e.getMessage());

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarConsultaActionPerformed

    private void btnMostraPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraPacientesActionPerformed
        // TODO add your handling code here:
        try {
            // 1. Instanciamos el DAO y obtenemos la lista de pacientes
            PacienteDAO pacienteDAO = new PacienteDAO();
            List<Paciente> listaPacientes = pacienteDAO.listar();

            if (listaPacientes.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No hay pacientes registrados en la base de datos.",
                        "Sin Registros",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // 2. Definimos las columnas que queremos mostrar en la tabla
            String[] columnas = {"ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Género", "Edad", "Peso (kg)"};

            // 3. Creamos el modelo de la tabla (sin permitir que el usuario edite las celdas directamente)
            javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Hace que la tabla sea de solo lectura
                }
            };

            // 4. Llenamos el modelo con los datos de los pacientes
            for (Paciente p : listaPacientes) {
                Object[] fila = {
                    p.getIdPaciente(),
                    p.getNombre(),
                    p.getApp(),
                    p.getApm(),
                    p.getGenero(),
                    p.getEdad(),
                    p.getPeso()
                };
                modelo.addRow(fila);
            }

            // 5. Creamos la JTable con el modelo y la envolvemos en un scroll pane
            javax.swing.JTable tabla = new javax.swing.JTable(modelo);

            // Ajustes estéticos rápidos
            tabla.getTableHeader().setReorderingAllowed(false); // Evita mover columnas
            javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(tabla);
            scrollPane.setPreferredSize(new java.awt.Dimension(700, 350)); // Dimensiones de la tabla

            // 6. Mostramos el diálogo emergente con la tabla de datos
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    scrollPane,
                    "Listado General de Pacientes",
                    javax.swing.JOptionPane.PLAIN_MESSAGE
            );

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al cargar los pacientes: " + e.getMessage(),
                    "Error de Conexión",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMostraPacientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            Paciente p = new Paciente();

            // Nombre y apellidos
            p.setNombre(jTextField2.getText());
            p.setApp(jTextField3.getText());
            p.setApm(jTextField4.getText());

            // Género
            p.setGenero(jTextField6.getText());

            // Fecha de nacimiento
            if (jDateChooser3.getDate() == null) {
                JOptionPane.showMessageDialog(this,
                        "Seleccione la fecha de nacimiento.");
                return;
            }

            p.setFechaNacimiento(
                    new java.sql.Date(jDateChooser3.getDate().getTime()));

            // Edad
            p.setEdad(Integer.parseInt(jTextField7.getText()));

            // Peso
            p.setPeso(Double.parseDouble(jTextField8.getText()));

            // Fecha de registro (fecha y hora actual)
            p.setFechaRegistro(
                    new java.sql.Timestamp(System.currentTimeMillis()));

            // Activo
            p.setActivo(jCheckBox1.isSelected());

            // Fecha de salida
            p.setFechaSalida(null);

            if (controladorPaciente.guardarPaciente(p)) {

                JOptionPane.showMessageDialog(this,
                        "Paciente registrado correctamente.");

            } else {

                JOptionPane.showMessageDialog(this,
                        "No se pudo registrar el paciente.");

            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Edad o peso tienen un formato incorrecto.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this,
                    "Error: " + e.getMessage());

            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed
        // TODO add your handling code here:
        try {

            if (txtIdPacienteCita.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Ingrese el ID del paciente."
                );
                return;
            }

            if (dateFechaCita.getDate() == null) {
                JOptionPane.showMessageDialog(
                        this,
                        "Seleccione la fecha de la cita."
                );
                return;
            }

            if (txtMotivoCita.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Ingrese el motivo de la cita."
                );
                return;
            }

            int idPaciente = Integer.parseInt(
                    txtIdPacienteCita.getText().trim()
            );

            Cita cita = new Cita();

            cita.setIdPaciente(idPaciente);

            cita.setFechaCita(
                    new java.sql.Timestamp(
                            dateFechaCita.getDate().getTime()
                    )
            );

            cita.setMotivoCita(
                    txtMotivoCita.getText().trim()
            );

            cita.setObservaciones(
                    txtObservacionesCita.getText().trim()
            );

            cita.setFechaRegistro(
                    new java.sql.Timestamp(
                            System.currentTimeMillis()
                    )
            );

            boolean guardada
                    = controladorCita.guardarCita(cita);

            if (guardada) {

                JOptionPane.showMessageDialog(
                        this,
                        "Cita registrada correctamente."
                );

                limpiarCamposCita();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "No se pudo registrar la cita. "
                        + "Verifique que el ID del paciente exista."
                );
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "El ID del paciente debe ser un número entero."
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al registrar la cita: "
                    + e.getMessage()
            );

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void limpiarCamposCita() {

        txtIdCitaRegistro.setText("");
        txtIdPacienteCita.setText("");

        dateFechaCita.setDate(null);

        txtMotivoCita.setText("");
        txtObservacionesCita.setText("");
    }

    private void limpiarCamposConsulta() {

        txtIdConsulta.setText("");
        txtIdCita2.setText("");

        dateFechaIngreso.setDate(null);
        dateFechaSalida.setDate(null);

        txtDiagnostico.setText("");

        txtObservacionesConsulta.setText("");
        txtObservacionesSalida.setText("");

        txtTemperatura.setText("");
        txtPresionArterial.setText("");

        txtTratamiento.setText("");

        txtEstadoConsulta.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            com.mycompany.hospitalbd.Consultorio ventana
                    = new com.mycompany.hospitalbd.Consultorio();

            ventana.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnGuardarCita;
    private javax.swing.JButton btnGuardarConsulta;
    private javax.swing.JButton btnGuardarReceta;
    private javax.swing.JButton btnMostraPacientes;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateFechaCita;
    private com.toedter.calendar.JDateChooser dateFechaIngreso;
    private com.toedter.calendar.JDateChooser dateFechaSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEstadoConsulta;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtIDReceta;
    private javax.swing.JTextField txtIdCita2;
    private javax.swing.JTextField txtIdCitaRegistro;
    private javax.swing.JTextField txtIdConsulta;
    private javax.swing.JTextField txtIdConsultaReceta;
    private javax.swing.JTextField txtIdPacienteCita;
    private javax.swing.JTextField txtIndicaciones;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextArea txtMotivoCita;
    private javax.swing.JTextArea txtObservacionesCita;
    private javax.swing.JTextArea txtObservacionesConsulta;
    private javax.swing.JTextField txtObservacionesReceta;
    private javax.swing.JTextArea txtObservacionesSalida;
    private javax.swing.JTextField txtPresionArterial;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
