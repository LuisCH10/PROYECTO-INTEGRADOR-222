/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista_Jefe1;

/**
 *
 * @author admin
 */
public class Administrar_Editorial extends javax.swing.JInternalFrame {

    /**
     * Creates new form prueba
     */
    public Administrar_Editorial() {
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

        jpnlPestañaAdministrarUsuarios = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosEditorial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxtBuscarPorIDEditorial = new javax.swing.JTextField();
        jbtnAgregarEditorial = new javax.swing.JButton();
        jbtnEditarEditorial = new javax.swing.JButton();
        jlblRegistros_Editorial = new javax.swing.JLabel();
        jbtnBuscarEditorial = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlPestañaAdministrarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPestañaAdministrarUsuarios.setPreferredSize(new java.awt.Dimension(930, 490));
        jpnlPestañaAdministrarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 128, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(30, 151, 196));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRO DE EDITORIAL");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1060, 30));

        jpnlPestañaAdministrarUsuarios.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1090, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jpnlPestañaAdministrarUsuarios.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 1090, 10));

        jtblDatosEditorial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblDatosEditorial);

        jpnlPestañaAdministrarUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1080, 550));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CODIGO");
        jpnlPestañaAdministrarUsuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jpnlPestañaAdministrarUsuarios.add(jtxtBuscarPorIDEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jbtnAgregarEditorial.setText("Añadir");
        jbtnAgregarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarEditorialActionPerformed(evt);
            }
        });
        jpnlPestañaAdministrarUsuarios.add(jbtnAgregarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 130, 40));

        jbtnEditarEditorial.setText("Editar");
        jpnlPestañaAdministrarUsuarios.add(jbtnEditarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 140, 40));

        jlblRegistros_Editorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistros_Editorial.setForeground(new java.awt.Color(0, 0, 204));
        jlblRegistros_Editorial.setText("Numero de Registros: ");
        jlblRegistros_Editorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlPestañaAdministrarUsuarios.add(jlblRegistros_Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 220, 40));

        jbtnBuscarEditorial.setBackground(new java.awt.Color(153, 0, 0));
        jbtnBuscarEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar 24x24.png"))); // NOI18N
        jpnlPestañaAdministrarUsuarios.add(jbtnBuscarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 70, 40));

        getContentPane().add(jpnlPestañaAdministrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarEditorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnAgregarEditorial;
    public javax.swing.JButton jbtnBuscarEditorial;
    public javax.swing.JButton jbtnEditarEditorial;
    public javax.swing.JLabel jlblRegistros_Editorial;
    public javax.swing.JPanel jpnlPestañaAdministrarUsuarios;
    public javax.swing.JTable jtblDatosEditorial;
    public javax.swing.JTextField jtxtBuscarPorIDEditorial;
    // End of variables declaration//GEN-END:variables
}
