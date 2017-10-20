#include <cmath>
#include <cstdio>
#include <vector>
#include <cstring>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    char s[1000000];
    cin>>n;
    while(n--)
        {
        cin>>s;
        int len;
        len=strlen(s);
        if(next_permutation(s,s+len))
            cout<<s<<endl;
        else
            cout<<"no answer"<<endl;
    }
    return 0;
}
