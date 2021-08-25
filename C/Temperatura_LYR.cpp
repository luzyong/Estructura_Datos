#include <stdio.h>
#include <conio.h>

int main()
{
	int i, n;
	float temperatura[5];
	
	for (i=0; i<5; i++)
	{
		n=i+1;
		printf("Ingresa la temperatura del dia %d\n", n);
		scanf("%f", &temperatura[i]);
	}
	
	for (i=0; i<5; i++)
	{
		n=i+1;
		printf("\n El dia %d del mes de Enero tuvo una temperatura de: %f", n, temperatura[i]);
	}
	getch();
}

//Programa elaborado por Luz Yong Rodriguez
