public class insertionsort {
    public static int[] insertionsort(int[] nums){
        int n = nums.length;
        for(int i=1;i<n;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
    public static void main(String args[]){
        int[] nums = {1,5,2,3,5,6,7};
        int[] sol = insertionsort(nums);
        System.out.print(sol);
    }
}
