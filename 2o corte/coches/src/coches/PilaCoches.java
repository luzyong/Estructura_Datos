
package coches;

public class PilaCoches {
    int tam;
    Coche[] base;
    int tope;
    
    public PilaCoches(){
        tam=15;
        base=new Coche[tam];
        tope=0;
    }
    public PilaCoches(int t){
        tam=t;
        base=new Coche[tam];
        tope=0;
    }
    public void Push(Coche dato){
        if(tope==tam-1){
            System.out.println("PILA LLENA");
        }
        else{
            tope++;
            base[tope]=dato;
        }
    }
    public Coche Pop(){
        if(tope==0){
            System.out.println("PILA VACIA");
            return null;
        }
        else{
            Coche valor=base[tope];
            tope--;
            return valor;
        }
    }
    public void Mostrar(){
        if(tope==0){
            System.out.println("PILA VACIA");
        }
        else{
            int k=tope;
            while(k>0){
                base[k].escribeDatos();
                k--;
            }
        }
    }
}
