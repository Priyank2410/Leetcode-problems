class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int resultsum = nums[0]+nums[1]+nums[2];
        int minDifference = Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length-2 ; i++){
            int left = i+1;
            int right = nums.length-1;

             while(left < right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==target){
                return target;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }    

            int diffToTarget = Math.abs(sum-target);
            if (diffToTarget < minDifference){
                resultsum = sum;
                minDifference = diffToTarget;
                
                
            }
        }
        }
       
        return resultsum;
        
    }
}