#include<stdio.h>
int main()
{
  int temp,windv;
  scanf("%d",&temp);
  scanf("%d",&windv);
  float wcf = 35.74 + (0.6215*temp) + ((0.4275*temp) - 35.75) * pow(windv,0.16);
  printf("%0.2f",wcf);//fill your code
}