#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[128];
  int remainder=0;
  while(n!=0)
  {
    a[remainder++]=n%8;
    n=n/8;
  }
  for(int i=remainder-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}