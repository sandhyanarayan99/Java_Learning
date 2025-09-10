public class ArrayMax {
    public static void main(String[] args) {
        int[] nums = {12, 45, 67, 23, 90, 11};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}