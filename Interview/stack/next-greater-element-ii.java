/*Given a circular array (the next element of the last element is the first element of the array), 
print the Next Greater Number for every element. 
The Next Greater Number of a number x is the first greater number to its traversing-order next in the array,
which means you could search circularly to find its next greater number. 
If it doesn't exist, output -1 for this number.
Example 1:
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number; 
The second 1's next greater number needs to search circularly, which is also 2.
Note: The length of given array won't exceed 10000.*/

class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
         int ans[]=new int [nums.length];
        int counter=0;
        if(nums.length==0)
        {
            return ans;
        }
       
        Stack<Integer>s=new Stack<Integer>();
        s.push(0);
        for(int i=1;i<2*nums.length;i++)
        {
            int z=i%nums.length;
           // Stack<Integer>s=new Stack<Integer>();
            while(!s.empty() && nums[s.peek()]<nums[z])
            {
                int index=s.pop();
               ans[index]=nums[z];
            }
            
            if(i<nums.length &&counter<nums.length-1) //counter is used for preventing of pushing the elements again
            {
                counter++;
                s.push(z);
            }
        }
        
        while(!s.empty())
        {
            int  index=s.pop();
            ans[index]=-1;
        }
           return ans; 
   
    }
}
