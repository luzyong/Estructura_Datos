#include <stdio.h>
#include <conio.h>


int main()
{
	int matriz[4][3], i, j, k;
	{
		for (i=0; i<4; i++)
		{
			for (j=0; j<3; j++)
			{
				matriz[i][j]=i*i;
				
				printf("%d\n", matriz[i][j]); 
			}		
		}
	}
	getch();
}

//Programa realizado por: Luz Yong Rodriguez
