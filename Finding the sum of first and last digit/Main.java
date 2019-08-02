#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int temp=n;
  int ld=n%10;
  while(n>=10)
  {
    n=n/10;
  }
 int fd=n;
  int sum=ld+fd;
  printf("%d",sum);
	return 0;
}