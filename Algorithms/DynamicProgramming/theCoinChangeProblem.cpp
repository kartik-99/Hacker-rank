#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);

// Complete the getWays function below.
long get_Ways(long n, vector<long> coins) {
    int count[n+1];
    count[0] = 1;
    //sort(coins.begin(), coins.end());
    for(int i = 1; i<=n; i++) count[i] = 0;
    for(auto c:coins){
        for(int x = 0; x<=n; x++){        
            if(x-c>=0)
                count[x] += count[x-c];
        }
        cout<<"\ncount : ";
        for(int i = 0; i<=n; i++) cout<<count[i]<<"\t";
    }
    return count[n];
    
}


long getWays(long n, vector<long> coins){
    int size=coins.size();
    long sum[255]={1,0};
    for(int i=1;i<=n;i++) sum[i]=0;
    for(int i=0;i<size;i++){
        for(int j=coins[i];j<=n;j++){
            sum[j]+=sum[j-coins[i]];
        }
    }
    return sum[n];
}



int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string nm_temp;
    getline(cin, nm_temp);

    vector<string> nm = split_string(nm_temp);

    int n = stoi(nm[0]);

    int m = stoi(nm[1]);

    string c_temp_temp;
    getline(cin, c_temp_temp);

    vector<string> c_temp = split_string(c_temp_temp);

    vector<long> c(m);

    for (int i = 0; i < m; i++) {
        long c_item = stol(c_temp[i]);

        c[i] = c_item;
    }

    // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

    long ways = getWays(n, c);

    cout<<ways<<"\n";

    fout.close();

    return 0;
}

vector<string> split_string(string input_string) {
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    input_string.erase(new_end, input_string.end());

    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
