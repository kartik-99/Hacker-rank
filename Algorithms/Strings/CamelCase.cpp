#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <cstring>

using namespace std;


int main(){
    string s;
    cin >> s;
    int ans=1, l=s.length();
    char c;
    for(int i=0; i<l; i++){
        c=s[i];
        if(c>='A' && c<='Z')
            ans++;
    }
    cout<<ans;
    return 0;
}
