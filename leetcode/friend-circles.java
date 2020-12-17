class Solution
{
    
    int par[];
        //initialsation
       
   
    public int findCircleNum(int[][] arr)   
    {     
        int n=arr.length;
        par=new int[n];
         for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1 && i!=j && i<j)
                {
                    int p1=find(i);
                    int p2=find(j);
                    
                    if(p1!=p2)
                    {
                        par[p1]=p2; //no size check(Path compression) 
                        
                    }
                    
                }
            }
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(par[i]==i)
            {
                count++; //return the global parent;
            }
        }
        return count;
        
    }
    
     int find(int i)
    {
        if(par[i]==i)
        {
            return i;
        }
        int result=find(par[i]);
        par[i]=result;
        return result;
    }
    
}
