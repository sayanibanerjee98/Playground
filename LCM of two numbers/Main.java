#include<stdio.h>
int main()
{
  int a,b,lcm,gcd;
  scanf("%d %d",&a,&b);
  int size=a>b?b:a;
  for(int i=size;i>=1;i--)
  {
    if((a%i==0) && (b%i==0))
    {
     gcd=i;
      break;
    }
  }
   lcm=(a*b)/gcd;
  printf("%d",lcm);
  return 0;
}