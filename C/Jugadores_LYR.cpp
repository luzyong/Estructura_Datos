#include<stdio.h>
#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
string buscar;
string Jugador[6];
int posicion, i;


for (i=0; i<6; i++)
{
	cout<<"Introduce el nombre de tus 6 jugadores"<<endl;
	cin>>Jugador[i];
}
cout<<"Introduce el nombre del jugador y te dire la posicion"<<endl;
	cin>>buscar;
for(i=0;i<6;i++)
{
posicion=i+1;
	if(buscar==Jugador[i])
	{
	cout<<"el jugador "<<buscar<<"esta en la posicion "<<posicion<<endl;
	}
}

getch();
}
//Programa elaborado por Luz Yong Rodrìguez
