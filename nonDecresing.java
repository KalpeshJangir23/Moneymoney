public class nonDecresing {
    public boolean checkPossibility(int[] nums) {
        boolean b1 = true;
        boolean b2 = true;
        boolean found = false;
        int index = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {

            int temp = nums[index - 1];
            nums[index - 1] = nums[index];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    b1 = false;
                }
            }
            nums[index - 1] = temp;
            nums[index] = temp;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    b2 = false;
                }
            }
        } else {
            return true;
        }

        if (b2 || b1) {
            return true;
        }
        return false;
    }
}
