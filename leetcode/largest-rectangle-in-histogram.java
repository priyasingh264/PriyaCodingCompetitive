class Solution {
    public int largestRectangleArea(int[] arr)
    {
        //intialising area
        int maxarea=0;
        Stack<Integer>st=new Stack<>();
        
        st.push(-1);
        
        for(int i=0;i<arr.length;i++)
        {
            while(st.peek()!=-1 && arr[st.peek()]>arr[i])
            {
                int height=arr[st.pop()];
                int leftboundary=st.peek();
                int width=(i-leftboundary-1);
                
                
                int area=width*height;
                
                if(area>maxarea)
                {
                    maxarea=area;
                }
                 
                
            }
            st.push(i);
        }
            
            while(st.peek()!=-1)

            {
                int height=arr[st.pop()];
                 int leftboundary=st.peek();
                int width=(arr.length-leftboundary-1);
                
                int area=width*height;
                
                if(area>maxarea)
                {
                    maxarea=area;
                }
               
                
            }
        
        return maxarea;
    }
}
