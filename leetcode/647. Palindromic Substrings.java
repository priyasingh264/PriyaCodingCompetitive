class Solution {
    public int countSubstrings(String str) 
    {
        int count=0;
        
        boolean dp[][]=new boolean [str.length()][str.length()];
        
        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=0,j=gap;j<str.length();j++,i++)
            {
                if(gap==0)
                {
                    dp[i][j]=true;
                   continue;
                }
                
                else if(str.charAt(i)==str.charAt(j))
                {
                    if(gap==1)
                    {
                        dp[i][j]=true;
                       
                    }
                    
                    else
                    {
                        dp[i][j]=dp[i+1][j-1];
                        
                        
                    }
                }
                
            
            }
            
        }
        
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(dp[i][j])
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}
