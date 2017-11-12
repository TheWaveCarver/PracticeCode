#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void right_pyramid_ascii_art(int n){
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if (j<n-i-1) {
                cout << ' ';
            } else {
                cout << '#';
            }
        }
        cout << endl;
    }
}
int main(){
    int n;
    cin >> n;
    right_pyramid_ascii_art(n);
    return 0;
}
