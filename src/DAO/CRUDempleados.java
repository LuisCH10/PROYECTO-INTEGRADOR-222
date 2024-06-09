package DAO;

import Formatos.Mensajes;
import Modelo.Empleado;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDempleados extends ConectarBD{

    public CRUDempleados() {
    }
    
    //Metodo que muestra los registros de la tabla Empleados en un JTable
    public void MostrarEmpleadosEnTabla(JTable tabla, JLabel etiqueta) {
        String titulos[] = {"ID", "Usuario", "Nombre", "Apellido", "Num. Celular", "Correo", "DNI", "F.Nac", "Tipo", "Genero", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        int numeracion = 0;
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT idempleado, usuario, nombre,apellido,telefono,email,fnacimiento,tipo,genero,Estado,dni FROM empleado;");
            while (rs.next()) {
                numeracion++;
                Empleado emp = new Empleado();
                emp.setIdempleado(rs.getInt(1));
                emp.setUsuario(rs.getString(2));
                emp.setNombre(rs.getString(3));
                emp.setApellido(rs.getString(4));
                emp.setTelefono(rs.getString(5));
                emp.setEmail(rs.getString(6));
                emp.setFnacimiento(LocalDate.parse(rs.getString(7)));
                emp.setTipo(rs.getString(8));
                emp.setGenero(rs.getString(9));
                emp.setEstado(rs.getString(10));
                emp.setDni(rs.getString(11));
                modelo.addRow(emp.RegistroEmpleados(numeracion));
            } //Fin del while
            //conexion.close();
            etiqueta.setText("Número de registros : " + numeracion);

//            ManejadorTablas.FormatoTablaEmpleados(tabla);
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se pueden mostrar los registros de la tabla empleado..." + ex);
        } finally {
            this.cerrarconexion();
        }
    } //Fin del metodo
    
    public void InsertarRegistroEmp(Empleado emp) {
        try {
            this.obtenerconexion();
            // preparedStatament permite especificar parametros en la consulta a traves del simbolo la interrogante (?)
            ps = conexion.prepareStatement("INSERT INTO empleado(usuario,contraseña,nombre,apellido,telefono,email,fnacimiento,tipo,genero,dni,Estado,numerointentos,fechasuspendida,horasuspendida) VALUES(?,?,?,?,?,?,?,?,?,?,'ACTIVO',3,'0001-01-01','00:00:00');");
            ps.setString(1, emp.getUsuario()); // actualiza la primera interrogante(?) con datos del empleado
            ps.setString(2, emp.getContraseña());// actualiza la segunda interrogante(?)
            ps.setString(3, emp.getNombre());
            ps.setString(4, emp.getApellido());
            ps.setString(5, emp.getTelefono());
            ps.setString(6, emp.getEmail());
            ps.setObject(7, emp.getFnacimiento());
            ps.setString(8, emp.getTipo());
            ps.setString(9, emp.getGenero());
            ps.setString(10, emp.getDni());
            ps.executeUpdate(); // actualiza y ejecuta la consulta|
            Mensajes.M1("Datos registrados correctamente...");
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede insertar el registro... fwefasfssef" + ex);
        } finally {
            this.cerrarconexion();
        }
    }
    
    //Metodo que recibe un Empleado y actualiza el registro segun el dni
    public void ActualizarRegistroEmp(String dni, Empleado empac) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE empleado SET usuario = ?,contraseña = ?, nombre = ?,apellido =?, telefono = ?,email = ?,fnacimiento=?,tipo=?,genero=?,Estado=?,dni=? WHERE dni=?");
            ps.setString(1, empac.getUsuario());
            ps.setString(2, empac.getContraseña());
            ps.setString(3, empac.getNombre());
            ps.setString(4, empac.getApellido());
            ps.setString(5, empac.getTelefono());
            ps.setString(6, empac.getEmail());
            ps.setObject(7, empac.getFnacimiento());
            ps.setString(8, empac.getTipo());
            ps.setString(9, empac.getGenero());
            ps.setObject(10, empac.getEstado());
            ps.setString(11, empac.getDni());
            ps.setString(12, dni);
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
    
    //Metodo que recibe el dni y retorna el registro del Empleado 
    public Empleado ConsultarRegistroEmp(String dni) {
        Empleado emp = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT idempleado,usuario,contraseña,nombre,apellido,telefono,email,fnacimiento,tipo,genero,Estado,dni,contraseña FROM empleado WHERE dni =" + dni);
            if (rs.next()) {//Si tiene registro la consulta
                emp = new Empleado();
                emp.setIdempleado(rs.getInt(1));
                emp.setUsuario(rs.getString(2));
                emp.setContraseña(rs.getString(3));
                emp.setNombre(rs.getString(4));
                emp.setApellido(rs.getString(5));
                emp.setTelefono(rs.getString(6));
                emp.setEmail(rs.getString(7));
                emp.setFnacimiento(LocalDate.parse(rs.getString(8)));
                emp.setTipo(rs.getString(9));
                emp.setGenero(rs.getString(10));
                emp.setEstado(rs.getString(11));
                emp.setDni(rs.getString(12));
                
                
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return emp;
    }
    
    public String ConsultarUsuario(String usuario, String contraseña) {
        String emp = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT tipo,Estado FROM empleado WHERE usuario ='" + usuario + "' and contraseña='" + contraseña + "'");
            if (rs.next()) {//Si tiene registro la consulta
                emp = "Usuario Encontrado " + rs.getString(1) + " " + rs.getString(2);
            } else {
                emp = "No encontrado";
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally {
            this.cerrarconexion();
        }
        return emp;
    }
    
    public String ConsultarNombreusuario(String usuario) {
        String emp = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT tipo FROM empleado WHERE usuario ='" + usuario + "'");
            if (rs.next()) {//Si tiene registro la consulta
                emp = "Usuario Encontrado";
            } else {
                emp = "No encontrado";
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el nombre del usuario del empleado..." + ex);
        } finally {
            this.cerrarconexion();
        }
        return emp;
    }
    
    public String ConsultarContraseñaDelUsuario(String contraseña) {
        String emp = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT tipo FROM empleado WHERE contraseña='" + contraseña + "'");
            if (rs.next()) {//Si tiene registro la consulta
                emp = "Contraseña Encontrada";
            } else {
                emp = "No encontrado";
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar la contraseña del empleado..." + ex);
        } finally {
            this.cerrarconexion();
        }
        return emp;
    }
    
     public void ActualizarIntentos(String usuario) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE empleado SET numerointentos = numerointentos-1 WHERE usuario=?");
            ps.setString(1, usuario);
            ps.executeUpdate();
            ps.close();
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar el numero de intentos de los empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
     
     public int ConsultarNumeroIntentos(String usuario) {
        int emp = 1; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT numerointentos FROM empleado WHERE usuario='" + usuario + "'");
            if (rs.next()) {//Si tiene registro la consulta
                emp = rs.getInt(1);
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar la contraseña del empleado..." + ex);
        } finally {
            this.cerrarconexion();
        }
        return emp;
    }

    public Empleado ConsultarRegistroEmpByID(int id) {
        Empleado emp = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT usuario FROM empleado WHERE idempleado =" + id);
            if (rs.next()) {//Si tiene registro la consulta
                emp = new Empleado();
                emp.setUsuario(rs.getString(1));               
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar el registro del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return emp;
    }
    
    public String ConsultarFechaSuspencion(String usuario) {
        String fecha = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT fechasuspendida FROM empleado WHERE usuario='" + usuario + "'");
            if (rs.next()) {//Si tiene registro la consulta
                
                fecha = (rs.getString(1));               
            } 
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar la fecha suspendida del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return fecha;
    }
    
    public String ConsultarHoraSuspendida(String usuario) {
        String hora = null; //Vacio
        try {
            this.obtenerconexion();
            rs = st.executeQuery("SELECT horasuspendida FROM empleado WHERE usuario='" + usuario + "'");
            if (rs.next()) {//Si tiene registro la consulta
                 
                hora = (rs.getString(1));               
            }
            //conexion.close();
        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede recuperar la hora suspendida del empleado..." + ex);
        } finally{
            this.cerrarconexion();
        }
        return hora;
    }
    
    public void ActualizarIntentosA3(String usuario) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE empleado SET numerointentos = 3 WHERE usuario=?");
            ps.setString(1, usuario);
            ps.executeUpdate();
            ps.close();
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar el numero de intentos a 3 de los empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
    
    public void ActualizarfechaSuspendida(String usuario) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE empleado SET fechasuspendida = DATE_ADD(CURDATE(),INTERVAL 1 DAY) WHERE usuario=?");
            ps.setString(1, usuario);
            ps.executeUpdate();
            ps.close();
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar la fecha suspendida de los empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
    
    public void ActualizarHoraSuspendida(String usuario) {

        try {
            this.obtenerconexion();
            ps = conexion.prepareStatement("UPDATE empleado SET horasuspendida = CURTIME() WHERE usuario=?");
            ps.setString(1, usuario);
            ps.executeUpdate();
            ps.close();
            //conexion.close();

        } catch (Exception ex) {
            Mensajes.M1("ERROR! No se puede actualizar la hora suspendida de los empleados..." + ex);
        } finally {
            this.cerrarconexion();
        }
    }
}
