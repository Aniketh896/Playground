#include<stdio.h>
int main()
{
  int lenwall, brwall, len1, br1, len2, br2;
  scanf("%d",&lenwall);
  scanf("%d",&brwall);
  scanf("%d",&len1);
  scanf("%d",&br1);
  scanf("%d",&len2);
  scanf("%d",&br2);
  
  if(((len1+len2) <= lenwall) && ((br1+br2) <= brwall))
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
  //fill your code
}