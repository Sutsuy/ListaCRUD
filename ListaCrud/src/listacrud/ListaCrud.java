/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacrud;
import java.util.*;
/**
 *
 * @author HP
 */
public class ListaCrud {

    /**
     * @param args the cmmand line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        
        OperacionesLista instancia=new OperacionesLista();
        
        
        instancia.Menu();
    }
    
}
