#include<stdio.h>
int main()
{
  int len,lit;
  scanf("%d",&len);
  scanf("%d",&lit);
  int x = (len*len*len)*1000;
  if(lit <= x)
    printf("Can store");
  else
    printf("Cannot store");//fill your code
}