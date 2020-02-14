#include<stdio.h>
int main()
{
  int x1,x2,x3,y1,y2,y3;
  scanf("%d",&x1);
  scanf("%d",&y1);
  scanf("%d",&x2);
  scanf("%d",&y2);
  scanf("%d",&x3);
  scanf("%d",&y3);
  float x = (float)(x1+x2+x3)/3;
  float y = (float)(y1+y2+y3)/3;
  printf("%0.1f\n",x);
  printf("%0.1f",y);//fill your code
}