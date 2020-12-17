/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.*/
#include<iostream>
#include<vector>
using namespace std;

void swap(int *px,int *py)
{
    int temp=*px;
    *px=*py;
    *py=temp;
}
void input(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cin>>arr[i];
    }
}

void sort(vector<int>&arr)
{
    int n=arr.size();
    int low=0;
    int mid=0;
    int high=n-1;
    
    while(mid<=high)
    {
        switch(arr[mid])
        {
            case 0:
            {
                swap(&arr[mid],&arr[low]);
                low++;
                mid++;
                break;
            }
            
            case 1:
            {
                mid++;
                break;
            }
            
            case 2:
            {
                swap(&arr[high],&arr[mid]);
                high--;
                break;
                
            }
            
            
            
            
        }
    }
    
}

void display(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
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
         input(arr);
         sort(arr);
         display(arr);
     }

	return 0;
}
