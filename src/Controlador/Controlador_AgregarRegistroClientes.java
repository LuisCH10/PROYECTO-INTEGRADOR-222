/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CRUDclientes;
import Formatos.FormatoClientes;
import Formatos.Mensajes;
import Modelo.Cliente;
import Vista_Empleado1.AñadirRegistroClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Controlador_AgregarRegistroClientes implements ActionListener {

    Cliente clie;
    AñadirRegistroClientes vista;
    CRUDclientes crude;
    Controlador_AdministrarRegistroClientesEmpresa controladorAdminRegistroClieEmpre;

    public Controlador_AgregarRegistroClientes(AñadirRegistroClientes AÑRC, Controlador_AdministrarRegistroClientesEmpresa CARC) {
        vista = AÑRC;
        vista.jbtnRegistrar.addActionListener(this);
        controladorAdminRegistroClieEmpre = CARC;
        crude = new CRUDclientes();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            if (vista.jtxtNombreCompleto.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Nombre");
            } else if (vista.jtxtDireccion.getText().isEmpty()) {
                Mensajes.M1("Complete la Direccion");
            } else if (vista.jtxtTelefono.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Telefono");
            } else if (!isNumeric(vista.jtxtTelefono.getText())) {
                Mensajes.M1("El Telefono debe contener solo numeros");
            } else if (vista.jtxtNumerodeIdentificacion.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Numero de Identificacion");
            } else if (!isNumeric(vista.jtxtNumerodeIdentificacion.getText())) {
                Mensajes.M1("El Numero de Identificacion debe contener solo numeros");
            } else if (vista.jdtcFechaNacimiento.getDate() == null) {
                Mensajes.M1("Complete el campo de Fecha de Nacimiento");
            } else {
                Cliente resultado = crude.ConsultarRegistroClientes(vista.jtxtNumerodeIdentificacion.getText().toString());
                if (resultado != null) {
                    Mensajes.M1("El DNI ingresado ya esta registrado");
                } else {
                    clie = FormatoClientes.LeerCliente(vista);
                    crude = new CRUDclientes();
                    crude.InsertarRegistroClientes(clie);
                    FormatoClientes.LimpiarEntradas(vista);
                    controladorAdminRegistroClieEmpre.ActualizarFormulario();
                }
            }
        }
    }

    private boolean isNumeric(String str) {
        // Verifica si la cadena contiene solo dígitos
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}