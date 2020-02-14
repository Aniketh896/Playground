#include<stdio.h>
int main()
{
  int totball, totrun, currun, curball;
  scanf("%d",&totball);
  scanf("%d",&totrun);
  scanf("%d",&currun);
  scanf("%d",&curball);
  int totover = totball / 6;
  int extra = curball % 6;
  int overfin = curball / 6;
  float curover = overfin + (extra*0.1);
  float totrate = (float) totrun/totover;
  float currate = currun/curover;
  printf("%d\n",totover);
  printf("%0.1f\n",curover);
  printf("%0.1f\n",currate);
  printf("%0.1f\n",totrate);
  if(currate >= totrate)
    printf("Eligible to Win");
  else
    printf("Not Eligible to Win");//Fill your code
}