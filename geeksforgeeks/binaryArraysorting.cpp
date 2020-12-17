#include<iostream>
#include<vector>
using namespace std;
void binarysort(vector<int>&arr)
{
    int zeroes=0;
    for(int i=0;i<arr.size();i++)
    {
        if(arr[i]==0)
        {
          zeroes++;  
        }
    }
    
    for(int i=0;i<zeroes;i++)
    {
        arr[i]=0;
    }
    for(int j=zeroes;j<arr.size();j++)
    {
        arr[j]=1;
    }
}
int main()
 {
     int testcases;
     cin>>testcases;
    
     while(testcases--)
     {
         int size;
         cin>>size;
         vector<int>arr(size,0);
         for(int i=0;i<arr.size();i++)
         {
             cin>>arr[i];
         }
         
         binarysort(arr);
         
         for(int i=0;i<arr.size();i++)
         {
             cout<<arr[i]<<" ";
         }
         cout<<endl;
         
     }
	//code
	return 0;
}
