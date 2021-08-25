#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;
int main()
 {
 	int I[4][4],M[4][4],i,j;
 	int n=1;
 	
 	 for(i=0;i<4;i++)
 	 {
 	 	for(j=0;j<4;j++)
 	 	{
 	 		I[i][j]=n++;
 	 		M[j][i]=I[i][j];
 	 		
	    }
     } 

	  for(i=0;i<4;i++)
 	 {
 	 	for(j=0;j<4;j++)
 	 	{
 	 		cout<<I[i][j]<<"  "<<M[i][j]<<endl;
 	 		
 	 		
	    }
     }
	getch();
 }
 //Programa elaborado por:Luz Yong
