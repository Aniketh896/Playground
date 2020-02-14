#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  int numsq = x*x;
  int numdig = numsq % 10;
  if(numdig == x)
    printf("Automorphic Number");
  else
    printf("Not Automorphic Number");//fill your code
}