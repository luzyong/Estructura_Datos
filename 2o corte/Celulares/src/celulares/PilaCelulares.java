
package celulares;

public class PilaCelulares {
 int tam;
    Celular[] base;
    int tope;
    
    public PilaCelulares(){
        tam=15;
        base=new Celular[tam];
        tope=0;
    }
    public PilaCelulares(int t){
        tam=t;
        base=new Celular[tam];
        tope=0;
    }
    public void Push(Celular dato){
        if(tope==tam-1){
            System.out.println("PILA LLENA");
        }
        else{
            tope++;
            base[tope]=dato;
        }
    }
    public Celular Pop(){
        if(tope==0){
            System.out.println("PILA VACIA");
            return null;
        }
        else{
            Celular valor=base[tope];
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

