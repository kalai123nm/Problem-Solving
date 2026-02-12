package dailyproblems.day03feb1226;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[]={1,2,2,4,4,6};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;
        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
