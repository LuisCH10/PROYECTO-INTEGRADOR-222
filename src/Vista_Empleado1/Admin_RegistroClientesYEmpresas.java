/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista_Empleado1;

/**
 *
 * @author admin
 */
public class Admin_RegistroClientesYEmpresas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admin_Cliente2
     */
    public Admin_RegistroClientesYEmpresas() {
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jbtnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblRegistroClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbtnAgregarCliente = new javax.swing.JButton();
        jbtnEditarRegistroCliente = new javax.swing.JButton();
        jlblRegistros_Clientes = new javax.swing.JLabel();
        jtxtBuscarClientePorDNI = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jbtnBuscarClienteEmpresa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroEmpresa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtnAgregarRegistroEmpresa = new javax.swing.JButton();
        jbtnEditarRegistroEmpresa = new javax.swing.JButton();
        jlblRegistros_Empresas = new javax.swing.JLabel();
        jtxtBuscarClienteEmpresaPorRuc = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlPestañaAdministrarClientes.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPestañaAdministrarClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jpnlPestañaAdministrarClientes.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 1080, 10));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("DNI");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbtnBuscarCliente.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jPanel1.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, 40));

        jtblRegistroClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblRegistroClientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1040, 480));

        jLabel2.setText("REGISTROS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 20));

        jbtnAgregarCliente.setText("Agregar");
        jbtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 160, 40));

        jbtnEditarRegistroCliente.setText("Editar");
        jPanel1.add(jbtnEditarRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 160, 40));

        jlblRegistros_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistros_Clientes.setForeground(new java.awt.Color(0, 0, 204));
        jlblRegistros_Clientes.setText("Numero de Registros: ");
        jlblRegistros_Clientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jlblRegistros_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 220, 40));
        jPanel1.add(jtxtBuscarClientePorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        jTabbedPane2.addTab("CLIENTE", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 735));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("RUC");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbtnBuscarClienteEmpresa.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarClienteEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jPanel2.add(jbtnBuscarClienteEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, 40));

        jtblRegistroEmpresa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblRegistroEmpresa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1040, 480));

        jLabel1.setText("REGISTROS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 20));

        jbtnAgregarRegistroEmpresa.setText("Agregar");
        jPanel2.add(jbtnAgregarRegistroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 160, 40));

        jbtnEditarRegistroEmpresa.setText("Editar");
        jPanel2.add(jbtnEditarRegistroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 160, 40));

        jlblRegistros_Empresas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistros_Empresas.setForeground(new java.awt.Color(0, 0, 204));
        jlblRegistros_Empresas.setText("Numero de Registros: ");
        jlblRegistros_Empresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jlblRegistros_Empresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 220, 40));
        jPanel2.add(jtxtBuscarClienteEmpresaPorRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        jTabbedPane2.addTab("EMPRESA", jPanel2);

        jpnlPestañaAdministrarClientes.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1080, 670));

        jPanel13.setBackground(new java.awt.Color(0, 128, 128));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(30, 151, 196));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTRO DE CLIENTES O EMPRESA");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 30));

        jpnlPestañaAdministrarClientes.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1080, 30));

        getContentPane().add(jpnlPestañaAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 1105, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JButton jbtnAgregarCliente;
    public javax.swing.JButton jbtnAgregarRegistroEmpresa;
    public javax.swing.JButton jbtnBuscarCliente;
    public javax.swing.JButton jbtnBuscarClienteEmpresa;
    public javax.swing.JButton jbtnEditarRegistroCliente;
    public javax.swing.JButton jbtnEditarRegistroEmpresa;
    public javax.swing.JLabel jlblRegistros_Clientes;
    public javax.swing.JLabel jlblRegistros_Empresas;
    private javax.swing.JPanel jpnlPestañaAdministrarClientes;
    public javax.swing.JTable jtblRegistroClientes;
    public javax.swing.JTable jtblRegistroEmpresa;
    public javax.swing.JTextField jtxtBuscarClienteEmpresaPorRuc;
    public javax.swing.JTextField jtxtBuscarClientePorDNI;
    // End of variables declaration//GEN-END:variables
}
