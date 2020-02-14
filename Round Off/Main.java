#include <stdio.h>
#include <math.h>
int main()
{
  float x;
  scanf("%f",&x);
  int y = (int) x;
  printf("%d\n",y);
  
  printf("%0.1f\n",ceil(x));
  printf("%0.1f",floor(x));//fill your code
}