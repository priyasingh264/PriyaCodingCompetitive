public class HelloWorld{

     public static void main(String []args){
       
       int arr[]={5,9,8,2,1};
       int arr1[]={1,2,4,5,6};
       solve1(arr1);
       System.out.println();
       solve(arr);
       
     }
     public static void solve(int []arr)
     {
         for(int i=0;i<arr.length-1;i++) //number of itteration
         {
             for(int j=0;j<arr.length-i-1;j++) //ajacent swap
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
                 
             }
         }
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
     }
     
     //optimesed code 
     
     
     public static void solve1(int []arr)
     {
         for(int i=0;i<arr.length-1;i++) //number of itteration
         {
             boolean swapped=false;
             for(int j=0;j<arr.length-i-1;j++) //ajacent swap
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     swapped=true;
                 }
                 
                 
             }
             if(swapped==false)
             {
                 break;
             }
         }
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
     }
     
     
}
