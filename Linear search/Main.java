#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n],element;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&element);
  for(int j=0;j<n;j++)
  {
  if(arr[j]==element)
  {
    printf("%d", j+1);
    return 0;
  }
  }
       printf("%d isn't present in the array.",element);
 
  
    
  
  return 0;
}