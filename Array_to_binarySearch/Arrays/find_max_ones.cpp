

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class find_max_ones
{
public:
    int findMaxConsecutiveOnes(vector<int> &nums)
    {
        vector<int> vs;
        int count = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] == 1)
            {
                count++;
            }
            else
            {
                vs.push_back(count);
                count = 0;
            }
        }

        // Handle the case of consecutive ones at the end
        vs.push_back(count);

        sort(vs.begin(), vs.end());
        return vs[vs.size() - 1];
    }
};
int main()
{
    find_max_ones solution;
    vector<int> my_vector = {1, 1, 0, 1, 1, 1};
    cout << solution.findMaxConsecutiveOnes(my_vector) << endl;
}
