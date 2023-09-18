#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class singleNumbers
{
public:
    int singleNumber(vector<int> &nums)
    {
        unordered_map<int, int> frequencyMap;
        for (int num : nums)
        {
            frequencyMap[num]++;
        }

        for (const auto &pair : frequencyMap)
        {
            if (pair.second == 1)
            {
                return pair.first;
            }
        }
        return -1;
    }
};
int main()
{
    vector<int> my_vector = {1, 1, 0, 1, 1, 1};
    singleNumbers solution;
    cout << solution.singleNumber(my_vector) << endl;
}
