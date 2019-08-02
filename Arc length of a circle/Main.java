#include<stdio.h>
int main()
{
  float r,angle;
  scanf("%f %f",&r,&angle);
  float arc=2*3.14*r*(angle/360);
  printf("%.2f",arc);
  return 0;
}