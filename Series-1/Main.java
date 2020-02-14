#include<stdio.h>
int main()
{
  int num,x = 7;
  scanf("%d",&num);
  for(int i = 0;i<num;i++)
  {
    if(i == 0)
      x = x;
    else if(i % 2 == 0)
      x = x+3;
    else
      x = x-2;
	printf("%d ",x);
  }//fill your code
}