class Solution {
    public String reverseVowels(String s) 
    {
        
        if(s.length()==0)
        {
            return "";
        }
        
        if(s.length()==1)
        {
            return s;
        }
        char []arr=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            
        
           if(isVowel(arr[start]) && isVowel(arr[end]))
              
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                
            }
            else if(!isVowel(arr[start]))
            {
                start++;
            }
            
            else  if(!isVowel(arr[end]))
            {
                end--;
                
            }
        }
        return new String(arr);
    
    
        
    }
    
    
    boolean isVowel(char c)
    {
        if(c=='a' || c=='e' |c=='i' || c=='o' || c=='u'  || c=='A' || c=='E' || c=='O' || c=='U'  || c=='I')
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
}
