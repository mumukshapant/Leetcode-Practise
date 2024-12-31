// https://www.youtube.com/watch?v=aZNaLrVebKQ
// https://www.youtube.com/watch?v=PoBGyrIWisE

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map= new HashMap<>(); 
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i); 
        }

        TreeNode root= helper(preorder, 0,preorder.length-1, inorder, 0,inorder.length-1, map); 
        return root; 

        
    }
    private TreeNode helper(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, Map<Integer, Integer> map ){

        //exit conditions
        if(prestart>preend || instart>inend)
            return null; 

     
        // first element from preorder willbe the root cus Root LEFT RIGHT
        TreeNode root= new TreeNode(preorder[prestart]); 

        //In inorder list : now find this element in the hashmap. 
        // us index ke left mein all elements will be the left subtree , right mein ..

        int inroot= map.get(root.val); 

        int leftelements= inroot-instart;
/** 
    prestart+1 :: because preorder[prestart] is the ROOT
    the number of elements in the LEFT side of the tree will be 
 */


        root.left= helper(preorder, prestart+1, prestart+leftelements, 
        inorder, instart, inroot-1, map );

        root.right= helper(preorder, prestart+leftelements+1, preend ,
        inorder, inroot+1, inend, map);

        return root;
    }
}