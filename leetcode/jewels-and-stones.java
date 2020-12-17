class Solution {
    
    public int numJewelsInStones(String J, String S) 
    {
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        
       
        
        for(int  i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
               
       
        }
        
        for(int i=0;i<J.length();i++)
        {
            char ch=J.charAt(i);
            //char ch=J.charAt(j);
           if(map.containsKey(ch)&& map.get(ch)>0)
            {
                
                count+=map.get(ch);
            }
        }
               return count;
        
    }
}
