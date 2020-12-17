/*Take an input N, the size of array.
Take N more inputs and store that in an array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.It reads a Number M.

Write a recursive function which returns true if M is contained in the array
and false otherwise

print returned value.


Example(To be used only for expected output):
Input:
4
2 8 6 4
5
Output:
false
Input Format

Integer representing N
Integer representing N numbers.
Constraints

1<= N <= 10 ^ 9
1<= A[i] <=10 ^ 9
1<= M <= 10 ^ 9
Output Format

print Output

Sample Input 0

4
2 8 6 4
5
Sample Output 0

false*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void input(vector<int>&arr)
{
    for(int i=0;i<arr.size();i++)
    {
        cin>>arr[i];
    }
}

bool search(vector<int>&arr,int data,int virtualIndex)
{
    if(virtualIndex==arr.size())
    {
        return false;
    }
    bool result=search(arr,data,virtualIndex+1);
    if(result==true)
    {
        return result;
    }
    else
    {
        if(data==arr[virtualIndex])
        {
            result=true;
            return result;
        }
        return false;
    }
    
}
int main() 
{
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int x;
    cin>>x;
    cout<<boolalpha<<search(arr,x,0);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
