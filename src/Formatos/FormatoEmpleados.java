package Formatos;

import Modelo.Empleado;
import Vista1.AñadirEmpleados;
import Vista1.EditarEmpleados;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class FormatoEmpleados {
    
    public static Empleado LeerEmpleado(AñadirEmpleados f1){
        Empleado emp = new Empleado();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        emp.setUsuario("EM"+f1.jtxtDNI.getText());
        emp.setNombre(f1.jtxtNombres.getText());
        emp.setApellido(f1.jtxtApellidos.getText());
        emp.setDni(f1.jtxtDNI.getText());
        emp.setTelefono(f1.jtxtNumeroCelular.getText());
        emp.setEmail(f1.jtxtCorreo.getText());
        emp.setContraseña(String.valueOf(f1.jpswIngresarContraseña.getPassword()));
        emp.setTipo(f1.jcbxTipoEmpleado.getSelectedItem().toString());
        emp.setGenero(f1.jcbxGenero.getSelectedItem().toString());
        emp.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcFechaNacimiento.getCalendar().getTime())));
        return emp;
    }
    
     public static void LimpiarEntradas(AñadirEmpleados AE){
        AE.jtxtNombres.setText("");
        AE.jtxtApellidos.setText("");
        AE.jtxtDNI.setText("");
        AE.jtxtNumeroCelular.setText("");
        AE.jtxtCorreo.setText("");
        AE.jpswIngresarContraseña.setText("");
        AE.jpswConfirmarContraseña.setText("");
        AE.jcbxTipoEmpleado.setSelectedIndex(0);
        AE.jcbxGenero.setSelectedIndex(0);
        AE.jdtcFechaNacimiento.setDateFormatString("");
        AE.jtxtNombres.requestFocus();
    }
    
     public static Empleado EditarEmpleado(EditarEmpleados f1){
        Empleado emp = new Empleado();
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        emp.setUsuario("EM"+f1.jtxtEditarDNI.getText());
        emp.setNombre(f1.jtxtEditarNombres.getText());
        emp.setApellido(f1.jtxtEditarApellidos.getText());
        emp.setDni(f1.jtxtEditarDNI.getText());
        emp.setTelefono(f1.jtxtEditarNumCelular.getText());
        emp.setEmail(f1.jtxtEditarCorreo.getText());
        emp.setContraseña(String.valueOf(f1.jpswEditarIngresarContraseña.getPassword()));
        emp.setTipo(f1.jcbxEditarTipoEmpleado.getSelectedItem().toString());
        emp.setEstado(f1.jcbxEditarEstadoUsuario.getSelectedItem().toString());
        emp.setGenero(f1.jcbxEditarGenero.getSelectedItem().toString());
        emp.setFnacimiento(LocalDate.parse(ff.format(f1.jdtcEditarFechaNacimiento.getCalendar().getTime())));
        return emp;
    }
    
}
