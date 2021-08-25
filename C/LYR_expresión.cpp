#include <stdio.h>
#include <string.h>
#define N 99
//Arreglos y variables
char exp_inf[N];
char exp_pos[N];
char pila[5];
int tope=0, j=0, operador_tope=0, operador_infija, largo, des;
//Funciones
void push();
void pop();
void mostrar();
void analiza();
void operador();
void operador_pila();
void comparar();
//Cuerpo
void main()
{
int i;
printf("Introduzca la expresion infija (Maximo %d caracteres): \n",N);//Pide la expresión aritmética
scanf("%s",&exp_inf);//la guarda en la variable exp_inf
largo=strlen(exp_inf);//la variable largo adquiere el valor que arroje la función strlen, que sirve para medir el tamaño de una cadena
for(i=0;i<largo;i++)//se genera un ciclo for con el valor de largo
{
analiza(exp_inf[i]);//la función se analiza se ejecuta con la variable exp_inf
}
do//mientras la variable tope sea mayor o igual a cero, se borrarán los datos de la fila
{
pop();
}
while(tope>=0);
mostrar();//se dirige a la función mostrar
printf("Desea introducir otra ecuacion? \n1)Si \n2)No\n");//menú de opciones
scanf("%d",&des);//guarda la respuesta en des
if(des==1)//Si se elije la opción 1, la variable j es igual a 0 y se dirige a la función main
{
j=0;
main();
}
}
void analiza(dato)//dentro de la función analiza se crea un if
{
if(dato=='^'||dato=='*'||dato=='/'||dato=='+'||dato=='-'||dato=='('||dato==')')//
{
switch(dato)
{ 
case ')':
while (operador_tope>0)
{
pop();
}
pila[tope]=0;
tope-=2;
operador_pila();
tope++;
break;
default:
operador (dato);
}
}
else
{
exp_pos[j]=dato;
j++;
} 
}
void operador(dato)
{
switch(dato)
{
case '^':
operador_infija=3;
break;
case '*':
operador_infija=2;
break;
case '/':
operador_infija=2;
break;
case '+':
operador_infija=1;
break;
case '-':
operador_infija=1;
break;
case '(':
operador_infija=4;
}
comparar(dato, operador_infija);
}
void comparar(dato, operador_infija)
{ 
if(operador_infija<=operador_tope)
{
pop();
comparar(dato, operador_infija);
}
else
{
push(dato);
}
}
void push(dato)
{
if(tope<5)
{
pila[tope]=dato;
operador_pila();
tope++;
}
else
{
printf("La pila esta llena");
}
}
void pop()
{
if(tope>=0)
{
tope--;
exp_pos[j]=pila[tope];
j++;
pila[tope]=0;
tope--;
operador_pila();
tope++;
}
else
{
printf("La pila esta vacia");
}
}
void operador_pila()
{
switch(pila[tope])
{ 
case '^':
operador_tope=3;
break;
case '*':
operador_tope=2;
break;
case '/':
operador_tope=2;
break;
case '+':
operador_tope=1;
break;
case '-':
operador_tope=1;
break;
case '(':
operador_tope=0;
break;
default:
operador_tope=0;
}
}
void mostrar()
{
int i;
printf("\n\nExpresion infija: ");
for(i=0;i<largo;i++)
{
printf("%c",exp_inf[i]);
}
printf("\n\nExpresion Postfija: ");
for(i=0;i<largo;i++)
{
printf("%c",exp_pos[i]);
}printf("\n\n");
} 
