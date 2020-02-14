#include<stdio.h>
int main()
{
  char ch;
  scanf("%c",&ch);
  if(ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 117 || ch == 111 || ch == 105 || ch == 101 || ch == 97)
    printf("ASCII of %c is %d",ch,ch);
  else
    printf("Not a vowel");//Fill your code
}