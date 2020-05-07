public class 深度优先{
        int length = 1;
        int maxLength = 0;
        public int TreeDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            TreeLength(root);
            return maxLength;
        }
        public void TreeLength(TreeNode root) {
            System.out.print(root.val+" ");
            System.out.print("length:"+length);
            System.out.println("maxlen:"+maxLength);

            if(root.left == null && root.right == null){
                if(length >maxLength){
                    maxLength = length;
                }
                return;
            }
            if(root.left != null){
                length++;
                TreeDepth(root.left);
                length--;
            }
            if(root.right != null){
                length++;
                TreeDepth(root.right);
                length--;
            }
        }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static void main(String[] args) {
        深度优先 a = new 深度优先();
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(7);
        root.left = root2;
        root.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.left = root7;
        root3.right = root6;
        a.TreeDepth(root);


    }


}



