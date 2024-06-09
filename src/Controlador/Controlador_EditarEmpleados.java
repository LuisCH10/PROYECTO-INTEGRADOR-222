package Controlador;

import DAO.CRUDempleados;
import Formatos.FormatoEmpleados;
import Formatos.Mensajes;
import Modelo.Empleado;
import Vista1.EditarEmpleados;
import Vista_Jefe1.Administrar_Empleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Controlador_EditarEmpleados implements ActionListener {

    EditarEmpleados vista;
    Administrar_Empleados vista2;
    CRUDempleados crude;
    Empleado emp;
    Controlador_Administrar_Empleados controladorAdmEmpleados;

    public Controlador_EditarEmpleados(EditarEmpleados EE, Controlador_Administrar_Empleados CAE) {
        controladorAdmEmpleados = CAE;
        vista2 = controladorAdmEmpleados.vistaEmpleados;
        vista = EE;
        vista.jbtnActualizarEmpleado.addActionListener(this);
        crude = new CRUDempleados();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

        String dni = vista2.jtxtBuscarPorDni.getText();
        emp = crude.ConsultarRegistroEmp(dni);

        vista.jtxtEditarCorreo.setText(emp.getEmail());
        vista.jtxtEditarNombres.setText(emp.getNombre());
        vista.jtxtEditarApellidos.setText(emp.getApellido());
        vista.jtxtEditarNumCelular.setText(emp.getTelefono());
        vista.jpswEditarIngresarContraseña.setText(emp.getContraseña());
        vista.jpswEditarConfirmarContraseña.setText(emp.getContraseña());
        vista.jcbxEditarGenero.setSelectedItem(emp.getGenero());
        vista.jdtcEditarFechaNacimiento.setDate(java.sql.Date.valueOf(emp.getFnacimiento()));
        vista.jtxtEditarDNI.setText(emp.getDni());
        vista.jcbxEditarEstadoUsuario.setSelectedItem(emp.getEstado());
        vista.jcbxEditarTipoEmpleado.setSelectedItem(emp.getTipo());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnActualizarEmpleado) {
            if (vista.jtxtEditarNombres.getText().isEmpty()) {
                Mensajes.M1("INGRESE UN NOMBRE");
            } else if (vista.jtxtEditarApellidos.getText().isEmpty()) {
                Mensajes.M1("INGRESE UN APELLIDO");
            } else if (vista.jtxtEditarNumCelular.getText().isEmpty()) {
                Mensajes.M1("INGRESE EL NUMERO DE CELULAR");
            } else if (!vista.jtxtEditarNumCelular.getText().matches("\\d+")) {
                Mensajes.M1("EL NUMERO DE CELULAR SOLO DEBE CONTENER NUMEROS");
            } else if (vista.jtxtEditarCorreo.getText().isEmpty()) {
                Mensajes.M1("INGRESE EL CORREO");
            } else if (vista.jpswEditarIngresarContraseña.getText().isEmpty()) {
                Mensajes.M1("INGRESE UNA CONTRASEÑA");
            } else if (vista.jpswEditarConfirmarContraseña.getText().isEmpty()) {
                Mensajes.M1("TIENE QUE CONFIRMAR LA CONTRASEÑA");
            } else if (vista.jtxtEditarDNI.getText().isEmpty()) {
                Mensajes.M1("INGRESE EL DNI");
            } else if (!vista.jtxtEditarDNI.getText().matches("\\d+")) {
                Mensajes.M1("EL DNI SOLO DEBE CONTENER NUMEROS");
            } else if (vista.jpswEditarIngresarContraseña.getText().equals(vista.jpswEditarConfirmarContraseña.getText())) {
                String dni = vista2.jtxtBuscarPorDni.getText();
                crude = new CRUDempleados();
                emp = FormatoEmpleados.EditarEmpleado(vista);
                crude.ActualizarRegistroEmp(dni, emp);
                controladorAdmEmpleados.ActualizarFormulario();
            } else {
                Mensajes.M1("Las contraseñas no coinciden");
            }

        }
    }

}
