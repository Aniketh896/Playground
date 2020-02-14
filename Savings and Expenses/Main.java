#include<stdio.h>
int main()
{
  int sal,bankfee,hosfee,foodfee,parfee;
  scanf("%d",&sal);
  scanf("%d",&bankfee);
  scanf("%d",&hosfee);
  scanf("%d",&foodfee);
  scanf("%d",&parfee);
  int tot = bankfee + parfee + foodfee + hosfee;
  if(tot > sal)
    printf("He has to work hard");
  else if(tot == sal)
    printf("He can manage the expenses");
  else
    printf("He can save the money");//fill your code
}