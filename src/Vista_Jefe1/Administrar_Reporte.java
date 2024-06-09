/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista_Jefe1;

/**
 *
 * @author admin
 */
public class Administrar_Reporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reporte1
     */
    public Administrar_Reporte() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jdtcFechaEspecificada = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jbtnBuscarReporteFechaEspecifica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTablaReporteFechaEspecificada = new javax.swing.JTable();
        jlblTotalGanadoDia = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jdtcFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jbtnBuscarReporteFechaRango = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblTablaReporteRango = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jdtcFechaFin = new com.toedter.calendar.JDateChooser();
        jlblTotalGanadoRango = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(941, 526));
        setMinimumSize(new java.awt.Dimension(940, 526));
        setPreferredSize(new java.awt.Dimension(1121, 784));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdtcFechaEspecificada.setDateFormatString("yyyy-MM-dd");
        jdtcFechaEspecificada.setMaxSelectableDate(new java.util.Date(253370786512000L));
        jdtcFechaEspecificada.setMinSelectableDate(new java.util.Date(-2208966572000L));
        jdtcFechaEspecificada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jdtcFechaEspecificadaMousePressed(evt);
            }
        });
        jPanel14.add(jdtcFechaEspecificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fecha");
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jbtnBuscarReporteFechaEspecifica.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarReporteFechaEspecifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jPanel14.add(jbtnBuscarReporteFechaEspecifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 50, 40));

        jtblTablaReporteFechaEspecificada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblTablaReporteFechaEspecificada);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1060, 550));

        jlblTotalGanadoDia.setBackground(new java.awt.Color(102, 102, 102));
        jlblTotalGanadoDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTotalGanadoDia.setForeground(new java.awt.Color(0, 0, 204));
        jlblTotalGanadoDia.setText("Ingreso del Dia:  S/.");
        jlblTotalGanadoDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.add(jlblTotalGanadoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 190, 40));

        jTabbedPane1.addTab("FECHA ESPECIFICADA", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdtcFechaInicio.setDateFormatString("yyyy-MM-dd");
        jdtcFechaInicio.setMaxSelectableDate(new java.util.Date(253370786512000L));
        jdtcFechaInicio.setMinSelectableDate(new java.util.Date(-2208966572000L));
        jdtcFechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jdtcFechaInicioMousePressed(evt);
            }
        });
        jPanel15.add(jdtcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Inicio");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jbtnBuscarReporteFechaRango.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarReporteFechaRango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jPanel15.add(jbtnBuscarReporteFechaRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, 40));

        jtblTablaReporteRango.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblTablaReporteRango);

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1060, 550));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Fin");
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));

        jdtcFechaFin.setDateFormatString("yyyy-MM-dd");
        jdtcFechaFin.setMaxSelectableDate(new java.util.Date(253370786512000L));
        jdtcFechaFin.setMinSelectableDate(new java.util.Date(-2208966572000L));
        jdtcFechaFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jdtcFechaFinMousePressed(evt);
            }
        });
        jPanel15.add(jdtcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 40));

        jlblTotalGanadoRango.setBackground(new java.awt.Color(102, 102, 102));
        jlblTotalGanadoRango.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTotalGanadoRango.setForeground(new java.awt.Color(0, 0, 204));
        jlblTotalGanadoRango.setText("Ingreso Total:  S/.");
        jlblTotalGanadoRango.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(jlblTotalGanadoRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 190, 40));

        jTabbedPane1.addTab("FECHA POR RANGO", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1090, 680));

        jPanel2.setBackground(new java.awt.Color(0, 128, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(30, 151, 196));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPORTE DE VENTA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1090, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdtcFechaEspecificadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtcFechaEspecificadaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtcFechaEspecificadaMousePressed

    private void jdtcFechaInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtcFechaInicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtcFechaInicioMousePressed

    private void jdtcFechaFinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtcFechaFinMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtcFechaFinMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton jbtnBuscarReporteFechaEspecifica;
    public javax.swing.JButton jbtnBuscarReporteFechaRango;
    public com.toedter.calendar.JDateChooser jdtcFechaEspecificada;
    public com.toedter.calendar.JDateChooser jdtcFechaFin;
    public com.toedter.calendar.JDateChooser jdtcFechaInicio;
    public javax.swing.JLabel jlblTotalGanadoDia;
    public javax.swing.JLabel jlblTotalGanadoRango;
    public javax.swing.JTable jtblTablaReporteFechaEspecificada;
    public javax.swing.JTable jtblTablaReporteRango;
    // End of variables declaration//GEN-END:variables
}