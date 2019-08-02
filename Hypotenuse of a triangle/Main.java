#include<stdio.h>
#include<math.h>
int main()
{
  float b,h;
  scanf("%f %f",&b,&h);
  float hypo1=pow(b,2)+pow(h,2);
  float hypo2=sqrt(hypo1);
  printf("%.2f",hypo2);
  return 0;
}