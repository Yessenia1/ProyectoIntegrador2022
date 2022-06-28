package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDao extends AppCrud{
    LeerTeclado leerT;
    LeerArchivo leerA;
    UtilsX util=new UtilsX();
    UsuarioTO uTo;
  final static String TABLA_USUARIO="Usuario.txt";
    public void crearUsuario() {
        leerA=new LeerArchivo(TABLA_USUARIO);
        uTo=new UsuarioTO();
        System.out.println("*****************Crear Usuario************");
        uTo.setUsuario(leerT.leer( "", "Ingrese Usuario: "));
        Console cons=System.console();
        System.out.println("Ingrese su clave");
        char[] claveX=cons.readPassword();
        uTo.setClave(String.valueOf(claveX));
        agregarContenido(leerA, uTo);

    }
}
