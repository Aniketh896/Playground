#include<stdio.h>
int main()
{
  int size1,size2;
  scanf("%d",&size1);
  scanf("%d",&size2);
  int arr1[size1];
  int arr2[size2];
  int sum1 = 0;
  int sum2 = 0;
  int count = 0;
  for(int i = 0 ; i < size1 ; i++)
  {
  	scanf("%d",&arr1[i]);
  }
  
  for(int j = 0 ; j < size2 ; j++)
  {
  	scanf("%d",&arr2[j]);
  }
  
  for(int k = 0 ; k < size1 ; k++)
  {
  	sum1 = sum1 + arr1[k];
    sum2 = sum2 + arr2[k];
  }
  
  
  if((sum1 == sum2) && (size1 == size2))
    printf("Same");
  else
    printf("Not Same");//fill your code
}