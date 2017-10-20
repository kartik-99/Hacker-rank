#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;
int main() {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  int t;
  cin>>t;
  while(t--){
    int n,a,b,gt,lw;
    cin>>n>>a>>b;
    if(a>b){
      gt =a ;
      lw = b;
    }else{
      lw = a;
      gt = b;
    }
    int ans = lw*(n-1);
    n--;
    int dif = gt-lw;
    cout<<ans<<" ";
    if(dif>0){
      while(n--){
        ans += dif;
        cout<<ans<<" ";
      }
    }
    cout<<endl;
  }
  return 0;
}  
