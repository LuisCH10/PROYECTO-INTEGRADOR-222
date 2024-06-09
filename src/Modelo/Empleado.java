package Modelo;

import java.time.*;

public class Empleado {
    private int idempleado;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fnacimiento;
    private String tipo;
    private String genero;
    private String estado;
    private String dni;
    private int numerointentos;
    private LocalDate fechasuspendida;
    private LocalTime horasuspendida;
    
    public Empleado() {
    }
    
    public int getNumerointentos() { return numerointentos;}
    public void setNumerointentos(int numerointentos) { this.numerointentos = numerointentos;}
    public LocalDate getFechasuspendida() { return fechasuspendida;}
    public void setFechasuspendida(LocalDate fechasuspendida) { this.fechasuspendida = fechasuspendida;}
    public LocalTime getHorasuspendida() { return horasuspendida; }
    public void setHorasuspendida(LocalTime horasuspendida) { this.horasuspendida = horasuspendida;}
    public int getIdempleado()                        {    return idempleado;  }
    public void setIdempleado(int idempleado)         { this.idempleado = idempleado;   }
    public String getUsuario()                        {    return usuario; }
    public void setUsuario(String usuario)            {    this.usuario = usuario; }
    public String getContraseña()                     { return contraseña;  }
    public void setContraseña(String contraseña)      {  this.contraseña = contraseña;   }
    public String getNombre()                         { return nombre;  }
    public void setNombre(String nombre)              {  this.nombre = nombre;   }
    public String getApellido()                       {   return apellido;    }
    public void setApellido(String apellido)          {  this.apellido = apellido;   }
    public String getTelefono()                       {   return telefono;    }   
    public void setTelefono(String telefono)          {  this.telefono = telefono;   }
    public String getEmail()                          {  return email;   }
    public void setEmail(String email)                {    this.email = email; }
    public LocalDate getFnacimiento()                 { return fnacimiento; }
    public void setFnacimiento(LocalDate fnacimiento) { this.fnacimiento = fnacimiento; }
    public String getTipo()                           {   return tipo;    }
    public void setTipo(String tipo)                  {  this.tipo = tipo;   }
    public String getGenero()                         { return genero;  }
    public void setGenero(String genero)              {  this.genero = genero;}
    public String getEstado()                         { return estado;  }
    public void setEstado(String estado)              {  this.estado = estado;   }
    public String getDni()                            {    return dni; }
    public void setDni(String dni)                    {    this.dni = dni; }
    
    public Object [] RegistroEmpleados(int num){
        Object[] fila = {idempleado,usuario,nombre,apellido,telefono,email,dni,fnacimiento,tipo,genero,estado};
        return fila;
    }  
}
