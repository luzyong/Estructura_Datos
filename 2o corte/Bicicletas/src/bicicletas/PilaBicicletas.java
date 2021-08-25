
package bicicletas;

public class PilaBicicletas {
   int tam;
    Bicicleta[] base;
    int tope;
    
    public PilaBicicletas(){
        tam=15;
        base=new Bicicleta[tam];
        tope=0;
    }
    public PilaBicicletas(int t){
        tam=t;
        base=new Bicicleta[tam];
        tope=0;
    }
    public void Push(Bicicleta dato){
        if(tope==tam-1){
            System.out.println("PILA LLENA");
        }
        else{
            tope++;
            base[tope]=dato;
        }
    }
    public Bicicleta Pop(){
        if(tope==0){
            System.out.println("PILA VACIA");
            return null;
        }
        else{
            Bicicleta valor=base[tope];
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
