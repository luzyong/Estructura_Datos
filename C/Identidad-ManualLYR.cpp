#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;
int main()
 {
 	int i,j, columna, renglon, valor,p,r;
 	int I[renglon][columna];
 	cout<<"Dime el numero de columnas"<<endl;
 		cin>>columna;
 	cout<<"Dime el numero de renglones"<<endl;
 		cin>>renglon;
 		cout<<renglon;
 		cout<<columna;
 		
 	 for(i=0;i<renglon;i++)
 	 {
 	 	for(j=0;j<columna;j++)
 	 	{
 	 		cout<<i;
 	 		cout<<j;
 	 		cout<<"Dime el valor de la posicion"<<endl;
 				cin>>valor;
			    I[i][j]=valor;
			    cout<<I[i][j];
			}
		}
 	 	
	  for(i=0;i<renglon;i++){
 	 	for(j=0;j<columna;j++){
 	 		cout<<I[i][j];
 	    	//cout<<"La matriz I se encuentra en la posicion: "<<i+1<<"-"<<j+1<<" tiene el valor de: "<<I[i][j]<<endl;
		 }
}	getch();
 }
 //Elaborado por:Luz Yong
