#include<stdio.h>
#include<string.h>
int main()
{
	char s[20];
  int i=0,j=0,m;
  scanf("%s",&s);
  int len=strlen(s);
  if(len>20)
  {
    printf("Invalid Input");
  }
  else
  {
  while(s[i]!=0)
  {
    while(s[i]-s[i+1]==0)
    {
      j++;
      i++;
    }
    m=j+1;
    printf("%c%d",s[i-j],m);
    i++;
    j=0;
  }
  }
}