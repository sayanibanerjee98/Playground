#include<stdio.h>
#include<string.h>
int main()
{
  char s[100];
  scanf("%[^\n]s",&s);
  int count = 0,i;
  int len=strlen(s);
  for(int j=0;j<len;j++)
  {
 
    if(s[j]==' ')
    {
      count++;
    }
  }
  count++;
  printf("%d",count);
  
}