#include<stdio.h>
int main()
{
  int x,y;
  scanf("%d",&x);
  y = x%10;
  x = x/10;
  int sum = x+y;
  printf("%d",sum);//fill your code
}