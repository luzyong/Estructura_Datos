package pila25;


public class menu {
    int tam,tope,i;
    String[] Pila;
  //  String respuesta,dato;
    void menu(){
        Pila= new String[20];
        tope=0;
        
    }
    void Push(String respuesta){
       
                  
        if(tope==tam-1){
            System.out.print("PILA LLENA");
        }
        else{
            tope++;
            Pila[tope]=respuesta;
        }
    }
   public String Pop(){
    if(tope==0){
        System.out.print("PILA VACIA\n");
        return null;
    }
    else{
        String valor=Pila[tope];
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
