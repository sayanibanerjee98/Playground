#include<stdio.h>
int main()
{
  	int n;
  int n1,n2,index1=-1,index2=-1;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d %d",&n1,&n2);
  for(int j=0;j<n;j++)
  {
    if(arr[j]==n1 && index1==-1)
    {
      index1=j;
    }
    if(arr[j]==n2 && index2==-1)
    {
      index2=j;
    }
  
    }
      printf("Element 1 index = %d\nElement 2 index = %d\n",index1,index2);
      
    
  
  
}