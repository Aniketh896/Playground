#include<stdio.h>
int main()
{
  int flipamt,flipdisc,flipship,snapamt,snapdisc,snapship,amzamt,amzdisc,amzship;
  scanf("%d",&flipamt);
  scanf("%d",&flipdisc);
  scanf("%d",&flipship);
  scanf("%d",&snapamt);
  scanf("%d",&snapdisc);
  scanf("%d",&snapship);
  scanf("%d",&amzamt);
  scanf("%d",&amzdisc);
  scanf("%d",&amzship);
  
  int flip,snap,amz ;
  flip = (flipamt - ((flipamt * flipdisc)/100)) + flipship;
  snap = (snapamt - ((snapamt * snapdisc)/100)) + snapship;
  amz = (amzamt - ((amzamt * amzdisc)/100)) + amzship;
  
  printf("In Flipkart: Rs.%d\n",flip);
  printf("In Snapdeal: Rs.%d\n",snap);
  printf("In Amazon: Rs.%d\n",amz);
  
  if(flip < snap && flip < amz)
    printf("He will prefer Flipkart");
  else if(amz < snap && amz < flip)
    printf("He will prefer Amazon");
  else if(snap < flip && snap < amz)
    printf("He will prefer Snapdeal");//fill your code
}