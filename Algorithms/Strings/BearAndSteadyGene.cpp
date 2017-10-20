#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int n,ans,kiri,kanan,i;
int a[1007];
char s[1000007];

bool valid() {
    int A,G,T,C;
    A = a['A'];
    G = a['G'];
    T = a['T'];
    C = a['C'];
    if (A <= n/4 && G <= n/4 && T <= n/4 && C <= n/4) return true;
    return false;
}

int main() {
    scanf("%d",&n);
    scanf("%s",&s);
    for (i=0 ; i<n ; i++) {
        a[s[i]]++;
    }

    if (valid()) {
        printf("0\n");
        return 0;
    }

    ans = 999999999;
    kiri = 0;
    for (kanan=0 ; kanan<n ; kanan++) {
        a[s[kanan]]--;
        while(valid() && kiri <= kanan) {
            ans = min(ans,kanan-kiri+1);
            a[s[kiri]]++;
            kiri++;
        }
    }

    printf("%d\n",ans);
    return 0;
}
