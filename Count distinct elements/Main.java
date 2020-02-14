#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size];
  for(int i = 0 ; i< size ; i++)
  {
  	scanf("%d",&arr[i]);
  }
  int flag = 0;
  int count = 0;
  for(int j = 0 ; j< size ; j++)
  {
    flag = 0;
  	for(int k = j+1 ; k < size ; k++)
    {
    	if(arr[j] == arr[k])
        {
        	flag = 1;
          	break;
        }
        else
        	continue;
    }
    if(flag == 0)
      count++;
  }
  
  printf("There are %d distinct elements in the array.",count);
  //fill your code
}