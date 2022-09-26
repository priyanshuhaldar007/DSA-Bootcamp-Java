class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        int j=0,k=n;
        for(int i=0;i<2*n-1;i++){
            res[i]=nums[j];
            i++;
            res[i]=nums[k];
            j++;
            k++;
        }
        return res;
    }
}