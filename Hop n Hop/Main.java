#include<stdio.h>
int main()
{
  int x1,y1;
  scanf("%d",&x1);
  scanf("%d",&y1);
  int x = pow(x1-3,2);
  int y = pow(y1-4,2);
  int sum = sqrt(x + y);
  printf("%d",sum);//fill your code
}