package coches;
import javax.swing.JOptionPane;

public class Coches {
    public static void main(String[]Args){
PilaCoches menu =new PilaCoches(40);
       boolean flag=true;
       int opcion,model;
       double costo;
       String respuesta,name,marc;
       Coche dato;
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
                  model= Integer.parseInt(JOptionPane.showInputDialog("Escriba el modelo"));
                  name= JOptionPane.showInputDialog("Escriba el nombre");
                  marc= JOptionPane.showInputDialog("Escriba la marca");
                  costo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
                  dato=new Coche(name,marc,model,costo);
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

