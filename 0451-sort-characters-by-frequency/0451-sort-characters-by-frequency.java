class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //PQ 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));

        for(Map.Entry<Character, Integer> e:map.entrySet()){
            int[] arr= new int[]{e.getKey(), e.getValue()}; 
            pq.offer(arr); 
        }

        StringBuilder sb= new StringBuilder(); 
        while(!pq.isEmpty()){
            int[] arr= pq.poll(); 
            
            for(int i=0;i<arr[1];i++){
            
                sb.append((char) arr[0] ) ; 
            }



        }


    return sb.toString();


    }
}