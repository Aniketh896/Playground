#include<stdio.h>
int main()
{
  int prin,rate,years;
  scanf("%d",&prin);
  scanf("%d",&rate);
  scanf("%d",&years);
  float a = (float)rate/100;
  float x = prin*a*years;
  float y = prin + x;
  float z = x * 0.02;
  
  printf("%0.2f\n",x);
  printf("%0.2f\n",y);
  printf("%0.2f\n",z);
  printf("%0.2f",y-z);
  //fill your code
}