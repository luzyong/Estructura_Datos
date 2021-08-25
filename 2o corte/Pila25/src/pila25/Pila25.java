
package pila25;

import javax.swing.JOptionPane;

public class Pila25 {
public static void main(String[] args) {
       menu menu =new menu();
       boolean flag=true;
       int opcion;
       float dato;
       String respuesta;
       menu.menu();
       while(flag==true){
       
       System.out.println("\nElija una opción:");
       System.out.println("1.-Agregar dato a pila");
       System.out.println("2.-Borrar dato a pila");
       System.out.println("3.-Estado actual de la pila");
       System.out.println("4.-Salir del programa");
       respuesta=JOptionPane.showInputDialog("Escriba la opción");
       opcion=Integer.parseInt(respuesta);
          switch(opcion){
              case 1:
                  respuesta= JOptionPane.showInputDialog("Escriba la palabra");
                  menu.Push(respuesta);
                  break;
              case 2:
                  menu.Pop();
                  break;
              case 3:
                  menu.Mostrar();
                  break;
              case 4:
                  flag=false;
                  break;
              default:
                  System.out.println("Opción Inválida");
                  break;
          }
    }
   
    }
    
}
