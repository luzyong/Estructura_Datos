package arreglo25dob;
import java.lang.Math;

public class arreglo {
    float []Arreglo = new float[25];
    float num;
    int i;
    
    void arreglo(){
    i=0;
    num=0;
    }
    void llenar(){
        for(i=0;i<25;i++){
            num=(float) (12+24*Math.random());
            Arreglo[i]=num;
            System.out.println(Arreglo[i]);
             }
        }
    
}
