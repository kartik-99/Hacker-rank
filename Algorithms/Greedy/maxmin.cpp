#include <bits/stdc++.h>
#include <iostream>
#include <stdio.h>
#include <vector>
using namespace std;

// Complete the maxMin function below.
int maxMin(int n, int k, vector<int> arr) {
    int temp_min, min = 999999999;
    sort(arr.begin(), arr.end());
    //cout<<"Sorted\n";
    //for(auto x: arr) cout<<x<<"\n";


    for(int i = 0; i<n-k+1; i++){
        temp_min = arr.at(i+k-1) - arr.at(i);
        //cout<<"temp_min="<<arr.at(i+k-1)<<" - "<<arr.at(i)<<"\n";
        min = (temp_min>min)?min:temp_min;
    }
    return min;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int k;
    cin >> k;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<int> arr(n);

    for (int i = 0; i < n; i++) {
        int arr_item;
        cin >> arr_item;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        arr[i] = arr_item;
    }

    int result = maxMin(n, k, arr);

    cout << result << "\n";

    fout.close();

    return 0;
}
