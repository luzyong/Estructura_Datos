
package bicicletas;

public class Bicicleta {
 String marca;
 int rodada;
 String estilo;
 double precio;
 public Bicicleta(){
 marca="BENNOTTO";
 rodada=24;
 precio=15000;
 estilo="TURISMO";
 
 }
 public Bicicleta(String m,String e,int r,double p){
 estilo=e;
 marca=m;
 rodada=r;
 precio=p;
 }
 public void escribeDatos(){
 System.out.println("\nMarca: "+marca+"\nEstilo: "+estilo+"\nRodada: "+rodada+"\nPrecio: "+precio);
 }
}
