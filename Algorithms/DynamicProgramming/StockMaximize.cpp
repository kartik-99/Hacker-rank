#include<iostream>
using namespace std;
unsigned long int n, T;
unsigned long int s[50000];

unsigned long int getMaxIndex(unsigned long int ci){
    unsigned long int i;
    unsigned long int ans = ci;
    unsigned long int c = 0;
    for(i=ci; i<n; i++){
        if(s[i]>c){
            ans=i;
            c = s[i];
        }
    }
    return ans;
}

unsigned long int maxProfit(){
    unsigned long int i;
    unsigned long int p=0;
    unsigned long int maxI, currI=0;
    unsigned long int spend;
    unsigned long int counter=0;
    while(currI<n){
        // cout<<"Counter :"<<counter<<"\n";
        maxI = getMaxIndex(currI);
        // cout<<"maxI :"<<maxI<<"\n";
        if(maxI == currI){
            currI++;
            // cout<<"Skipping\n";
            continue;
        }
        spend = 0;
        for(i=currI; i<maxI; i++)
            spend+=s[i];
        // cout<<"Spent :"<<spend<<"\n";
        p += (maxI-currI)*s[maxI] - spend;
        // cout<<"profit spent :"<<counter<<"\n";
        // cout<<"p :"<<p<<"\n";
        currI=maxI+1;
        //cout<<"CurrI :"<<currI<<"\n";
    }
    return p;
}

int main(){
    unsigned long int i;
    cin>>T;
    while(T){    
        cin>>n;
        for(i=0; i<n; i++) cin>>s[i];
        cout<<maxProfit()<<"\n";
        T--;
    }
    return 0;
}