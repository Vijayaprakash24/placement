class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class T6 {

    static TreeNode build(TreeNode root,Integer val){
       

        if(root==null) return new TreeNode(val);
        if(root.val>val){
            root.left=build(root.left, val);
        }else{
            root.right=build(root.right, val);
        }
        return root;
    }
static int value=Integer.MIN_VALUE;
static int count=0;
    static void disp(TreeNode root,int k){
        if(root==null) return ;
        disp(root.left,k);
        System.out.print(root.val+"->");
        
        if(count<k){value=Math.max(root.val, value);
            count++;}
            else{value=value;}
        disp(root.right,k);
        
       
    }

    public static void main(String[] args) {
        TreeNode root=null;
        Integer[] arr={10,5,3,7,6,8,2,15,12,11,18,17,19};
        // Integer[] arr={30, 20, 40, 10, 25, 35, 50};
        for(Integer val:arr){
            root=build(root,val);
        }
        disp(root,6);
        System.out.println(value);

    }
}
