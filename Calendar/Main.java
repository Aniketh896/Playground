#include<stdio.h>
int main()
{
  int mon, year, days, flag = 0;
  scanf("%d",&mon);
  scanf("%d",&year);
  if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                flag = 1;
            else
                flag = 0;
        } else
            flag = 1;
    } else
        flag = 0;
  if(flag)
  {
      switch(mon)
      {
      case 1: days = 31; break;
      case 2: days = 29; break;
      case 3: days = 31; break;
      case 4: days = 30; break;
      case 5: days = 31; break;
      case 6: days = 30; break;
      case 7: days = 31; break;
      case 8: days = 31; break;
      case 9: days = 30; break;
      case 10: days = 31; break;
      case 11: days = 30; break;
      case 12: days = 31; break;
      }
    }
  else
  {
    switch(mon)
    {
      case 1: days = 31; break;
      case 2: days = 28; break;
      case 3: days = 31; break;
      case 4: days = 30; break;
      case 5: days = 31; break;
      case 6: days = 30; break;
      case 7: days = 31; break;
      case 8: days = 31; break;
      case 9: days = 30; break;
      case 10: days = 31; break;
      case 11: days = 30; break;
      case 12: days = 31; break;
    }
  }
  printf("Number of days is %d",days);
}//fill your code
