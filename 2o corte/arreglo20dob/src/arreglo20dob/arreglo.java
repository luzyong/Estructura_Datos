package arreglo20dob;
import java.lang.Math;

public class arreglo {
    float []Arreglo = new float[20];
    float num;
    int i;
    
    void arreglo(){
    i=0;
    num=0;
    }
    void llenar(){
        for(i=0;i<20;i++){
            num=(float) (11+34*Math.random());
            Arreglo[i]=num;
            System.out.println(Arreglo[i]);
             }
        }
    
}