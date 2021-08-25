
package bicicletas;

import javax.swing.JOptionPane;

public class Bicicletas {

    public static void main(String[] args) {
       PilaBicicletas menu =new PilaBicicletas(40);
       boolean flag=true;
       int opcion,rod;
       double costo;
       String respuesta,style,marc;
       Bicicleta dato;
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
                  style= JOptionPane.showInputDialog("Escriba el estilo");
                  rod= Integer.parseInt(JOptionPane.showInputDialog("Escriba la rodada"));
                  costo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
                  dato=new Bicicleta(marc,style,rod,costo);
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
