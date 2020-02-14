#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int firstnum  = num / 1000;
  int lastnum = num % 10;
  int sum = lastnum + firstnum ;
  printf("%d",sum);//fill your code
}