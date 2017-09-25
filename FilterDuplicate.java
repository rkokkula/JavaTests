//Filter the duplicate elements from an array

import java.util.HashSet;

public class FilterDuplicate {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<Integer>();
        int[] arr = {1,2,2,3,3,4,5,5,6,8,3};
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hs.add(arr[i]);
                }
            }
        }
        System.out.println(hs);
    }
}
