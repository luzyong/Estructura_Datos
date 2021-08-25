
package teniss;

import javax.swing.JOptionPane;

public class Teniss {

    public static void main(String[] args) {
       
       PilaTenis menu =new PilaTenis(40);
       boolean flag=true;
       int opcion;
       double costo,ta;
       String respuesta,marc,mod,col;
       Tenis dato;
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
                  marc= JOptionPane.showInputDialog("Escriba la marca");
                  mod= JOptionPane.showInputDialog("Escriba el modelo");
                  col= JOptionPane.showInputDialog("Escriba el color");
                  ta= Double.parseDouble(JOptionPane.showInputDialog("Escriba la talla"));
                  costo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
                  dato = new Tenis(marc,mod,col,costo,ta);
                  menu.Push(dato);
                  break;
              case 2:
                  menu.Pop().escribeDatos();
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
