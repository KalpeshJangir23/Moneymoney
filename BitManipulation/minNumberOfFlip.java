    package BitManipulation;

    public class minNumberOfFlip {
        public int minOperations(int[] nums, int k) {
            int flip = 0;
            while (true) {
                int val = k>>1;
                int one=0;
                int zero = 0;
                for (int i = 0; i < nums.length; i++) {
                    int ans = nums[i]>>1;
                    nums[i] = nums[i]>>=1;
                    if (ans == 1) {
                        one++;
                    }else{
                        zero++;
                    }
                }


                if (one != 0 && zero != 0 && val != 1)  {
                    flip++;
                }
            }
        }
        
    }
