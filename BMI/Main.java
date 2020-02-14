#include<stdio.h>
int main()
{
  float weight,height;
  scanf("%f",&weight);
  scanf("%f",&height);
  float mheight = height / 100 ;
  float x = pow(mheight,2);
  float bmi = weight / x;
  if(bmi < 18.5)
    printf("You are underweight. Have an apple daily.");
  else if(bmi < 24.9)
    printf("You are normal. Go walking daily and maintain it.");
  else if(bmi < 29.9)
    printf("You are overweight. Go to the gym daily.");
  else
    printf("You are obese. Go to doctor");//fill your code
}