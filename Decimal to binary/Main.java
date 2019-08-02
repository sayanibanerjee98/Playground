#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
 int remainder=0;
  int arr[128];
  while(n!=0)
  {
    arr[remainder++]=n%2;
    n=n/2;
  }
  for(int i=remainder-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}