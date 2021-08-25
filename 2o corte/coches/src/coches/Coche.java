
package coches;

public class Coche {
 String nombre;
 String marca;
 int modelo;
 double precio;
 public Coche(){
 marca="CHEVROLET";
 nombre="AVEO";
 modelo=2018;
 precio=150000;
 
 }
 public Coche(String n,String ma,int m,double p){
 nombre=n;
 marca=ma;
 modelo=m;
 precio=p;
 }
 public void escribeDatos(){
 System.out.println("\nMarca: "+marca+"\nNombre: "+nombre+"\nModelo: "+modelo+"\nPrecio: "+precio);
 }
}
