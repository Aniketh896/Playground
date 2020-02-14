#include<stdio.h>
int main()
{
  int fir,sec,thd;
  scanf("%d",&fir);
  scanf("%d",&sec);
  scanf("%d",&thd);
  int secmax;
  if((fir > sec && fir < thd) || (fir < sec && fir > thd))
    secmax = fir;
  else if((sec > fir && sec < thd) || (sec < fir && sec > thd))
    secmax = sec;
  else
    secmax = thd;
  printf("The treasure is in the box which has number %d.\n",secmax);
  int st=fir<sec?(fir<thd?fir:thd):(sec<thd?sec:thd);
  int hcf;
   for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (fir%hcf==0 && sec%hcf==0 && thd%hcf==0)
  		 break;
 	} 
	printf("The code to open the box is %d.",hcf);//fill your code
}