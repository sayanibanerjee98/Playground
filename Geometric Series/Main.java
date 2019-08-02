#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,t,term1,term2;
  scanf("%d",&n);
  if(n%2==1)
  {
     a=1;r=2;
    term2=n/2;
    t= a  * pow(r,term2);
    printf("%d",t);
 
  }
  else 
  {
     a=1;r=3;
    term1=(n-1)/2;
    t=a*pow(r,term1);
    printf("%d",t);
  }
  
  return 0;
}