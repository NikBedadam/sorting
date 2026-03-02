public class bubblesort {
    public static void bubblesort(int[] nums){
        int n = nums.length;
        for(int i = n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j] > nums[j+1] ){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int num:nums){
            System.out.println(num);
        }
    }
    public static void main(String args[]){
            int[] nums = {1,5,3,6,7,2,3,4};
            bubblesort(nums);

        }
}
