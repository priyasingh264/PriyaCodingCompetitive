#include<iostream>
using namespace std;

bool is_sorted(int arr[],int size)  //base case
{

        if(size==0 || size==1)
        {

            return true;
        }


        if(arr[0]>arr[1])
        {

            return false;
        }

        bool isSmallerSorted=is_sorted(arr+1,size-1);

        return isSmallerSorted;
       /* if(isSmallerSorted)
        {

            return true;
        }
        else
        {
        return false;

        }*/
}


int main()
{
    int arr[]={1,2,3,4,5};
    int size=sizeof(arr)/sizeof(arr[0]);
     bool answer=is_sorted(arr,size);
     if(answer==1)
     {
         cout<<"array is sorted";
     }
     else
     {
         cout<<"array is not sorted";
     }
     return 0;
}
