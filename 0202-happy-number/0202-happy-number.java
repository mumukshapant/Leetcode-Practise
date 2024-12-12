class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            
            if (set.contains(n)) {
                return false;
            }

            set.add(n);
            int sum = 0;

            while (n != 0) {
                int x = n % 10;
                sum += x * x;
                n = n / 10;
            }
            
            n = sum;
        }

        return true;
    }
}