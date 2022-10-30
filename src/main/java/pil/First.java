package pil;

public class First {
    public static int[] twoSum(int[] arr, int target){
        int[] result = new int[]{0,0};
        if (arr.length >= 2){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length ; j++) {
                    if (i !=j && arr[i] + arr[j] == target){
                        result[i] = i;
                        result[j] = j;
                    }
                }
            }
        }
        return result;
    }
}
