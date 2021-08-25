
package teniss;

public class PilaTenis {
  int tam;
    Tenis[] base;
    int tope;
    
    public PilaTenis(){
        tam=15;
        base=new Tenis[tam];
        tope=0;
    }
    public PilaTenis(int t){
        tam=t;
        base=new Tenis[tam];
        tope=0;
    }
    public void Push(Tenis dato){
        if(tope==tam-1){
            System.out.println("PILA LLENA");
        }
        else{
            tope++;
            base[tope]=dato;
        }
    }
    public Tenis Pop(){
        if(tope==0){
            System.out.println("PILA VACIA");
            return null;
        }
        else{
            Tenis valor=base[tope];
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

