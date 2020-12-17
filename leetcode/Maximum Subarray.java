class Solution {
    public int maxSubArray(int[] arr) 
    {
        int currentsum=arr[0];
        int overallsum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(currentsum<0)
            {
                currentsum=arr[i];
                
            }
            
            else
            {
                currentsum+=arr[i];
            }
            
            if(overallsum<currentsum)
            {
                overallsum=currentsum;
            }
        }
        return overallsum;
        
        
    }
}
