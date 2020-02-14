#include<stdio.h>
int main()
{
  int x,x1,num,sum;
  scanf("%d",&x);
  x1 = x;
  while(x1 > 0)
  {
  	num = x1 % 10;
    sum = sum + num;
    x1 = x1 / 10;
  }
  
  if((x % sum) == 0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
  //fill your code
}