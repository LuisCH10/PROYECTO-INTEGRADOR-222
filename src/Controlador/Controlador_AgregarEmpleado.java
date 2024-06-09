package Controlador;

import DAO.CRUDempleados;
import Formatos.FormatoEmpleados;
import Formatos.Mensajes;
import Modelo.Empleado;
import Vista1.AñadirEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_AgregarEmpleado implements ActionListener {

    Empleado emp;
    AñadirEmpleados vista;
    CRUDempleados crude;
    Controlador_Administrar_Empleados controladorAdmEmpleados;

    public Controlador_AgregarEmpleado(AñadirEmpleados AE, Controlador_Administrar_Empleados CAE) {
        vista = AE;
        vista.jbtnRegistrar.addActionListener(this);
        controladorAdmEmpleados = CAE;
        crude = new CRUDempleados();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            if (vista.jtxtNombres.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de nombres");
            } else if (vista.jtxtApellidos.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de apellidos");
            } else if (vista.jtxtCorreo.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de correo");
            } else if (vista.jtxtDNI.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de DNI");
            } else if (!vista.jtxtDNI.getText().matches("\\d+")) {
                Mensajes.M1("El campo de DNI solo debe contener números");
            } else if (vista.jtxtNumeroCelular.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de número de celular");
            } else if (!vista.jtxtNumeroCelular.getText().matches("\\d+")) {
                Mensajes.M1("El campo de número de celular solo debe contener números");
            } else if (vista.jdtcFechaNacimiento.getDate() == null) {
                Mensajes.M1("Completar el campo de fecha de nacimiento");
            } else if (vista.jpswIngresarContraseña.getText().isEmpty()) {
                Mensajes.M1("Completar el campo de contraseña");
            } else if (!vista.jpswIngresarContraseña.getText().equals(vista.jpswConfirmarContraseña.getText())) {
                Mensajes.M1("Las contraseñas no coinciden");
            } else {

                if (crude.ConsultarRegistroEmp(vista.jtxtDNI.getText()) == null) {
                    emp = FormatoEmpleados.LeerEmpleado(vista);
                    crude = new CRUDempleados();
                    crude.InsertarRegistroEmp(emp);
                    FormatoEmpleados.LimpiarEntradas(vista);
                    controladorAdmEmpleados.ActualizarFormulario();
                } else {
                    Mensajes.M1("El DNI ingresado ya esta registrado");
                }

            }

        }
    }
}
