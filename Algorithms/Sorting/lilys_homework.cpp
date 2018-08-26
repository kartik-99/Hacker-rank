#include<bits/stdc++.h>
using namespace std;

int minSwaps(int arr[], int n)
{
    pair<int, int> arrPos[n];
    for (int i = 0; i < n; i++)
    {
        arrPos[i].first = arr[i];
        arrPos[i].second = i;
    }

    //assending check
    sort(arrPos, arrPos + n);

    vector<bool> vis(n, false);

    int ans_a = 0;
    for (int i = 0; i < n; i++)
    {
        if (vis[i] || arrPos[i].second == i)
            continue;
        int cycle_size = 0;
        int j = i;
        while (!vis[j])
        {
            vis[j] = 1;
            j = arrPos[j].second;
            cycle_size++;
        }
        ans_a += (cycle_size - 1);
    }

    //descending check
    reverse(arrPos, arrPos+n);

    vector<bool> visd(n, false);

    int ans_d = 0;
    for (int i = 0; i < n; i++)
    {
        if (visd[i] || arrPos[i].second == i)
            continue;
        int cycle_size = 0;
        int j = i;
        while (!visd[j])
        {
            visd[j] = 1;
            j = arrPos[j].second;
            cycle_size++;
        }
        ans_d += (cycle_size - 1);
    }
    return min(ans_a, ans_d);
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0; i<n; i++) cin>>arr[i];
    cout <<minSwaps(arr, n);
    return 0;
}