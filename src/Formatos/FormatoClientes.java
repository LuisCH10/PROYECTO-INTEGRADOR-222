/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formatos;

import Modelo.Cliente;
import Vista_Empleado1.AñadirRegistroClientes;
import Vista_Empleado1.EditarRegistroClientes;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import Vista_Empleado1.AñadirRegistroEmpresas;
import Vista_Empleado1.EditarRegistroEmpresas;

/**
 *
 * @author User
 */
public class FormatoClientes {
    
    public static Cliente LeerCliente(AñadirRegistroClientes f1){
        Cliente cli=new Cliente();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        cli.setNombrecompleto(f1.jtxtNombreCompleto.getText());
        cli.setTelefono(f1.jtxtTelefono.getText());
        cli.setDireccion(f1.jtxtDireccion.getText());
        cli.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcFechaNacimiento.getCalendar().getTime())));
        cli.setNumeroIdentificacion(f1.jtxtNumerodeIdentificacion.getText());
        
        return cli;
    }
    public static Cliente LeerEmpresa(AñadirRegistroEmpresas f1){
        Cliente cli=new Cliente();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        cli.setNombrecompleto(f1.jtxtNombreEmpresa.getText());
        cli.setTelefono(f1.jtxtTelefonoEmpresa.getText());
        cli.setDireccion(f1.jtxtDireccionEmpresa.getText());
        cli.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcFechaCreacionEmpresa.getCalendar().getTime())));
        cli.setNumeroIdentificacion(f1.jtxtNumerodeIdentificacionEmpresa.getText());
        
        return cli;
    }
    
    public static void LimpiarEntradas(AñadirRegistroClientes AE){
        AE.jtxtNombreCompleto.setText("");
        AE.jtxtDireccion.setText("");
        AE.jtxtTelefono.setText("");
        AE.jtxtNumerodeIdentificacion.setText("");
        AE.jdtcFechaNacimiento.setDateFormatString("");
        AE.jtxtNombreCompleto.requestFocus();
    }
    
     public static void LimpiarEntradasEmpresa(AñadirRegistroEmpresas AE){
        AE.jtxtNombreEmpresa.setText("");
        AE.jtxtDireccionEmpresa.setText("");
        AE.jtxtTelefonoEmpresa.setText("");
        AE.jtxtNumerodeIdentificacionEmpresa.setText("");
        AE.jdtcFechaCreacionEmpresa.setDateFormatString("");
        AE.jtxtNombreEmpresa.requestFocus();
    }
    
    public static Cliente EditarCliente(EditarRegistroClientes f1){
        Cliente cli=new Cliente();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        cli.setNombrecompleto(f1.jtxtEditarNombreCompleto.getText());
        cli.setTelefono(f1.jtxtEditarTelefono.getText());
        cli.setDireccion(f1.jtxtEditarDireccion.getText());
        cli.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcEditarFechaNacimiento.getCalendar().getTime())));
        cli.setTipoIdentificacion(f1.jcbxEditarDniORuc.getSelectedItem().toString());
        cli.setNumeroIdentificacion(f1.jtxtEditarNumerodeIdentificacion.getText());
        return cli;
        
        
    }
    
     public static Cliente EditarEmpresa(EditarRegistroEmpresas f1){
        Cliente cli=new Cliente();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        cli.setNombrecompleto(f1.jtxtEditarNombreCompleto.getText());
        cli.setTelefono(f1.jtxtEditarTelefono.getText());
        cli.setDireccion(f1.jtxtEditarDireccion.getText());
        cli.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcEditarFechaNacimiento.getCalendar().getTime())));
        cli.setTipoIdentificacion(f1.jcbxEditarDniORuc.getSelectedItem().toString());
        cli.setNumeroIdentificacion(f1.jtxtEditarNumerodeIdentificacion.getText());
        return cli;
        
        
    }
    
}
