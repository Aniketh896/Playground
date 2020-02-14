#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int x = num;
  int rem,rev ;
  while(x > 0)
  {
  	rem = x % 10;
    rev = (rev * 10) + rem;
    x = x / 10 ;
  }
  
  if(num == rev)
    printf("Same");
  else
    printf("Not Same");
  //Fill your code
}