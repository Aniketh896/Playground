#include<stdio.h>
int main()
{
  int num1,num2,num3,big;
  scanf("%d",&num1);
  scanf("%d",&num2);
  scanf("%d",&num3);
  if(num1 > num2 && num1 > num3)
    big = num1;
  else if(num2 > num1 && num2 > num3)
    big = num2;
  else
    big = num3;
  printf("%d is greater",big);//Fill your code
}