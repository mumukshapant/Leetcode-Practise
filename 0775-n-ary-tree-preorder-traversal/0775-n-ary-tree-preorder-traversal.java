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
    public List<Integer> preorder(Node root) {
        List<Integer> res= new ArrayList<>(); 
        if(root!=null)
            preorderaddtolist(res, root); 

            
      

        return res;
        
    }

    private void preorderaddtolist(List<Integer> res, Node root){
        res.add(root.val); 

        for(Node child: root.children ){
            if(child!=null)
                preorderaddtolist(res,child);
        }
        }
}