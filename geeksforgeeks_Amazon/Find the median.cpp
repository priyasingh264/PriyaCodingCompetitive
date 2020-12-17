//Find the median
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int median(vector<int>&arr)
{
    int n=arr.size();
    if(n%2!=0)
    {
        return (arr[n/2]);
    }
    else
    {
        return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }
}

    

int main()
 {
     int t;
     cin>>t;
     while(t--)
     {
     int n;
     cin>>n;
     vector<int>arr(n,0);
     for(int i=0;i<arr.size();i++)
     {
         cin>>arr[i];
     }
     sort(arr.begin(),arr.end());
     cout<<median(arr)<<endl;
     }
     
	//code
	return 0;
}
