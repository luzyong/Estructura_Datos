package piladobles;

import javax.swing.JOptionPane;

public class menu {
    int tam,tope,i;
    float[] Pila;
    float dato;
    String respuesta;
    void menu(){
        respuesta=JOptionPane.showInputDialog("Escriba el tamaño de la pila");
        tam=Integer.parseInt(respuesta);
        Pila= new float[tam];
        tope=0;
    }
    void Push(){
        respuesta=JOptionPane.showInputDialog("Escriba el dato");
                  dato=Float.parseFloat(respuesta);
        if(tope==tam-1){
            System.out.print("PILA LLENA");
        }
        else{
            tope++;
            Pila[tope]=dato;
        }
    }
   public float Pop(){
    if(tope==0){
        System.out.print("PILA VACIA\n");
        return 0;
    }
    else{
        float valor=Pila[tope];
        tope--;
        System.out.print("DATO REMOVIDO\n"+valor);
        return valor;
    }
    }
    void Mostrar(){
        for(i=0;i<tope;i++){
            System.out.print("\n"+Pila[tope-i]);
        }
    }
       
   }
    

