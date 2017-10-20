#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    int a , b, i, n, c, d;
    cin>>n;
    int lol[n];
    for(i=0; i<n; i++)
    {
        lol[i]=0;
        cin>>a>>b;
        c=(sqrt(a)-(int)sqrt(a)==0)?sqrt(a):(int)sqrt(a)+1;
        d=(sqrt(b)-(int)sqrt(b)==0)?sqrt(b):(int)sqrt(b);
        lol[i]=d-c+1;
    }

    for(i=0; i<n; i++)
    {
        cout<<lol[i]<<"\n";
    }
    return 0;
}
