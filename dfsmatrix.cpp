#include<iostream>
using namespace std;

 void print(int **Edges,int no_of_vetices,int startingVertex,bool* visited)
 { 
     cout<<startingVertex; 
     cout<<endl;
     visited[startingVertex]=true;
     
     for(int i=0;i<no_of_vetices;i++)
     {
         if(i==startingVertex)
         {
             continue;
         }
         if(Edges[startingVertex][i]==1)
         {
             if(visited[i])
             {
                 continue; //print only i when i has not visited so far
             }
             print(Edges,no_of_vetices,i,visited);  //changing the starting ve using recursive call
         }
     }
     
 }



int main()
{
    int no_of_vetices;
    cin>>no_of_vetices;
    int edges;
    cin>>edges;
    
    
    int  ** Edges=new int *[no_of_vetices]; //dynamically creation of a 2 d matrix
    
    for(int i=0;i<no_of_vetices;i++)
    {
        Edges[i]=new int[no_of_vetices];
        for(int j=0;j<no_of_vetices;j++)
        {
            Edges[i][j]=0;  //clearing of the garbage value;
        }
    }
    
    
    for(int i=0;i<edges;i++)
    {
        int firstVertex;
        int secondVertex;
        
        cin>>firstVertex>>secondVertex;
        
        Edges[firstVertex][secondVertex]=1;
        Edges[secondVertex][firstVertex]=1;
        
    }
    
    bool* visited=new bool[no_of_vetices];
    for(int i=0;i<no_of_vetices;i++)
    {
        visited[i]=false;
    }
    
    
    //for printing the matrix
    
    print(Edges,no_of_vetices,0,visited);
    
}
