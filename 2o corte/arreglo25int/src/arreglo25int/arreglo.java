
package arreglo25int;
import java.lang.Math;

public class arreglo {
    int []Arreglo = new int[25];
    int num, i;
    
    void arreglo(){
    i=0;
    num=0;
    }
    void llenar(){
        for(i=0;i<25;i++){
            num=(int) (15+28*Math.random());
            Arreglo[i]=num;
            System.out.println(Arreglo[i]);
             }
        }
    
}

