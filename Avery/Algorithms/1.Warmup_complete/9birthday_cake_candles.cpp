#include <bits/stdc++.h>

using namespace std;

int birthdayCakeCandles(int n, vector <int> ar) {
    // Complete this function
    int max_ = 0;
    int count = 0;
    for(int i = 0; i<n; i++) {
        if(ar[i] > max_) {
            count = 1;
            max_ = ar[i];
        } else if (ar[i] == max_){
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = birthdayCakeCandles(n, ar);
    cout << result << endl;
    return 0;
}
