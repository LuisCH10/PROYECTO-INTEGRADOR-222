
package Modelo;

import java.time.LocalDate;

public class Cliente {
    private int idcliente;
    private String nombrecompleto;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String telefono;
    private String direccion;
    private LocalDate fnacimiento;

    public Cliente() {
    }

    public int getIdcliente() {return idcliente;}
    public void setIdcliente(int idcliente) {this.idcliente = idcliente;}
    public String getNombrecompleto() { return nombrecompleto;}
    public void setNombrecompleto(String nombrecompleto) {this.nombrecompleto = nombrecompleto; }
    public String getTipoIdentificacion() {return tipoIdentificacion;}
    public void setTipoIdentificacion(String tipoIdentificacion) {this.tipoIdentificacion = tipoIdentificacion;}
    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) {this.numeroIdentificacion = numeroIdentificacion;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public LocalDate getFnacimiento() {return fnacimiento;}
    public void setFnacimiento(LocalDate fnacimiento) { this.fnacimiento = fnacimiento;}
    
    public Object [] RegistroClientes(int num){
        Object[] fila = {idcliente,nombrecompleto,telefono,direccion,fnacimiento,tipoIdentificacion,numeroIdentificacion};
        return fila;
    }
    
    public Object [] RegistroPersonasYEmpresasTabla(){
        Object[] fila = {idcliente,nombrecompleto,direccion,numeroIdentificacion};
        return fila;
    }
}
