package arreglo20int;
import java.lang.Math;

public class arreglo {
    int []Arreglo = new int[20];
    int num, i;
    
    void arreglo(){
    i=0;
    num=0;
    }
    void llenar(){
        for(i=0;i<20;i++){
            num=(int) (12+26*Math.random());
            Arreglo[i]=num;
            System.out.println(Arreglo[i]);
             }
        }
    
}