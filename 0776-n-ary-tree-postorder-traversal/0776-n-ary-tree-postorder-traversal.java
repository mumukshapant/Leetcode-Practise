/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
            List<Integer> res= new ArrayList<>(); 

        if(root==null)
           { return new ArrayList<>();  }
        
            postorderlist(res, root);
        return res; 
    }

    private void postorderlist(List<Integer> res, Node root){

   if (root.children == null) {
            res.add(root.val);
            return;
        }

            for(Node child: root.children )
                postorderlist(res, child); 
    
        res.add(root.val); 
    }
}