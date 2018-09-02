#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    long long T, n, i, temp;
    cin>>T;
    long long b[100000], sum[100000], ans[100000];
    while(T){
        cin>>n;
        for(i=0; i<n; i++)
            cin>>b[n-i-1];
        sum[0] = b[0];
        for(i=1; i<n; i++) 
            sum[i] = sum[i-1] + b[i];
        ans[0] = sum[0];
        ans[1] = sum[1];
        ans[2] = sum[2];
        for(i=3; i<n; i++){
            long long temp = min(ans[i-1], min(ans[i-2], ans[i-3]));
            ans[i] = sum[i] - temp;
        }
        cout<<ans[n-1]<<"\n";
        T--;
    }
    return 0;
}