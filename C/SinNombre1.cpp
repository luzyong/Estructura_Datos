#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;
int main()
 {
 	int I[3][3],i,j;
 	
 	 for(i=0;i<3;i++)
 	 {
 	 	for(j=0;j<3;j++)
 	 	{
 	 		if(i==j)
 	 		{
 	 			I[i][j]=1;
			  }
			  else
			  {
			  	I[i][j]=0;
			  }
		  }
	  }
	  for(i=0;i<3;i++)
	  {
 	 	for(j=0;j<3;j++)
 	    {
 	    	cout<<"La matriz I se encuentra en la posicion: "<<i+1<<"-"<<j+1<<" tiene el valor de: "<<I[i][j]<<endl;
		 }
	  }
	getch();
 }
 //Programa elaborado por:Luz Yong
