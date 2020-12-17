
import java.util.*;

public class grapConstruction
 
{
    
    public static void main(String args[])

    {
        construct();
        

    }
    static ArrayList<ArrayList<Integer>>graph=new ArrayList<>();

    public static void construct(){
        int n=8;
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(4, 6);
        addEdge(5,6);

        addEdge(7,3);
        addEdge(2,5);
        addEdge(0,6);
        display();
    }

    public static void addEdge(int u,int v)
    {
        if(u<0 ||u>=graph.size() ||v<0 || v>=graph.size())
        {
            return ;
        }
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void display()
    {
        for(int i=0;i<graph.size();i++)
        {
            System.out.print(i+"-> ");
            for(int j=0;j<graph.get(i).size();j++)
            {
                System.out.print(graph.get(i).get(j)+" ");
            }
        System.out.println();

        }

    }
}
