#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void fractional_signs(vector<int> a) {
    int counts[] = {0,0,0};
    
    for(int i = 0; i < a.size(); i++) {
        if (a[i] > 0) {
            counts[0]++;
        } else if (a[i] == 0) {
            counts[2]++;
        } else {
            counts[1]++;
        }
    }
    for(int i = 0; i < 3; i++) {
        cout << counts[i]/float(a.size()) << endl;
    }
}

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    fractional_signs(arr);
    return 0;
}
