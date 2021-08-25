
package teniss;

public class Tenis {
    String marca,modelo,color;
    double precio,talla;
 public Tenis(){
    marca="NIKE";
    talla=25;
    precio=1500;
    color="BLANCO";
    modelo="AIR";
 
 }
 public Tenis(String ma,String mo,String c,double p,double ta){
 modelo=mo;
 marca=ma;
 talla=ta;
 color=c;
 precio=p;
 }
 public void escribeDatos(){
 System.out.println("\nMarca: "+marca+"\nModelo: "+modelo+"\nColor: "+color+"\nTalla: "+talla+"\nPrecio: $"+precio);
 }
}
