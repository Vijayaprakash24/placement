import java.util.*;

class TreeNode{
    int val;
    TreeNode right,left;
    TreeNode(int val){
        this.val=val;
        
    }
}


public class T5 {

    static TreeNode build(Integer[] arr){
        if(arr.length==0||arr[0]==null) return null;
        TreeNode root=new TreeNode(arr[0]);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty()&&i<arr.length){
            TreeNode curr=q.poll();
            if(i<arr.length&&arr[i]!=null){
                curr.left=new TreeNode(arr[i]);
                q.offer(curr.left);
            }
            i++;
            if(i<arr.length&&arr[i]!=null){
                curr.right=new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;

    }

    static int maxDepth(TreeNode root){
        if(root==null) return 0;

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        
        // root.left=new TreeNode(20);
        // root.right=new TreeNode(30);
        // root.right.left=new TreeNode(40);
        // root.right.right=new TreeNode(50);
        
        Integer[] arr={3,9,20,null,null,15,7};
        TreeNode root=build(arr);
        int val=maxDepth(root);
        System.out.println(val);
    }
    
}
