import java.util.*;

public class mergesort {
    public static void merge(int[] arr,int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid +1;
        while(left <= mid && right<= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else{
                temp.add(arr[right++]);
            }
        }
        while(left <= mid) temp.add(arr[left++]);
        while(right <= high) temp.add(arr[right++]);
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public void mergeSort(int[] arr)
}
