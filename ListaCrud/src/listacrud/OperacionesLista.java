/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacrud;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class OperacionesLista {

//CREAR UNA LISTA, se pone el list, tipo dedato, nombre de la lissta, y ArrayList 
    
    List <String> ListaNueva=new ArrayList ();
     
        String elemento;
        String ElementoNuevo;
        String elementoN;
     
    public void InsertarDatos()
    {
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingresa los datos a la lista-- > ");
        elemento=leer.nextLine();
        ListaNueva.add(elemento);
    
    

    }
    
    public void LeerLista()
    {
        //el itarator sive para mostrar la lista
        Scanner leer=new Scanner (System.in);
        ListaNueva.iterator();
        System.out.println(ListaNueva);
     
        if(ListaNueva.isEmpty())
            System.out.println("esta vacia corazon, inserta elementos");
        
        else
            System.out.println("Contiene datos");
        
    }
    
    public void ActulizarLista()
    {
        Scanner leer=new Scanner (System.in);
        //System.out.println("*******************************************");
        //System.out.println(ListaNueva.size());
       // System.out.println("Que palabra quieres actualizar "); 
        //elemento=leer.nextLine();
        
        //System.out.println("Por cual actualizaras "); 
        //elementoN=leer.nextLine();
       // for(int i=0;i<ListaNueva.size();i++)
       // {
       // String p=ListaNueva.get(i);
        
       // }
            
        System.out.println("*******************************************");
        System.out.println(ListaNueva.size());
        System.out.println("Que palabra quieres actualizar "); 
        elemento=leer.nextLine();
        
        System.out.println("Por cual actualizaras "); 
        elementoN=leer.nextLine();
       
        boolean existe = ListaNueva.contains(elemento);
        
        if(existe){
            ListaNueva.set(ListaNueva.indexOf(elemento), elementoN);
        }else{
            System.out.println("No existe el elemento :( ");
        }
        
        
      // System.out.println(ListaNueva.get(i));  
     //ListaNueva.get(ElementoNuevo());
        
        
    
       
     }  

      
   
    
    public void Borrar()
    {
         Scanner leer=new Scanner (System.in);
        System.out.println("Que elemento quieres borrar ");
        elemento=leer.nextLine();
              if (!ListaNueva.isEmpty())
                  { 
                  boolean x = ListaNueva.contains(elemento);    
                  }
         boolean x = true;
              if (x){
                  ListaNueva.remove((elemento));
              }
              else{
                  System.out.println("El indice no existe");
                           
                       }
                  } //else {
                      //  System.out.println("La lista esta vacia");
                    
                   
      /* // ListaNueva.remove(elemento);
       // System.out.println("");
         for (int i = 0; i < ListaNueva.size(); i++) {
                        elemento =ListaNueva.get(i);
                        // buscamos cual de las patentes en la lista coincide con lo que el usuario escribió:
                       // if (elemento.equals(ListaNueva.get(i))) {
                            // Eliminamos un elemento de la lista utilizando .remove()
                            ListaNueva.remove(elemento);
                            System.out.println("elemento  eliminado");
                       // }
                    }
        
        */   
    
    
    
    
    
    public void Menu(){
        Scanner leer=new Scanner(System.in); 
        int opcion,opc;
        
        do{
        System.out.println("**********************************************");
        System.out.println("++++++++++++++Operacion de la Lista  ++++++++++++++++");
        System.out.println("1.- Ingresar datos a la lista ");
        System.out.println("2.- Mostrar o leer lista ");
        System.out.println("3.- Actualizar lista .");
        System.out.println("4.-Borrar elementos .");
        System.out.println("5.- Salir  ");
        System.out.println("**********************************************");
            System.out.println("Elige una opcion ---->");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:
                InsertarDatos();
            break;
                
            case 2:
                LeerLista();
            break;
                
            case 3:
                ActulizarLista();
            break;
                
            case 4:
               Borrar();
            break;
                
            case 5:
                System.out.println("Gracias por utilizar el programa!");
            break;    
                
                
                
            default:
                System.out.println("Opcion incorrecta favor de elegir una opción correcta!");
        }
        
        
        
            System.out.println("¿Deseas repetir el menu ?\n1-->Si\n2-->No");
            opc=leer.nextInt();
        }
        
        
        while( opc ==1 );
        if( opc == 5 ){
            System.out.println("¡Gracias por utilizar el programa!");
            
            
            
            
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
