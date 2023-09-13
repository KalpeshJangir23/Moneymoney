#include <iostream>
#include <vector>
using namespace std;

int largestElement(vector<int> &arr, int n)
{
    int largestElement = arr[0];
    for (int i = 1; i < arr.size(); i++)
    {
        if (arr[i] > largestElement)
        {
            largestElement = arr[i];
        }
    }
    return largestElement;
}
// ! Second Largest Element and Second smallest Element
vector<int> getSecondOrderElements(int n, vector<int> a)
{
    // Write your code here.
    int largest = a[0];
    int smallest = a[0];
    int slrgest = -1;
    int sSmallest = INT_MAX;

    //* For the Second Largest
    for (int i = 1; i < a.size(); i++)
    {
        if (a[i] > largest)
        {
            slrgest = largest;
            largest = a[i];
        }
        else if (a[i] > slrgest && a[i] < largest)
        {
            slrgest = a[i];
        }
    }

    //* For Second Smallest
    for (int i = 1; i < a.size(); i++)
    {
        if (smallest > a[i])
        {
            sSmallest = smallest;
            smallest = a[i];
        }
        else if (a[i] != smallest && a[i] < sSmallest)
        {
            sSmallest = a[i];
        }
    }

    vector<int> value;
    value.push_back(slrgest);
    value.push_back(sSmallest);
    return value;
}

int main()
{
    vector<int> a = {1, 2, 3, 4, 5};
    vector<int> result = getSecondOrderElements(a.size(), a);
    cout<< largestElement(a,a.size()) << endl;
     cout << "Second Largest: " << result[0] << endl;
     cout << "Second Smallest: " << result[1] << endl;

    return 0;
}