class Solution {
    public int subtractProductAndSum(int n) 
    {
       
        int pro=1;
        int sum=0;
        while(n>0)
        {
            int z=n%10;
             pro*=z;
            sum+=z;
            n=n/10;
            
        }
        
        return pro-sum;
        
    }
}
