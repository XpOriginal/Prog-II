/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_10;

import java.util.List;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author agusg
 */
public class Archivo{                //SE REMPLAZA EL OBJETO A UTILIZAR (EJ: Jugadores, Arbitros, Personas)
    
    //CONSTRUCTOR
    public Archivo() {
    }
    
    //METODOS
    
    
    //ESCRIBIR USUARIOS
    public void escribirUsuarioArchivo(File archivo, Usuario usuario) throws IOException, FileNotFoundException{        //CON ARCHIVO
        FileWriter escritor = new FileWriter(archivo);
        escritor.write(usuario.getNombre() + "\n");
        escritor.write(usuario.getApellido()+ "\n");
        escritor.write(usuario.getOcupacion()+ "\n");
        escritor.write(usuario.getCarrera()+ "\n");
        escritor.write(usuario.getMail()+ "\n");
        //escritor.write("*");
        
        escritor.close();
    }
    
    public void escribirUsuarioArchivo(String ruta, Usuario usuario) throws IOException, FileNotFoundException{         //SIN ARCHIVO (MANDAR NOMBRE DEL ARCHIVO)
        File archivo = new File(ruta);
        FileWriter escritor = new FileWriter(archivo);
        escritor.write(usuario.getNombre() + "\n");
        escritor.write(usuario.getApellido()+ "\n");
        escritor.write(usuario.getOcupacion()+ "\n");
        escritor.write(usuario.getCarrera()+ "\n");
        escritor.write(usuario.getMail()+ "\n");
        //escritor.write("*");
        
        escritor.close();
    }
    
    //FIN ESCRIBIR USUARIOS
    
    
    
    //CARGAR USUARIOS (PRECARGA)           //Se remplaza el tipo de coleccion (agregando sus metodos necesarios) y datos del objeto
    public void cargarUsuarioArchivo(File archivo, List <Usuario> listaUsuario) throws IOException, FileNotFoundException{      //CON ARCHIVO
        String nombre, apellido, ocupacion, carrera, mail;          //DATOS DEL OBJETO
        Usuario auxUsuario;                                         //OBJETO AUXILIAR
        FileReader lector = new FileReader(archivo);    
        BufferedReader bLector = new BufferedReader(lector);
        String[] datos = new String[5];
        
        while((nombre = bLector.readLine()) != null){               //DATOS DEL OBJETO
            apellido = bLector.readLine();
            ocupacion = bLector.readLine();
            carrera = bLector.readLine();
            mail = bLector.readLine();
            
            if(apellido != null || ocupacion != null || carrera != null || mail != null){
                auxUsuario = new Usuario(nombre, apellido, ocupacion, carrera, mail);
                listaUsuario.add(auxUsuario);
            }else{
                System.out.println("Error, usuario incompleto");
            }
            
        }
        bLector.close();
    }
    
    public void cargarUsuarioArchivo(String ruta, List <Usuario> listaUsuario) throws IOException, FileNotFoundException{       //SIN ARCHIVO (MANDAR NOMBRE DEL ARCHIVO)
        String nombre, apellido, ocupacion, carrera, mail;          //DATOS DEL OBJETO
        
        Usuario auxUsuario;                                         //OBJETO AUXILIAR
        File archivo = new File(ruta);
        FileReader lector = new FileReader(archivo);
        BufferedReader bLector = new BufferedReader(lector);
        String[] datos = new String[5];
        
        while((nombre = bLector.readLine()) != null){               //DATOS DEL OBJETO
            apellido = bLector.readLine();
            ocupacion = bLector.readLine();
            carrera = bLector.readLine();
            mail = bLector.readLine();
            
            if(apellido != null || ocupacion != null || carrera != null || mail != null){
                auxUsuario = new Usuario(nombre, apellido, ocupacion, carrera, mail);
                listaUsuario.add(auxUsuario);
            }else{
                System.out.println("Error, usuario incompleto");
            }
            
        }
        bLector.close();
    }
    //FIN CARGAR USUARIOS (PRECARGA)
    
    
    //CREAR ARCHIVO
    public void crearArchivoUsuario(String ruta) throws IOException{                //CREA ARCHIVO EN CASO DE QUE NO EXISTA
        BufferedWriter creador = new BufferedWriter(new FileWriter(ruta));
        creador.close();
    }
    
    public void imprimirArchivoUsuario(File archivo) throws IOException, FileNotFoundException{
        FileReader lector = new FileReader(archivo);
        BufferedReader bLector = new BufferedReader(lector);
        String s;
        
        while((s=bLector.readLine()) != null){
            System.out.println(s);
        }
        
        bLector.close();
    }
}
