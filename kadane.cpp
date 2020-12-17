//leetcode kadane 
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum
 int maxSubArray(vector<int>& nums)
    {
        int currentsum=nums[0]; 
        
        int overallsum=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            if(currentsum<0)
            {
                currentsum=nums[i];
            }
            else
            {
                currentsum+=nums[i];
                
            }
            
            if(currentsum>overallsum)
            {
                overallsum=currentsum;
            }
        }
        return overallsum;
        
        
    }
