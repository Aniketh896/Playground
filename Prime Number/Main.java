#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int i = num - 1;
  int count = 0;
  while(i > 1)
  {
  	if((num % i) == 0)
      count++;
    i--;
  }
  
  if(count < 1)
    printf("Prime");
  else
    printf("Not prime");//Fill your code
}