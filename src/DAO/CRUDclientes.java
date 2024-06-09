/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Formatos.Mensajes;
import Modelo.Cliente;
import Modelo.Editorial;
import Modelo.Empleado;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDclientes extends ConectarBD {

    public CRUDclientes() {
    }
   
    public void MostrarClientesEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Nombre","Telefono","Direccion","FechaDeNaci","TipoDeIdentificacion","NumeroDeIdentificacion"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        int numeracion=0;
        try {
            this.obtenerconexion();
            rs=st.executeQuery("SELECT * FROM cliente WHERE tipoidentificacion = 'DNI';");
        while(rs.next()){
            numeracion++;
            Cliente cli= new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setTelefono(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setFnacimiento(LocalDate.parse(rs.getString(5)));
            cli.setTipoIdentificacion(rs.getString(6));
            cli.setNumeroIdentificacion(rs.getString(7));
            modelo.addRow(cli.RegistroClientes(numeracion));
            
            
        }
        etiqueta.setText("Numero de registros : " + numeracion);
        
        
        
        } catch (Exception ex) {
            Mensajes.M1("Error! No se puedes mostrar los registro de la tabla editorial " + ex);
        }finally{
            this.cerrarconexion();
    }
    
    
    }
    
    public void InsertarRegistroClientes(Cliente cli) {
        try {
            this.obtenerconexion();
            // preparedStatament permite especificar parametros en la consulta a traves del simbolo la interrogante (?)
            ps = conexion.prepareStatement("INSERT INTO cliente(nombrecompleto,telefono,direccion,fnacimiento,tipoIdentificacion,numeroIdentifacion) VALUES(?,?,?,?,'DNI',?);");
            ps.setString(1, cli.getNombrecompleto());
            ps.setString(2, cli.getTelefono());
            ps.setString(3, cli.getDireccion());
            ps.setObject(4, cli.getFnacimiento());
            ps.setString(5, cli.getNumeroIdentificacion());
            ps.executeUpdate(); // actualiza y ejecuta la consulta|
            Mensajes.M1("Datos registrados correctamente...");
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede insertar el registro... fwefasfssef" + ex);
        } finally {
            this.cerrarconexion();
        }
    }
    public void ActualizarRegistroEmp(String dni, Cliente cli) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE cliente SET nombrecompleto = ?,telefono = ?, direccion = ?,fnacimiento =?, tipoIdentificacion = ?,numeroIdentifacion = ? WHERE numeroIdentifacion=?");
            ps.setString(1, cli.getNombrecompleto());
            ps.setString(2, cli.getTelefono());
            ps.setString(3, cli.getDireccion());
            ps.setObject(4, cli.getFnacimiento());
            ps.setString(5, cli.getTipoIdentificacion());
            ps.setString(6, cli.getNumeroIdentificacion());
            ps.setString(7, dni);
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("Datos actualizados correctamente");
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar el registro empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
    
    
    
    
    public Cliente ConsultarRegistroClientes(String dni) {
        Cliente cli = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT * FROM cliente WHERE tipoIdentificacion='DNI' AND  numeroIdentifacion =" + dni);
            if (rs.next()) {//Si tiene registro la consulta
            cli=new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setTelefono(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setFnacimiento(LocalDate.parse(rs.getString(5)));
            cli.setTipoIdentificacion(rs.getString(6));
            cli.setNumeroIdentificacion(rs.getString(7));
                
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return cli;
    }
         
   
    public void MostrarEmpresasEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Nombre","Telefono","Direccion","FechaDeNaci","TipoDeIdentificacion","NumeroDeIdentificacion"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        int numeracion=0;
        try {
            this.obtenerconexion();
            rs=st.executeQuery("SELECT * FROM cliente WHERE tipoidentificacion = 'RUC';");
        while(rs.next()){
            numeracion++;
            Cliente cli= new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setTelefono(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setFnacimiento(LocalDate.parse(rs.getString(5)));
            cli.setTipoIdentificacion(rs.getString(6));
            cli.setNumeroIdentificacion(rs.getString(7));
            modelo.addRow(cli.RegistroClientes(numeracion));
            
            
        }
        etiqueta.setText("Numero de registros : " + numeracion);
        
        
        
        } catch (Exception ex) {
            Mensajes.M1("Error! No se puedes mostrar los registro de la tabla editorial " + ex);
        }finally{
            this.cerrarconexion();
    }
    
    
    }
    
      public void InsertarRegistroEmpresas(Cliente cli) {
        try {
            this.obtenerconexion();
            // preparedStatament permite especificar parametros en la consulta a traves del simbolo la interrogante (?)
            ps = conexion.prepareStatement("INSERT INTO cliente(nombrecompleto,telefono,direccion,fnacimiento,tipoIdentificacion,numeroIdentifacion) VALUES(?,?,?,?,'RUC',?);");
            ps.setString(1, cli.getNombrecompleto());
            ps.setString(2, cli.getTelefono());
            ps.setString(3, cli.getDireccion());
            ps.setObject(4, cli.getFnacimiento());
            ps.setString(5, cli.getNumeroIdentificacion());
            ps.executeUpdate(); // actualiza y ejecuta la consulta|
            Mensajes.M1("Datos registrados correctamente...");
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede insertar el registro... fwefasfssef" + ex);
        } finally {
            this.cerrarconexion();
        }
    }
      
     public Cliente ConsultarRegistroClientesEmpresa(String ruc) {
        Cliente cli = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT * FROM cliente WHERE tipoIdentificacion='RUC' AND  numeroIdentifacion =" + ruc);
            if (rs.next()) {//Si tiene registro la consulta
            cli=new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setTelefono(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setFnacimiento(LocalDate.parse(rs.getString(5)));
            cli.setTipoIdentificacion(rs.getString(6));
            cli.setNumeroIdentificacion(rs.getString(7));
                
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return cli;
    }
     
      public void ActualizarRegistroEmpresa(String ruc, Cliente cli) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE cliente SET nombrecompleto = ?,telefono = ?, direccion = ?,fnacimiento =?, tipoIdentificacion = ?,numeroIdentifacion = ? WHERE numeroIdentifacion=?");
            ps.setString(1, cli.getNombrecompleto());
            ps.setString(2, cli.getTelefono());
            ps.setString(3, cli.getDireccion());
            ps.setObject(4, cli.getFnacimiento());
            ps.setString(5, cli.getTipoIdentificacion());
            ps.setString(6, cli.getNumeroIdentificacion());
            ps.setString(7, ruc);
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("Datos actualizados correctamente");
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar el registro empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
     
      
      public void MostrarPersonasEnTabla(JTable tabla){
        String titulos[]={"ID","Nombre","Direccion","Dni"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        int numeracion=0;
        try {
            this.obtenerconexion();
            rs=st.executeQuery("SELECT idcliente, nombrecompleto, direccion, numeroIdentifacion FROM cliente WHERE tipoidentificacion = 'DNI';");
        while(rs.next()){
            numeracion++;
            Cliente cli= new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setDireccion(rs.getString(3));
            cli.setNumeroIdentificacion(rs.getString(4));
            modelo.addRow(cli.RegistroPersonasYEmpresasTabla());
        }
        } catch (Exception ex) {
            Mensajes.M1("Error! No se puedes mostrar los registro de la tabla cliente " + ex);
        }finally{
            this.cerrarconexion();
    }
    }
     
      public void MostrarEmpresasEnTabla(JTable tabla){
        String titulos[]={"ID","Nombre","Direccion","RUC"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        int numeracion=0;
        try {
            this.obtenerconexion();
            rs=st.executeQuery("SELECT idcliente, nombrecompleto, direccion, numeroIdentifacion FROM cliente WHERE tipoidentificacion = 'RUC';");
        while(rs.next()){
            numeracion++;
            Cliente cli= new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setDireccion(rs.getString(3));
            cli.setNumeroIdentificacion(rs.getString(4));
            modelo.addRow(cli.RegistroPersonasYEmpresasTabla());
        }
        } catch (Exception ex) {
            Mensajes.M1("Error! No se puedes mostrar los registro de la tabla cliente " + ex);
        }finally{
            this.cerrarconexion();
    }
    }
   
    Cliente ConsultarRegistroCliente_Recibo(int idcliente) {
        Cliente cli = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT * FROM cliente WHERE idcliente =" + idcliente);
            if (rs.next()) {//Si tiene registro la consulta
            cli=new Cliente();
            cli.setIdcliente(rs.getInt(1));
            cli.setNombrecompleto(rs.getString(2));
            cli.setTelefono(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setFnacimiento(LocalDate.parse(rs.getString(5)));
            cli.setTipoIdentificacion(rs.getString(6));
            cli.setNumeroIdentificacion(rs.getString(7));
                
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return cli;
    }
}