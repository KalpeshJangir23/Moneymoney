#include <iostream>
#include <vector>
using namespace std;

class moves_zero_to_the_last {
public:
    void moveZeroes(vector<int>& nums) {
        int i = 0;
        int count = 0;
        while (i < nums.size()) {
            if (nums.at(i) == 0) {
                count++;
                
            } else {
                nums.at(i - count) = nums.at(i);
            }
            i++;
        }


        for (int j = nums.size() - count; j < nums.size(); j++) {
            nums[j] = 0;
        }

        for (const auto& element : nums) {
            std::cout << element << " ";
        }
    }
};

int main() {
    std::vector<int> nums = {0, 1, 0, 3, 12};
    moves_zero_to_the_last solution;
    solution.moveZeroes(nums);

    return 0;
}
