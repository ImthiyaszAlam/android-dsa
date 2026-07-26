import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int nums[]) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;

    }

    public static void main(String[] args) {

        int nums[] = new int[] { 1, 2, 3, 4, 5, };

        System.out.println(containsDuplicate1(nums));
    }
}