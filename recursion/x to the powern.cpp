#include <iostream>
using namespace std;

int power(int x,int n)
{
    if(n==0)
    {
        return 1;
    }
    int ans=x*power(x,n-1);
    return ans;
}

int main()
{
    int n;
    cin>>n;
    int x;
    cin>>x;
    
    int result=power(x,n);
    cout<<result;
	return 0;
}
