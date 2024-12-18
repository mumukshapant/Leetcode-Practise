class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

        //ref : https://www.youtube.com/watch?v=evA9Z5p16bI

// we need MINIMUM deletion to create non overlapping intervals . 
// ex : 1------------9 
//          3-----6
//                  7----10  

// in the above case if we delete 1--9 we have only 1 deletion 
// OR we can delete 3--6 , then 7--10 to make 1--9 as non overlapping interval but this is 2 deletions. 

// we have 2 different cases 
// CASE 1 : 
// [1, 5]  [ 3, 8 ]

// CASE 2 : [2,3] is a part of[ 1,5]
// [ 1, 5]  [2, 3]


        int n= arr.length; 
        int count=0;
        int prev=0; 

        // sort using ;ambda expression 
       Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]) );

        for(int curr=1;curr<n;curr++){
                if(arr[curr][0]<arr[prev][1] )    // overlapping
                { 
                    count++; 
                    if(arr[curr][1]<arr[prev][1])
                        prev=curr; 
                }

                else { prev= curr; }

            
        }

        return count;
    }
}