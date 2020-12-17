/*Given an array A of N integers. The task is to find a peak element in it.
An array element is peak if it is not smaller than its neighbours. For corner elements, we need to consider only one neighbour.

Note: There may be multiple peak element possible, in that case you may return any valid index.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N. Then in the next line are N space separated values of the array.

Output Format:
For each test case output will be 1 if the index returned by the function is an index with peak element.

User Task:
You don't have to take any input. Just complete the provided function peakElement() and return the valid index.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= A[] <= 1000

Example:
Input:
2
3
1 2 3
2
3 4
Output:
1
1

Explanation:
Testcase 1: In the given array, 3 is the peak element.
Testcase 2: 4 is the peak element.
 */

/*This is a function problem.You only need to complete the function given below*/
/* The function should return the index of any
   peak element present in the array */
// arr: input array
// n: size of array
int binarySearch(int arr[],int n,int low,int high)
{
    int mid=low+(high-low)/2;
    
     
     //checkfor neighbourexist
     //if mid==0 this means therer is no left node
     
     //ifmid==n-1 there is no right node
     if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&  
        (mid == n - 1 || arr[mid + 1] <= arr[mid])) 
        {
        return mid;  
        }
    
    else if(arr[mid]<arr[mid-1])
    {
        return binarySearch(arr,n,low,(mid-1));
    }
    
    else
    {
        return binarySearch(arr,n,(mid+1),high);
        
    }
    
    
}

int peakElement(int arr[], int n)
{
   
return binarySearch(arr, n,0, n-1);
}
