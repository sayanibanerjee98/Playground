#include<stdio.h>
int main()
{
  int n;
  float r,p;
  scanf("%f%d%f",&p,&n,&r);
  double si;
  si=(p*r*n)/100;
  printf("%lf",si);
  return 0;
}