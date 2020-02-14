#include<stdio.h>
#include<math.h>
int main()
{
  float rad, he, waterhour, tothour;
  scanf("%f",&rad);
  scanf("%f",&he);
  scanf("%f",&waterhour);
  scanf("%f",&tothour);
  float vol = 3.14 * rad * rad * he;
  float totwater = waterhour * tothour;
  float wit = (int) ceil(vol / waterhour);
  if(totwater >= vol)
    printf("The tank can be filled within %0.1f hours",wit);
  else
  {
    wit = tothour;
    printf("The tank cannot be filled within %0.1f hours",wit);
  }//fill your code
}