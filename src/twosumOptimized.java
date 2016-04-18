import java.util.HashMap;

/**
 * Created by schandramouli on 4/17/16.
 */
public class twosumOptimized {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int[] soln = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tempSum = target - nums[i];
            System.out.println(i + " " + tempSum);
            if (hashMap.containsKey(tempSum)) {
                soln[0] = hashMap.get(tempSum);
                soln[1] = i;
            } else {
                hashMap.put(tempSum, i);
            }
        }
        System.out.println(hashMap);
        return soln;
    }
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] soln = twoSum(nums, target);
        System.out.println(soln[0]);
        System.out.println(soln[1]);
    }
}
