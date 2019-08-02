#include<stdio.h>
int main()
{
  long long n;
  scanf("%lld",&n);
  int decimal=0,i=0;
  int remainder;
  while(n!=0)
  {
    remainder=n%10;
    n=n/10;
    decimal+=remainder*pow(2,i);
    ++i;
  }
  printf("%d",decimal);
  return 0;
}