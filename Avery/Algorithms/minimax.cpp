#include <bits/stdc++.h>

using namespace std;

void minimax_sum(vector<int>& inp){
    long sum = 0;
    for(int i = 0; i < inp.size(); i++) {
        sum += inp[i];
    }
    long min = sum;
    long max = 0;
    
    for (int i = 0; i < inp.size(); i++) {
        if (min > sum-inp[i]){
            min = sum-inp[i];
        }
        if (max < sum-inp[i]){
            max = sum-inp[i];
        }
    }
    cout << min << ' ' << max << endl;
}

int main() {
    vector<int> arr(5);
    for(int arr_i = 0; arr_i < 5; arr_i++){
       cin >> arr[arr_i];
    }
    minimax_sum(arr);
    return 0;
}
