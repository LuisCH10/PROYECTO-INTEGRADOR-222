package Principal;

import Vista_Empleado1.*;
import Vista1.*;
import Vista_Jefe1.*;
  
import Controlador.*;

public class Main {

    /*Ejecuta aquí*/
//holaaa
    public static Vista1.LOGIN VL;
    public static Controlador.Controlador_Login CL;

    public static Vista_Empleado1.AdministrarDatos VAD;
    public static Controlador_Administrar_V_Empleado CVE;

    public static Vista_Empleado1.Admin_Historial_Facturas VAC;
    public static Controlador_Administrar_Factura_Cliente CAC;

    public static Vista_Empleado1.Admin_Libros VAL;
    public static Controlador_AdministrarLibros CAL;

    public static Vista_Empleado1.BuscarLibros_Venta VBLV;
    public static Controlador_VentaLibros CVL;

    public static Vista_Jefe1.AdministrarSuprema VAS;
    public static Controlador_Administrar_V_Jefe CAS;

    public static Vista_Jefe1.Administrar_Empleados VAE;
    public static Controlador_Administrar_Empleados CAE;

    public static Vista1.AgregarLibroExis VEAL;
    public static Controlador_Agregar_LibroExistente CALE;

    public static Vista1.AgregarLibroNuevo ALN;
    public static Controlador_AgregarLibroNuevo CLN;

    public static Vista1.EditarLibros EL;
    public static Controlador_EditarLibro CEL;

    public static Vista_Jefe1.Administrar_Autores VAU;
    public static Controlador.Controlador_Administrar_Autores CAU;

    public static Vista_Jefe1.Administrar_Editorial VADE;
    public static Controlador.Controlador_Administrar_Editorial CADE;

    public static Vista_Jefe1.Administrar_Tipo_Libro VATL;
    public static Controlador.Controlador_Administrar_Tipo_Libro CATL;

    public static Vista_Jefe1.Administrar_Reporte VAR;
    public static Controlador.Controlador_Administrar_Reporte CAR;

    public static Vista_Jefe1.AgregarAutor VJAA;
    public static Controlador.Controlador_Agregar_Autor CCAA;

    public static Vista_Jefe1.EditarAutor VJEA;
    public static Controlador.Controlador_Editar_Autor CCEA;

    public static Vista_Jefe1.AgregarEditorial VJAE;
    public static Controlador.Controlador_Agregar_Editorial CCAE;

    public static Vista_Jefe1.EditarEditorial VJEE;
    public static Controlador.Controlador_Editar_Editorial CCEE;

    public static Vista1.AñadirEmpleados VAEM;
    public static Controlador_AgregarEmpleado CAEM;

    public static Vista1.EditarEmpleados VEE;
    public static Controlador_EditarEmpleados CEE;

    public static Vista_Empleado1.Admin_RegistroClientesYEmpresas VRCEM;
    public static Controlador_AdministrarRegistroClientesEmpresa CACEM;

    public static Vista_Empleado1.AñadirRegistroClientes AÑRC;
    public static Controlador_AgregarRegistroClientes CARC;

    public static Vista_Empleado1.EditarRegistroClientes ERCL;
    public static Controlador_EditarCliente CEDCL;

    public static Vista_Empleado1.AñadirRegistroEmpresas AREM;
    public static Controlador_AgregarEmpresa CAEMP;

    public static Vista_Empleado1.EditarRegistroEmpresas EREMPRE;
    public static Controlador_EditarEmpresa CEEMPR;

    public static Vista_Jefe1.AgregarTipoLibro VJA;
    public static Controlador_AgregarTipoLibro CAT;

    public static Vista_Jefe1.EditarTipoLibro VJE;
    public static Controlador_EditarTipoLibro CET;
    
    public static Vista_Empleado1.SeleccionarEmpresaOCliente VES;
    public static Controlador_SeleccionarCliente CSC;
    
    public static CantidadDeLibros VCDL;
    public static Controlador_AgregarLibrosAlCarrito CALC;
    
    public static PrecioDireccion VPD;
    public static Controlador_PrecioDireccion CPD;
    
    public static ConfirmarCompra VCC;
    public static Controlador_ConfirmarCompra CCC;
    
    public static ReciboVista1 VRV;
    public static Controlador_Recibo CR;
    
    

    public static void main(String[] args) {

        VL = new Vista1.LOGIN();
        CL = new Controlador_Login(VL);
    }
}
