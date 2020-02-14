#include<stdio.h>
#include<math.h>
int main()
{
  int x,total;
  scanf("%d",&x);
  if(x <= 200)
    total = x*0.5;
  else if(x <= 400)
    total = ceil((x*0.65) + 100);
  else if(x <= 600)
    total = (x*0.80) + 200;
  else
    total = (x*1.25) + 425;
  int z = round(total);
  printf("Rs.%d",z);//fill your code
}