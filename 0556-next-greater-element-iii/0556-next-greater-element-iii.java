class Solution {
    public int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

        // Convert n to array -- got it 
        for (int i = 0; i < s.length(); i++)
            arr[i] = Character.getNumericValue(s.charAt(i));

        // Start from the right side --got it 
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1])
                break;
        }

        if (i == 0) // means it is not possible -- got it 
            return -1;

        int x = arr[i - 1]; 
        int  min = i;

        // now find the smallest digit on right side of i-1 to n , greater than x 
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > x && arr[j] < arr[min]) {
                min = j;
            }
        }

        swap(arr, i - 1, min); // -- got it 

        // Sort the digits after (i-1) in ascending order
        Arrays.sort(arr, i, arr.length);

        // Convert array back to number
        long val = 0;
        for (int num : arr) {
            val = val * 10 + num;
        }

        // Check if the result fits in an int
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}