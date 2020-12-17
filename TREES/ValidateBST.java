/*Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
Both the left and right subtrees must also be binary search trees.
Example :

Input : 
   1
  /  \
 2    3

Output : 0 or False


Input : 
  2
 / \
1   3

Output : 1 or True 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem*/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution 
{
    class Dpair
    {
        boolean isbst;
        int min;
        int max;
    }
    public Dpair isValid(TreeNode root)
    {
      
        if(root==null)
        {
            Dpair bp=new Dpair();
            bp.isbst=true;
            bp.min=Integer.MAX_VALUE;
            bp.max=Integer.MIN_VALUE;
            return bp;
        }
            
            Dpair lb=isValid(root.left);
        Dpair rb=isValid(root.right);
        
        //creatign own pair
        Dpair my=new Dpair();
        my.isbst=lb.isbst && rb.isbst && root.val>lb.max && root.val<rb.min;
        my.min=Math.min(root.val,Math.min(lb.min,rb.min));
        my.max=Math.max(root.val,Math.max(lb.max,rb.max));
        
        return my;
    }
    public int isValidBST(TreeNode A) 
    {
        Dpair pb=isValid(A);
        if( pb.isbst==true){
            return 1;
            
        }
        else
        {
            return 0;
        }
        
        
    }
}


