#include<stdio.h>
int main()
{
  char x;
  scanf("%c",&x);
  if(x >= 'A' && x <= 'Z')
    printf("Upper");
  else if(x >= 'a' && x <= 'z')
    printf("Lower");
  else 
    printf("Symbol");//Fill your code
}