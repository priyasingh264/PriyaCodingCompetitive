#include<iostream>
using namespace std;

void print(int lb,int ub)
{
    if(lb>ub)
    {
        return;
    }
    cout<<lb<<" ";
    print(lb+1,ub);
}

int main()
 {
	int t; cin>>t;
	while(t--){
	    int n; cin>>n;
	    print(1,n);
	    cout<<endl;
	}
	return 0;
}
