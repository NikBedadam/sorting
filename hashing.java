import java.util.HashMap;
public class hashing{
    public static void main(String[] args){
        int[] arr = {1,2,2,2,3,1,2,3,3,3,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int curr = map.get(arr[i]);
                map.put(arr[i],curr+1);
            } else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}