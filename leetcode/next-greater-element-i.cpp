class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums)
    {
        HashMap<Integer,Integer>nextgreatest=new HashMap();
        
        Stack<Integer>st=new Stack();
        
        for(int i=0;i<nums.length;i++)
        {
            if(st.size()==0)
            {
                st.push(nums[i]);
                continue;
            }
          //  st.push(nums[i]);
        
            while(!st.empty()  && st.peek()<nums[i])
            {
                nextgreatest.put(st.pop(),nums[i]);
            }
            st.push(nums[i]);
        }
        
        
     for(int i=0;i<nums1.length;i++)
     {
         nums1[i]=nextgreatest.getOrDefault(nums1[i],-1);
         
     }
        return nums1;
        
    }
}
