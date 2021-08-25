
package celulares;

import javax.swing.JOptionPane;

public class Celulares {

    public static void main(String[] args) {
       PilaCelulares menu =new PilaCelulares(40);
       boolean flag=true;
       int opcion,mem;
       double costo,cam,pan;
       String respuesta,marc;
       Celular dato;
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
                  cam= Double.parseDouble(JOptionPane.showInputDialog("Escriba los pixeles de la cámara"));
                  pan= Double.parseDouble(JOptionPane.showInputDialog("Escriba el tamaño de la pantalla"));
                  costo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
                  mem= Integer.parseInt(JOptionPane.showInputDialog("Escriba el tamaño de la memoria"));
                  dato=new Celular(marc,cam,pan,mem,costo);
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
