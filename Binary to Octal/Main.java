#include<stdio.h>
#include<math.h>
int main()
{
  long long int n;
  scanf("%lld",&n);
  int a[200];
  int remainder,decimal=0;
  int i=0;
  while(n!=0)
  {
    remainder=n%10;
    n=n/10;
    decimal+=remainder*pow(2,i);
    ++i;
  }
  remainder=0;
  while(decimal!=0)
  {
    a[remainder++]=decimal%8;
    decimal=decimal/8;
  }
  for(int i=remainder-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
    
}