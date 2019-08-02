#include <stdio.h>
#include<ctype.h>
int main() {
	char ch;
  scanf("%c",&ch);
  if(ch>=65 && ch<97)
  {
    printf("%c",tolower(ch));
  }
  else if( ch>=97 && ch<123)
  {
    printf("%c",toupper(ch));
  }
	return 0;
}