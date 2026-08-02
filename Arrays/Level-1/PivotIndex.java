public class PivotIndex {

    public static int pivotElement(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                right += nums[j];
            }

            if (left == right) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 3, 2, 4 };
        int pivotElement = pivotElement(nums);
        System.out.println("pivotElement is : " + pivotElement);
    }
}
