#include<stdio.h>
int main()
{
  int amt,benshare,beardshare;
  scanf("%d",&amt);
  scanf("%d",&benshare);
  scanf("%d",&beardshare);
  int benamt = (int) (amt*benshare)/100;
  int beardamt = (int) ((amt-benamt)*beardshare)/100;
  int restamt = (int) (amt-beardamt-benamt)/3;
  printf("%d\n",benamt);
  printf("%d\n",beardamt);
  printf("%d",restamt);//fill your code
}