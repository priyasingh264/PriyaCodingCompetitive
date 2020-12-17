class Solution {
    public boolean isHappy(int n) 
    {
        
        
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        
        
        while(true)
        {
            int sum=0;
            while(n>0)
            {
                int x=n%10;
                n=n/10;
                sum=sum+x*x;
                
            }
            
            if(sum==1)
            {
                return true;
            }
            
            if(sum==4)
            {
                return false;
                
            }
            
            
            n=sum;
        }
        
    }
}
