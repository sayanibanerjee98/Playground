#include<stdio.h>

int main()
{
  char ch[100];
  int i;
  scanf("%[^\n]s",ch);
  for( i=0;ch[i]!='\0';++i);
  printf("%d",i);
  
  return 0;
}