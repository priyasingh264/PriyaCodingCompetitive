/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    
		int t;
		t=sc.nextInt();
		 while(t-->0)
		 {
		     int a;
		     a=sc.nextInt();
		     
		     int b;
		     b=sc.nextInt();
		     
		     check(a,b);
		     
		 }
	}
	
	public static void  check(int a,int b)
	{
	    String ans="";
	      
	      //String ans=(String)a/b;
	      int k=a/b;
	      ans=ans+Integer.toString(k);
	      int rem=a%b;
	      
	      if(rem!=0)
	      {
	          ans=ans+".";
	      }
	      
	      
	       
	    HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	  
	    String recur="";
	     int count=0;
	     String x="";
	    
	    while(rem!=0 && !map.containsKey(rem))
	    {
	        map.put(rem,count);
	        a=rem*10;
	       // String x=(String)a/b;
	       int z=a/b;
	         x=Integer.toString(z);
	         rem=a%b;
	         recur=recur+x;
	         count++;
	      
	    }
	    
	    if(map.containsKey(rem))
	    {
	       
	       System.out.println(ans+recur.substring(0,map.get(rem))+"("+recur.substring(map.get(rem))+")");
	        
	    }
	    else
	    {
	        System.out.println(ans+recur);
	    }
	
	    
	}
		
	
}
