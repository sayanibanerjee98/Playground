#include<stdio.h>
int main()
{
	long int n;
  scanf("%ld",&n);
  long int fact=1;
  int i;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
  return 0;
}