public class MissingNumber {

    public static int missingNumber(int nums[]) {

        for (int i = 0; i <= nums.length; i++) {

            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,4,0};
        int missingElement= missingNumber(nums);
        System.out.println(missingElement);

    }
}
