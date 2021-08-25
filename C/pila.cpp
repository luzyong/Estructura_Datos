#include<stdio.h>
#include<conio.h>
int tope=0,i,r,pila[4],dato,lle=3,vac=0;
int pushd();
int popd();
int mostr();
int main()
{   do
    {
    printf("\nElige una opcion: \n1.-Insertar datos\n2.-Borrar datos\n3.-Mostrar datos\n4.-Salir\n\n");
    scanf("%d",&r);
    
    switch(r)
    {
             case 1:
                  printf("Elegiste insertar datos.\n");
                    scanf("%d",&dato);
                    pushd();
                    
                    break;
             case 2:
                  printf("\nElegiste borrar datos\n");
                  popd();
                  break;
             case 3:
                  printf("\nElegiste mostrar datos.");
                  mostr();
                  break;
             case 4:
                  printf("Saliendo...");
                  getch();
                  break;
             default:
                     printf("\nError, elige una opcion valida");
                    
   }
}
while(r!=4);
}
   
int pushd()
{
    
    if(pila[tope]!=dato)
    {
        pila[tope]=dato;
         tope++;  
         if(tope==4)
         {
           tope=0;
           printf("\nPila llena, no introduzcas mas datos\n");
         }
     }
     else if(pila[tope]==dato)
     {
         printf("\nEse dato ya existe. Ingresa otro valor\n");
     }
     
     
}
int popd()
{
    for(i=0;i<4;i++)
    {
      if(pila[i]==NULL)
      {
       vac++;
       }
       
    }
       
        if(vac>=4)
       {
        printf("\n\nPila vacia\n\n");
        }
            pila[lle]=NULL;
            lle--;
         
    
}
int mostr()
{
    for(i=0;i<4;i++)
    {
        printf("\n%d\n",pila[i]);
    }
}  
