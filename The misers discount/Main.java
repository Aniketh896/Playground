#include<stdio.h>
int main()
{
  float item1,item2,perc;
  scanf("%f",&item1);
  scanf("%f",&item2);
  scanf("%f",&perc);
  float tamt = item1+item2;
  float disc1 = item1 - (item1*(perc/100));
  float disc2 = item2 - (item2*(perc/100));
  float tdisc = disc1 + disc2 ;
  float discsum = tamt - tdisc ;
  printf("%0.2f\n",tamt);
  printf("%0.2f\n",tdisc);
  printf("%0.2f",discsum);//fill your code
}