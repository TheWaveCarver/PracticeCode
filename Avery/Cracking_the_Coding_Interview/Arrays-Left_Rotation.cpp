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

using namespace std;

vector<int> array_left_rotation(vector<int> a, int n, int k) {
    int it = k%n;
    vector<int> b;
    for(int i = 0; i < n; i++){

        if (it == n){
            it = 0;
        }
        b.push_back(a[it]);

        it++;
    }
    return b;
}


int main(){
    // int n;
    // int k;
    // cin >> n >> k;
    // vector<int> a(n);
    // for(int a_i = 0;a_i < n;a_i++){
    //     cin >> a[a_i];
    // }

    int n = 5;
    int k = 4;
    vector<int> a;
    for(int i = 0; i < n;i++) {
        a.push_back(i);
    }
    vector<int> output = array_left_rotation(a, n, k);
    for(int i = 0; i < n;i++) {
        cout << output[i] << " ";
    }
    cout << endl;
    return 0;
}
