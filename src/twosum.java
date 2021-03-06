/**
 * Created by schandramouli on 4/17/16.
 */
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int[] soln = new int[2];
        for (int i = 0; i < right; i++) {
            for (int j = i + 1; j < right; j++) {
                int tempSum = nums[i] + nums[j];
                if (tempSum == target) {
                    soln[0] = i;
                    soln[1] = j;
                }
            }
        }
        return soln;
    }
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);
    }
}
