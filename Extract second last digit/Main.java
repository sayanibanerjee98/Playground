#include<stdio.h>
int main()
{
  //Type your code here
    int num;
  scanf("%d",&num);
  int sclast=num%100;
  int sclastw=sclast/10;
  printf("%d",sclastw);
  return 0;
}