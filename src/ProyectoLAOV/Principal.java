/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoLAOV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lo397
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menu Interactivo
       //Arreglo Definido
       Scanner sc = new Scanner (System.in);
       List<Cliente> clientes = new ArrayList<>();
       String Usuario, Password;
       int intentos = 3;
       int Id=0;
       int Edad=0;
       int opc =-989898989;
       //Valido1 = validar si el dato es numero en caso de que no lo fuera entra en un ciclo hasta que lo sea
       boolean valido1 = false;
       //Valido2 = es la condicion para que salga del programa
       boolean valido2 = false;
       boolean resp;
       int l =0;
       
        System.out.println("------------------------------");
        System.out.println("--- PROYECTO TERCER PARCIAL ---");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("  ---- INGRESA USUARIO ----");
        
        
        Cliente cliente = new Cliente();
        //While del Usuario
        while(valido2 == false){
            
            System.out.print("INGRESA USUARIO: ");
            Usuario = sc.nextLine();
            System.out.print("INGRESA CONTRASEÑA: ");
            Password = sc.nextLine();
            
            if (Usuario.equals("admin")&&Password.equals("RS20110195")) {
                
                while(opc!=0){
            String Nombre="",Correo="",Telefono="";
            String Buscar,Eliminar;
            
            System.out.println("");
            System.out.print("MENU PRINCIPAL            Tamano de la lista: "+clientes.size());
            System.out.println("");
            System.out.println("1) Agregar Cliente: ");
            System.out.println("2) Mostrar Clientes");
            System.out.println("3) Buscar Cliente");
            System.out.println("4) Eliminar Cliente");
            System.out.println("0) Salir ");
            System.out.print("Ingresa una opcion ------->: ");
            //Pregunta
                    //Para validar datos 
                    do{
                        try{
                            opc = Integer.parseInt(sc.nextLine());
                            valido1 =true;
                        }catch(Exception e){
                            System.out.println("----- Error en la captura -- Intentalo Nuevamente -----");
                            System.out.print("Ingresa una opcion ------->: ");
                            valido1 =false;
                                    }
                    }
                    while(valido1==false);
        
            switch(opc){
                case 0:
                    System.out.println("----- Has salido del Programa -----");
                    System.out.println("----- Pasa un Excelente Dia -----");
                    valido2 = true;
                
                break;
               //Ingresar Datos
                case 1:
                    
                    cliente = new Cliente();
                    //Ingresar el Valor del ID
                    System.out.print("Ingresa el Valor del Id: ");
                    do{
                        try{
                            Id = Integer.parseInt(sc.nextLine());
                            valido1 = true;
                        }catch(Exception e){
                            System.out.println("----- Error en la captura -- Intentalo Nuevamente -----");
                            System.out.print("Ingresa el Valor del Id: ");
                            valido1 = false;
                    
                    }
                    }while(valido1 == false);
                    
                    cliente.setIdCliente(Id);
                    //Ingresar el Nombre
                    System.out.print("Ingresa el Nombre: ");
                    Nombre = sc.nextLine();
                    cliente.setNombre(Nombre);
                    //Ingresar la edad
                    System.out.print("Ingresa La edad: ");
                    do{
                        try{
                            Edad =Integer.parseInt(sc.nextLine());
                            valido1 = true;
                        }catch(Exception e){
                            System.out.println("----- Error en la captura -- Intentalo Nuevamente -----");
                            System.out.print("Ingresa La edad: ");
                            valido1 = false;
                        }
                    }while(valido1 == false);
                    
                    cliente.setEdad(Edad);
                    //Ingresar el Correo
                    System.out.print("Ingresa El Correo Electronico: ");
                    Correo = sc.nextLine();
                    cliente.setCorreo(Correo);
                    //Ingresar el Telefono
                    System.out.print("Ingresa El Telefono: ");
                    Telefono = sc.nextLine();
                    cliente.setTelefono(Telefono);
                    clientes.add(cliente);
                    
                    
                   break;
                   //Mostrar los clientes
                case 2:
                    
                    if(clientes.isEmpty()){
                        System.out.println("----------------------------------------------");
                        System.out.println("------ No se Tiene Registro de Clientes ------");
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                    }else{
                    System.out.println("---------- CLIENTES ----------");
                    System.out.println("---------------------------------");
                    for (Cliente c : clientes) {
                        System.out.println("Id: " + c.getIdCliente());
                        System.out.println("Nombre: " + c.getNombre());
                        System.out.println("Edad: " + c.getEdad());
                        System.out.println("Correo: "+c.getCorreo());
                        System.out.println("Telefono: "+c.getTelefono());
                        
                    System.out.println("---------------------------------");
                    }
                    }
                    
                    
                    break;
                case 3:
                    //Buscar cliente
                    if(clientes.isEmpty()){
                        System.out.println("----------------------------------------------");
                        System.out.println("------ No se Tiene Registro de Clientes ------");
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                    }else{
                    Cliente c2 = new Cliente();
                    System.out.print("Ingresa el Nombre a Buscar: ");
                    Buscar = sc.nextLine();
                    c2.setNombre(Buscar);
                        System.out.println("");
                    System.out.println("---------------------------------");
                    for (Cliente c:clientes) {
                        if (c.getNombre().equals(c2.getNombre())) {
                            
                            System.out.println("    ------- Encontrado -------");
                            System.out.println("---------------------------------");
                            System.out.println("Id: "+c.getIdCliente());
                            System.out.println("Nombre: "+c.getNombre());
                            System.out.println("Edad: "+c.getEdad());
                            System.out.println("Correo: "+c.getCorreo());
                            System.out.println("Telefono: "+c.getTelefono());
                            System.out.println("---------------------------------");
                            System.out.println("");
                            break;
                        }
                    }
                        
                    }
                    break;
                    
                    
                case 4:
                    //Eliminar Principal
                    if(clientes.isEmpty()){
                        System.out.println("----------------------------------------------");
                        System.out.println("------ No se Tiene Registro de Clientes ------");
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                    }else{
                    int i=0;
                    Cliente c3 = new Cliente();
                    System.out.print("Ingresa el Nombre a Eliminar: ");
                    Eliminar = sc.nextLine();
                    c3.setNombre(Eliminar);
                        System.out.println("");
                    System.out.println("---------------------------------");
                        System.out.println("");
                    for(Cliente c:clientes){
                        
                    if (c.getNombre().equals(c3.getNombre())) {
                                clientes.remove(i);
                                System.out.println("----- Eliminado Correctamente -----");
                                break;
                    }
                    i++;
                    
                        
                    }
                    }
                    break;
                    
                default:
                    System.out.println("No es opcion del menu");
            
            }
        }
                
            }else{
                intentos--;
                System.out.println("  Usuario / Contraseña Incorrecta           Intentos: " + intentos);
                System.out.println("");
                valido2 = false;
            }
            if(intentos == 0){
                System.out.println("Son Demaciados Intentos");
                System.out.println("----- SALIR DEL SISTEMA -----");
                valido2 = true;
            }
        
        }  
        
    }
    
}
