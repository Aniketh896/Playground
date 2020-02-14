#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size];
  int even = 0;
  int odd = 0;
  for(int i = 0;i<size;i++)
  {
  	scanf("%d",&arr[i]);
  }
  
  for(int j = 0;j<size;j++)
  {
  	if(arr[j] % 2 == 0)
      even++;
    else
      odd++;
  }
  
  printf("Odd: %d\n",odd);
  printf("Even: %d",even);//fill your code
}