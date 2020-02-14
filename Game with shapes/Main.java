#include<stdio.h>
int main()
{
  int len,r;
  scanf("%d",&r);
  scanf("%d",&len);
  int circle = 2*r;
  if(circle > len)
    printf("circle cannot be inside a Square");
  else
    printf("circle can be inside a square");//Fill your code
}