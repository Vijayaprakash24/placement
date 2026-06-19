import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Sample {

    static TreeNode build(Map<Integer, TreeNode> map, int val) {
        if (!map.containsKey(val))
            map.put(val, new TreeNode(val));
        return map.get(val);
    }

    static TreeNode lca(TreeNode root, int p, int q) {
        if (root == null)
            return null;

        if (root.val == p || root.val == q)
            return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, TreeNode> map = new HashMap<>();
        TreeNode root = null;

        for (int i = 0; i < n; i++) {
            int parent = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            TreeNode curr = build(map, parent);

            if (i == 0)
                root = curr;

            if (left != -1) {
                curr.left = build(map, left);
            }

            if (right != -1) {
                curr.right = build(map, right);
            }
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        TreeNode ans = lca(root, p, q);
        System.out.println(ans.val);
    }
}