#include<stdio.h>
int isVowel(char c)
{
  if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
  {
    return 0;
  }
  else 
  {
    return 1;
  }
}
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  for(int i=0;str[i]!='\0';i++)
  {
  if(isVowel(str[i]))
     {
       printf("%c",str[i]);
     }
     }
  return 0;
}