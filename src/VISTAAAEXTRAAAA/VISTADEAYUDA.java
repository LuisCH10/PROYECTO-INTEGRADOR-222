/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VISTAAAEXTRAAAA;

/**
 *
 * @author admin
 */
public class VISTADEAYUDA extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admin_Cliente2
     */
    public VISTADEAYUDA() {
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

        jpnlPestañaAdministrarClientes = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtblVuelosprocesoemp = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtblvuelorealizadoEmp = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jtxtBuscarClienteporDni = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtxaDatosCliente = new javax.swing.JTextArea();
        jbtnBuscarCliente1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlPestañaAdministrarClientes.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPestañaAdministrarClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jpnlPestañaAdministrarClientes.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 900, 10));

        jPanel13.setBackground(new java.awt.Color(30, 151, 196));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(30, 151, 196));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTRO DE VUELOS DEL CLIENTE");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        jpnlPestañaAdministrarClientes.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 900, 30));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblVuelosprocesoemp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jtblVuelosprocesoemp);

        jPanel14.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 250));

        jTabbedPane1.addTab("VUELOS EN PROCESO", jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblvuelorealizadoEmp.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblvuelorealizadoEmp.setEnabled(false);
        jScrollPane7.setViewportView(jtblvuelorealizadoEmp);

        jPanel15.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 250));

        jTabbedPane1.addTab("HISTORIAL DE VUELOS", jPanel15);

        jpnlPestañaAdministrarClientes.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 900, 300));

        jLabel15.setText("DNI");
        jpnlPestañaAdministrarClientes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jpnlPestañaAdministrarClientes.add(jtxtBuscarClienteporDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jtxaDatosCliente.setEditable(false);
        jtxaDatosCliente.setColumns(20);
        jtxaDatosCliente.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxaDatosCliente.setRows(5);
        jtxaDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jScrollPane10.setViewportView(jtxaDatosCliente);

        jpnlPestañaAdministrarClientes.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 410, 100));

        jbtnBuscarCliente1.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jpnlPestañaAdministrarClientes.add(jbtnBuscarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 40, 40));

        getContentPane().add(jpnlPestañaAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 915, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton jbtnBuscarCliente1;
    private javax.swing.JPanel jpnlPestañaAdministrarClientes;
    public javax.swing.JTable jtblVuelosprocesoemp;
    public javax.swing.JTable jtblvuelorealizadoEmp;
    public javax.swing.JTextArea jtxaDatosCliente;
    public javax.swing.JTextField jtxtBuscarClienteporDni;
    // End of variables declaration//GEN-END:variables
}
