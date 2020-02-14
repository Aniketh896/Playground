#include<stdio.h>
int main()
{
  int dollar1,cent1,dollar2,cent2;
  scanf("%d",&dollar1);
  scanf("%d",&cent1);
  scanf("%d",&dollar2);
  scanf("%d",&cent2);
  
    int dollar = dollar1 + dollar2 + ((cent1 + cent2) / 100);
  	int cent = (cent1 + cent2) % 100;
  
  printf("%d\n",dollar);
  printf("%d",cent);//fill your code
}