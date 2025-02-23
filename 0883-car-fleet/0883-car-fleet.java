class Solution {
    public int carFleet(int t, int[] pos, int[] sp) {
        int n= pos.length; 
        if(n == 1) 
        return 1;

        int[][] curr= new int[n][2];
        for(int i=0;i<curr.length; i++){
            curr[i][0]= pos[i]; 
            curr[i][1]= sp[i]; 
        }

        Arrays.sort(curr, (a,b) -> Integer.compare(b[0],a[0]) ); //desc order b,a

        Stack<Double> st= new Stack<>();


        for(int i=0;i<curr.length; i++){
            double time = (double) (t-curr[i][0])    /     curr[i][1] ;
            // this is the only correct way, rest all are not correct. 
            // (t-curr[i][0])  is converted to double, ie , say 6.0 
            // then 6.0 is divided by curr[i][1]



            if(st.isEmpty())
                st.push(time); 
            
            else if (time > st.peek() )
                st.push(time);
            

        } 
        return st.size(); 


        
    }
}