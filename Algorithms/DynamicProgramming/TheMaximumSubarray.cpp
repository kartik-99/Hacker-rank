#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int T, n, i, minN;
    int in[100000];
    bool foundP = false;

    int subArr;
    int subSeq;
    cin>>T;

    while(T){
        subArr = 0;
        subSeq = 0;
        minN = -1000;
        foundP = false;
        
        cin>>n;
        for(i=0; i<n; i++){
            cin>>in[i];
            if(in[i]>=0){
                foundP = true;
                subSeq+= in[i];
            }
            if(!foundP)
                minN = (minN>in[i])?minN:in[i];
        }

        if(foundP){
            subArr = in[0];
            for(i=1; i<n; i++){
                if(in[i]+in[i-1]>0)
                    in[i]=in[i]+in[i-1];
                else in[i] = 0;
                subArr = (subArr>in[i])?subArr:in[i];
            }
        }else{
            subSeq = minN;
            subArr = subSeq;
        }
        cout<<subArr<<" "<<subSeq<<"\n";
        T--;
    }
    return 0;
}