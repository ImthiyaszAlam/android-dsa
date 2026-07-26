import java.util.List;

public class MaximumConsecutive {

    public static int findMaxConsecutiveOne(int nums[]) {
        int max = 0;

        int num[] = { 1, 1, 0, 1, 1, 1 };

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int count = 0;
                int j = i;

                while (j < nums.length && nums[j] == 1) {
                    count++;
                    j++;
                }
                max = Math.max(max, count);
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOne(nums));
    }
}
