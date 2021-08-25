
package celulares;

public class Celular {
    String marca;
    int memoria;
    double precio,pantalla,camara;
 public Celular(){
    marca="SAMSUNG";
    memoria=32;
    precio=15000;
   pantalla=17.5;
 
 }
 public Celular(String ma,double pa,double c,int m,double p){
 pantalla=pa;
 marca=ma;
 memoria=m;
 precio=p;
 camara=c;
 }
 public void escribeDatos(){
 System.out.println("\nMarca: "+marca+"\nMemoria: "+memoria+" GB\nPantalla: "+pantalla+" pulgadas\nCámara: "+camara+" pixeles\nPrecio: $"+precio);
 }
}
