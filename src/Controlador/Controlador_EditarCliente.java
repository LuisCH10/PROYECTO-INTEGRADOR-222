/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CRUDclientes;
import Formatos.FormatoClientes;
import Formatos.Mensajes;
import Modelo.Cliente;
import Vista_Empleado1.EditarRegistroClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista_Empleado1.Admin_RegistroClientesYEmpresas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Controlador_EditarCliente implements ActionListener {

    EditarRegistroClientes vista;
    Admin_RegistroClientesYEmpresas vista2;
    CRUDclientes crude;
    Cliente cli;
    Controlador_AdministrarRegistroClientesEmpresa controladorAdminClienYEmpre;

    public Controlador_EditarCliente(EditarRegistroClientes ERC, Controlador_AdministrarRegistroClientesEmpresa CRCYE) {
        controladorAdminClienYEmpre = CRCYE;
        vista = ERC;
        vista2 = controladorAdminClienYEmpre.vista;
        vista.jbtnActualizar.addActionListener(this);
        crude = new CRUDclientes();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

        String dni = vista2.jtxtBuscarClientePorDNI.getText();
        cli = crude.ConsultarRegistroClientes(dni);

        vista.jtxtEditarNombreCompleto.setText(cli.getNombrecompleto());
        vista.jcbxEditarDniORuc.setSelectedItem(cli.getTipoIdentificacion());
        vista.jdtcEditarFechaNacimiento.setDate(java.sql.Date.valueOf(cli.getFnacimiento()));
        vista.jtxtEditarDireccion.setText(cli.getDireccion());
        vista.jtxtEditarNumerodeIdentificacion.setText(cli.getNumeroIdentificacion());
        vista.jtxtEditarTelefono.setText(cli.getTelefono());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnActualizar) {
            if (vista.jtxtEditarNombreCompleto.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Nombre");
            } else if (vista.jtxtEditarDireccion.getText().isEmpty()) {
                Mensajes.M1("Complete la Direccion");
            } else if (vista.jtxtEditarTelefono.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Telefono");
            } else if (!isNumeric(vista.jtxtEditarTelefono.getText())) {
                Mensajes.M1("El Telefono debe contener solo numeros");
            } else if (vista.jtxtEditarNumerodeIdentificacion.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Numero de Identificacion");
            } else if (!isNumeric(vista.jtxtEditarNumerodeIdentificacion.getText())) {
                Mensajes.M1("El Numero de Identificacion debe contener solo numeros");
            } else if (vista.jdtcEditarFechaNacimiento.getDate() == null) {
                Mensajes.M1("Complete el campo de Fecha de Nacimiento");
            } else {

                Cliente resultado = crude.ConsultarRegistroClientes(vista.jtxtEditarNumerodeIdentificacion.getText().toString());
                if (resultado != null) {
                    Mensajes.M1("El DNI ingresado ya esta registrado");
                } else {
                    String dni = vista2.jtxtBuscarClientePorDNI.getText();
                    crude = new CRUDclientes();
                    cli = FormatoClientes.EditarCliente(vista);
                    crude.ActualizarRegistroEmp(dni, cli);
                    controladorAdminClienYEmpre.ActualizarFormulario();
                    controladorAdminClienYEmpre.ActuEmpresa();
                }

            }
        } else {
            Mensajes.M1("Incorrecto");
        }
    }

    private boolean isNumeric(String str) {
        // Verifica si la cadena contiene solo dígitos
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
