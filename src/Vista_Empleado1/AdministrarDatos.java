/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_Empleado1;


import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class AdministrarDatos extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarDatos
     */
    public AdministrarDatos() {
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

        jPanel1 = new javax.swing.JPanel();
        jpanelContenedorMenuEmpleados = new javax.swing.JDesktopPane();
        jbtnAdmClientes = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnVentaLibros = new javax.swing.JButton();
        jbtnAdmLibros1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnRegistroClientesEmpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setPreferredSize(getPreferredSize());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jpanelContenedorMenuEmpleadosLayout = new javax.swing.GroupLayout(jpanelContenedorMenuEmpleados);
        jpanelContenedorMenuEmpleados.setLayout(jpanelContenedorMenuEmpleadosLayout);
        jpanelContenedorMenuEmpleadosLayout.setHorizontalGroup(
            jpanelContenedorMenuEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jpanelContenedorMenuEmpleadosLayout.setVerticalGroup(
            jpanelContenedorMenuEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jPanel1.add(jpanelContenedorMenuEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 1140, 770));

        jbtnAdmClientes.setBackground(new java.awt.Color(0, 128, 128));
        jbtnAdmClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAdmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes 36x35.png"))); // NOI18N
        jbtnAdmClientes.setText("Historial Facturas");
        jbtnAdmClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jbtnAdmClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 60));

        jbtnCerrarSesion.setBackground(new java.awt.Color(0, 128, 128));
        jbtnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar Sesion 28x32.png"))); // NOI18N
        jbtnCerrarSesion.setText("Cerrar Sesión");
        jPanel1.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 140, 60));

        jbtnVentaLibros.setBackground(new java.awt.Color(0, 128, 128));
        jbtnVentaLibros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnVentaLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas 35x35.png"))); // NOI18N
        jbtnVentaLibros.setText("Venta Libros");
        jbtnVentaLibros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jbtnVentaLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jbtnVentaLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, 60));

        jbtnAdmLibros1.setBackground(new java.awt.Color(0, 128, 128));
        jbtnAdmLibros1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAdmLibros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Libros 35x35.png"))); // NOI18N
        jbtnAdmLibros1.setText("Adm. Libros");
        jbtnAdmLibros1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jbtnAdmLibros1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jbtnAdmLibros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com (2) (1) (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 130));

        jbtnRegistroClientesEmpresa.setBackground(new java.awt.Color(0, 128, 128));
        jbtnRegistroClientesEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRegistroClientesEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistroC 24x30.png"))); // NOI18N
        jbtnRegistroClientesEmpresa.setText("Registro Clientes");
        jbtnRegistroClientesEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnRegistroClientesEmpresa.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jbtnRegistroClientesEmpresa.setMaximumSize(new java.awt.Dimension(110, 37));
        jbtnRegistroClientesEmpresa.setMinimumSize(new java.awt.Dimension(110, 37));
        jbtnRegistroClientesEmpresa.setPreferredSize(new java.awt.Dimension(110, 37));
        jbtnRegistroClientesEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroClientesEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistroClientesEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistroClientesEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroClientesEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistroClientesEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnAdmClientes;
    public javax.swing.JButton jbtnAdmLibros1;
    public javax.swing.JButton jbtnCerrarSesion;
    public javax.swing.JButton jbtnRegistroClientesEmpresa;
    public javax.swing.JButton jbtnVentaLibros;
    public javax.swing.JDesktopPane jpanelContenedorMenuEmpleados;
    // End of variables declaration//GEN-END:variables
}