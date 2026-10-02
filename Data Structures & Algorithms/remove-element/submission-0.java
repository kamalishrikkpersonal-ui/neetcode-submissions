class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,start=0,f=0;Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                if(c==0){start=i;f=1;}c++;
            }if(nums[i]!=val && f==1)break;
        }
        for(int i=start;i<nums.length-c;i++){
            nums[i]=nums[i+c];
        }return nums.length-c;
    }
}