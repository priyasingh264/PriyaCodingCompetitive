#include<iostream>
#include<vector>
using namespace std;
int flag=0;

int lSearch(int arr[],int n,int x)
{
	
	 for(int i=0;i<n;i++)
    {
    	if(arr[i]==x)
    	{
		
    	flag=1;
    	break;
    	}
    	
	}
	return flag;
}
int main()
{
	int input,n;
	
	cout<<"enter the element you want to search\n";
	cin>>input;
	cout<<"enter the size of the array\n";
	cin>>n;
	int arr[n];
    for(int i=0;i<n;i++)
    {
    	cin>>arr[i];
	}
	
	int result=lSearch(arr,n,input);
	(result==0)?cout<<"element not found":cout<<"element found";
    return 0;
    
    
	
}
