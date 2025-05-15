class Solution {
    public int reverse(int x) {

        int result = 0;

        while(x!=0){
            int temp = x % 10;
                   x = x / 10;

                   if(result > 0 && result > Integer.MAX_VALUE/10){
                    return 0;
                   }

                   if(result < 0 && result < Integer.MIN_VALUE/10){
                    return 0;
                   }

                   result = result * 10 + temp;
        }
        return result;
        
    }
}