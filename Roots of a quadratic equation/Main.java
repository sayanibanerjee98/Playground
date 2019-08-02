#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c;
  float root1,root2,real,img;
  scanf("%f%f%f",&a,&b,&c);
  float discriminant=((b*b)-(4*a*c));
  if(discriminant>0)
  {
    root1=(-b+sqrt(discriminant))/(2*a);
    root2=(-b-sqrt(discriminant))/(2*a);
    printf("root1 = %0.2f  root2 = %0.2f",root1,root2);
  }
  else if(discriminant==0)
  {
    root1=root2=((-b)/(2*a));
  printf("root1 = %0.2f  root2 = %0.2f",root1,root2);
  }
  else
  {
    real=(-b /(2*a));
    img=((sqrt(-discriminant))/(2*a));
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,img,real,img);
  }
    return 0;
}