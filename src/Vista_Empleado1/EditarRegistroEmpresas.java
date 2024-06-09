/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_Empleado1;

/**
 *
 * @author User
 */
public class EditarRegistroEmpresas extends javax.swing.JFrame {

    /**
     * Creates new form AñadirRegistroClientes
     */
    public EditarRegistroEmpresas() {
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
        jLabel1 = new javax.swing.JLabel();
        jtxtEditarNombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtEditarNumerodeIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtEditarTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtEditarDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jdtcEditarFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jbtnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbxEditarDniORuc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Completo/Empresa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));
        jPanel1.add(jtxtEditarNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        jLabel3.setText("Numero de identificacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(jtxtEditarNumerodeIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 40));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));
        jPanel1.add(jtxtEditarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 150, 40));

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));
        jPanel1.add(jtxtEditarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, 40));

        jLabel6.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jdtcEditarFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jdtcEditarFechaNacimiento.setMaxSelectableDate(new java.util.Date(253370786512000L));
        jdtcEditarFechaNacimiento.setMinSelectableDate(new java.util.Date(-2208966572000L));
        jdtcEditarFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jdtcEditarFechaNacimientoMousePressed(evt);
            }
        });
        jPanel1.add(jdtcEditarFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, 40));

        jbtnActualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 50));

        jLabel2.setText("Tipo de identificacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jcbxEditarDniORuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        jPanel1.add(jcbxEditarDniORuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdtcEditarFechaNacimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtcEditarFechaNacimientoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtcEditarFechaNacimientoMousePressed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbtnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarRegistroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarRegistroEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JComboBox<String> jcbxEditarDniORuc;
    public com.toedter.calendar.JDateChooser jdtcEditarFechaNacimiento;
    public javax.swing.JTextField jtxtEditarDireccion;
    public javax.swing.JTextField jtxtEditarNombreCompleto;
    public javax.swing.JTextField jtxtEditarNumerodeIdentificacion;
    public javax.swing.JTextField jtxtEditarTelefono;
    // End of variables declaration//GEN-END:variables
}
