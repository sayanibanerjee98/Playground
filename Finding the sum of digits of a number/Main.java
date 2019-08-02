#include <stdio.h>
int main() {
	int n;
  int sum=0;
  scanf("%d",&n);
  int temp=n;
  while(temp!=0)
  {
    int last=temp%10;
    sum=sum+last;
    temp=temp/10;
  }
  printf("%d",sum);
	return 0;
}