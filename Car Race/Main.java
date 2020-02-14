#include<stdio.h>
int main()
{
  int rda,rdb,rdc,numcar;
  scanf("%d",&rda);
  scanf("%d",&rdb);
  scanf("%d",&rdc);
  scanf("%d",&numcar);
  if(rda%numcar==0)
    printf("Car 1 goes into road A");
  else if(rdb%numcar==0)
    printf("Car 1 goes into road B");
  else if(rdc%numcar==0)
    printf("Car 1 goes into road C");
  else
    printf("No path exist");//Fill your code
}