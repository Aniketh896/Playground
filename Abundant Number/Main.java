#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int i = num-1;
  int sum;
  while(i > 0)
  {
  	if((num % i) == 0)
      sum = sum + i;
    i--;
  }
  
  if(sum > num)
    printf("Abundant Number");
  else
    printf("Not Abundant Number");//Fill your code
}