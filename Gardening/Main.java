#include<stdio.h>
int main()
{
  int row,col,num;
  scanf("%d",&row);
  scanf("%d",&col);
  scanf("%d",&num);
  if((num <= row*2 && num >= row+1) || ((num >= (row*(col-2))+1) && (num <= row*(col-1))))
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");//fill your code
}