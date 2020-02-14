#include<stdio.h>
int main()
{
  int adul,chi,weight;
  scanf("%d",&weight);
  scanf("%d",&adul);
  scanf("%d",&chi);
  int x = (75*adul)+(30*chi);
  if(weight >= x)
    printf("Boat is stable");
  else
    printf("Boat will drow");//fill your code
}