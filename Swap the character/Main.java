#include<stdio.h>
#include<string.h>
int main()
{
  char s1[100],s2[100],s3[100];
  scanf("%s%s%s",&s1,&s2,&s3);
  int l1=strlen(s1);
  int l2=strlen(s2);
  int l3=strlen(s3);
  for(int i=0;i<l1;i++)
  {
    if(s1[i]=='a'||s1[i]=='A'||s1[i]=='e'||s1[i]=='E'||s1[i]=='i'||s1[i]=='I'||
       s1[i]=='o'||s1[i]=='O'||s1[i]=='u'||s1[i]=='U')
    {
      s1[i]='$';
    }
  }
   for(int i=0;i<l2;i++)
   {
      if(s2[i]!='a'&& s2[i]!='A'&& s2[i]!='e'&& s2[i]!='E'&&s2[i]!='i'&&s2[i]!='I'&&
         s2[i]!='o'&&s2[i]!='O'&&s2[i]!='u'&&s2[i]!='U')
      {
        s2[i]='#';
      }
   }
   for(int i=0;i<l3;i++)
   {
     if(s3[i]>='a'&& s3[i]<='z')
     {
       s3[i]=s3[i]-32;
     }
   }
  printf("%s%s%s",s1,s2,s3);
}