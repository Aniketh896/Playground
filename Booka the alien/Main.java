#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int years = (num/365);
  int x = num % 365;
  int weeks = x/7;
  int days = x % 7;
  printf("%d\n",years);
  printf("%d\n",weeks);
  printf("%d",days);//fill your code
}