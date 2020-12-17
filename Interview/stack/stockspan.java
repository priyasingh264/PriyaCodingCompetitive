
/*The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days. 
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, N is the size of the array. The second line of each test case contains N input C[i].

Output:
For each testcase, print the span values for all days.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 200
1 ≤ C[i] ≤ 800

Example:
Input:
2
7
100 80 60 70 60 75 85
6
10 4 5 90 120 80

Output:
1 1 1 2 1 4 6
1 1 2 4 5 1

 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int t;
	    t= sc.nextInt();
	    while(t-->0)
	    {
	        int n;
	        n=sc.nextInt();
	       int arr[] = new int[n];
	          
	         for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		   
	        check(arr);
	    }
	    
	    
	}
		public static void check(int[]arr)
	{
	   int  n=arr.length;
	    int ans[]=new int [n];
	    Stack<Integer> s=new Stack<Integer>();
	    int index=0;
	    
	    //push first
	    s.push(arr.length-1);
	    
	    for(int i=arr.length-2;i>=0;i--)
	    {
	        while(!s.empty() && arr[s.peek()]<arr[i])
	        {
	             index=s.pop();
	            ans[index]=index-i;
	            
	        }
	        
	        s.push(i);
	    }
	    
	   while(!s.empty())
	   {
	        index=s.pop();
	       ans[index]=index+1;
	   }
	   
	   for(int i=0;i<n;i++)
	   
	   {
	       System.out.print(ans[i]+" ");
	   }
	   System.out.println();
	    
	}
}
