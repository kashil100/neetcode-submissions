class TreeNode{
    private String val = "";
    private TreeNode left = null;
    private TreeNode right = null;
    TreeNode(){}
    TreeNode(String str){
        this.val = str;
    }

}





class PrefixTree {
    TreeNode root;
    int count;
    public PrefixTree() {
        root = null;
        count = 1;
    }

    public void insert(String word) {
        if(count == 1){
            count--;
            root = new TreeNode(word);
            return;
        }
        TreeNode parent = root;
        TreeNode temp = root;
        char ch = 'c';
        while(true){
            if(temp == null){
                TreeNode sec = new TreeNode(word);
                if(ch == 'L'){
                    parent.left = sec;
                }else{
                    parent.right = sec;
                }

                return;
            }

            parent = temp;
            if(temp.val.length() > word.length()){
                temp = temp.left;
                ch = 'L';
            }else{
                temp = temp.right;
                ch = 'R';
            }
        }


    }

    public boolean search(String word) {
        TreeNode temp = root;
        while(temp!=null){
            if(temp.val.equals(word)){
                return true;
            }

            if(temp.val.length() > word.length()){
                temp = temp.left;
            }else{
                temp = temp.right;
            }

        }

        return false;

    }

    public boolean startsWith(String word) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp = null;
        while(!queue.isEmpty() && root!=null){
            temp = queue.poll();
            if(temp.val.equals(word)){
                return true;
            }

            if(temp.val.length() > word.length()){
                String s = temp.val.substring(0,word.length());
                if(s.equals(word)){
                    return true;
                }
            }

            if(temp.left!=null){
                queue.offer(temp.left);
            }

            if(temp.right!=null){
                queue.offer(temp.right);
            }

        }

        return false;
    }
}
