/*Given an array A of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. If no such element exists, output -1 

Input:
The first line of input contains a single integer T denoting the number of test cases.Then T test cases follow. Each test case consists of two lines. The first line contains an integer N denoting the size of the array. The Second line of each test case contains N space separated positive integers denoting the values/elements in the array A.

Output:
For each test case, print in a new line, the next greater element for each array element separated by space in order.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1018
Example:
Input
2
4
1 3 2 4
4
4 3 2 1
Output
3 4 4 -1
-1 -1 -1 -1

Explanation:
Testcase1: In the array, the next larger element to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? since it doesn't exist hence -1.*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException
	{
	   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t;
	    t= Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        int n;
	        n=Integer.parseInt(br.readLine());
	        long arr[] = new long[n];
	          String s[] = br.readLine().split(" ");
	         for(int i=0;i<n;i++)
		    {
		        arr[i] = Long.parseLong(s[i]);
		    }
		   
	        check(arr);
	    }
	    
	    
		//code
	}
	
	public static void check(long[]arr)
	{
	   int  n=arr.length;
	    long ans[]=new long [n];
	    Stack<Integer> s=new Stack<Integer>();
	    int index=0;
	    
	    //push first
	    s.push(0);
	    
	    for(int i=1;i<n;i++)
	    {
	        while(!s.empty() && arr[s.peek()]<=arr[i])
	        {
	             index=s.pop();
	            ans[index]=arr[i];
	            
	        }
	        
	        s.push(i);
	    }
	    
	   while(!s.empty())
	   {
	        index=s.pop();
	       ans[index]=-1;
	   }
	   
	   for(int i=0;i<n;i++)
	   
	   {
	       System.out.print(ans[i]+" ");
	   }
	   System.out.println();
	    
	}
}

