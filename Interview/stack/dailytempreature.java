class Solution {
    public int[] dailyTemperatures(int[] arr)
    {
        Stack<Integer>s=new Stack<Integer>();
        s.push(0);
        int ans[]=new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
        
            while(!s.empty() &&  arr[s.peek()]<arr[i])
            {
                int index=s.pop();
                ans[index]=i-index;

            }
            s.push(i);
        }
        
        while(!s.empty())
        {
            int index=s.pop();
            ans[index]=0;
        }
        
    
    return ans;
}
}
