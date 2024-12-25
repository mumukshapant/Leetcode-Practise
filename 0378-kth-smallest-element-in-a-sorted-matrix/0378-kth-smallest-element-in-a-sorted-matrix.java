class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(); 

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                pq.add(mat[i][j]);
            }
        }
        while(k!=1 && !pq.isEmpty())
        {  pq.poll(); 
          k--;
        }

        return pq.poll(); 
    }
}