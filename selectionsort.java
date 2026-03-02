public class selectionsort{
    public static void selectionsort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
        }
        for(int num : nums){
            System.out.println(num + " ");
        }
    }
    public static void main(String args[]){
        int[] nums = {1,5,3,2,5};
        selectionsort(nums);

    }
}