#include<iostream>
using namespace std;

int lSearch(int arr[], int l,int r, int x) 
{ 
    if (r < l) 
        return -1; 
    if (arr[l] == x) 
        return l; 
    if (arr[r] == x) 
        return r; 
    return lSearch(arr, l + 1,r - 1, x); 
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
	int l=0,r=n-1;
	
	int result=lSearch(arr,l,r,input);
	if(result!=-1)
	{
	
	cout<<"the element is found at location "<<result;
	}
	else
	{
		cout<<"element not found";
	}

}
