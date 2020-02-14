#include<stdio.h>
int main()
{
  float mil;
  int lit,dis;
  scanf("%f",&mil);
  scanf("%d",&lit);
  scanf("%d",&dis);
  float x = mil * lit;
  if(x >= dis)
    printf("Can reach");
  else
    printf("Cannot reach");//Fill your code
}