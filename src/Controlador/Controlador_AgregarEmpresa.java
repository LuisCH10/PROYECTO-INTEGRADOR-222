/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CRUDclientes;
import Formatos.FormatoClientes;
import Formatos.Mensajes;
import Modelo.Cliente;
import Vista_Empleado1.AñadirRegistroEmpresas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Controlador_AgregarEmpresa implements ActionListener {

    Cliente clie;
    AñadirRegistroEmpresas vista;
    CRUDclientes crude;
    Controlador_AdministrarRegistroClientesEmpresa controladorAdminRegistroClieEmpre;

    public Controlador_AgregarEmpresa(AñadirRegistroEmpresas AÑRE, Controlador_AdministrarRegistroClientesEmpresa CARE) {
        vista = AÑRE;
        vista.jbtnRegistrarEmpresa.addActionListener(this);
        controladorAdminRegistroClieEmpre = CARE;
        crude = new CRUDclientes();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrarEmpresa) {
            if (vista.jtxtNombreEmpresa.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Nombre");
            } else if (vista.jtxtDireccionEmpresa.getText().isEmpty()) {
                Mensajes.M1("Complete la Direccion");
            } else if (vista.jtxtTelefonoEmpresa.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Telefono");
            } else if (!isNumeric(vista.jtxtTelefonoEmpresa.getText())) {
                Mensajes.M1("El Telefono debe contener solo numeros");
            } else if (vista.jtxtNumerodeIdentificacionEmpresa.getText().isEmpty()) {
                Mensajes.M1("Complete el campo de Numero de Identificacion");
            } else if (!isNumeric(vista.jtxtNumerodeIdentificacionEmpresa.getText())) {
                Mensajes.M1("El Numero de Identificacion debe contener solo numeros");
            } else if (vista.jdtcFechaCreacionEmpresa.getDate() == null) {
                Mensajes.M1("Complete el campo de Fecha de Nacimiento");
            } else {

                Cliente resultado = crude.ConsultarRegistroClientesEmpresa(vista.jtxtNumerodeIdentificacionEmpresa.getText().toString());
                if (resultado != null) {
                    Mensajes.M1("El RUC ingresado ya esta registrado");
                } else {
                    clie = FormatoClientes.LeerEmpresa(vista);
                    crude = new CRUDclientes();
                    crude.InsertarRegistroEmpresas(clie);
                    FormatoClientes.LimpiarEntradasEmpresa(vista);
                    controladorAdminRegistroClieEmpre.ActualizarFormularioEmpresa();
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
