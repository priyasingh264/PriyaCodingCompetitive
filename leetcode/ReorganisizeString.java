class Solution
{
    public class pair implements Comparable<pair>
    {
        char ch;
        int freq;
        
        
        pair(char ch,int freq)
        {
            this.ch=ch;
            this.freq=freq;
        }
        
        @Override
        public int compareTo(pair o)
        {
            return o.freq-this.freq;
            
        }
        
    }
    public String reorganizeString(String str)
    {
        int visited[]=new int[26];
        
        PriorityQueue<pair>pq=new PriorityQueue<>();
        
        for(int i=0;i<str.length();i++)
        {
            visited[str.charAt(i)-'a']++;
           
        }
        
        for(int i=0;i<26;i++)
        {
            if(visited[i]>0)
            {
                pq.add(new pair((char)(i+'a'),visited[i]));
            }
        }
        String ans="";
        
   
        pair rem=pq.poll();
        ans+=rem.ch;
        pair prev=new pair(rem.ch,rem.freq-1);
        
        while(pq.size()!=0)
        {
            rem=pq.poll();
            if(rem.freq>0)
            {
                ans+=rem.ch;
                
                pq.add(prev);
                prev=new pair(rem.ch,rem.freq-1);
           
            } 
              

        }
        
     
        if(ans.length()==str.length())
        {
            return ans;
        }
        else
        {
            return "";
        }
    
        
        
    }
}
