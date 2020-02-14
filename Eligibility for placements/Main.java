#include<stdio.h>
int main()
{
  char name[50];
  float x;
  int a,b;
  scanf("%s",&name);
  scanf("%d",&a);
  scanf("%f",&x);
  scanf("%d",&b);
  printf("%s\n",name);
  printf("%d\n",a);
  if((x >= 7.0 && b == 0) || (x >= 7.5 && b>0))
    printf("Eligible to attend placement");
  else
    printf("Not Eligible to attend placement");//fill your code
}