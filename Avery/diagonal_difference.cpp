#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


void abs_diff_diag(vector<vector<int> >& matrix){
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < matrix.size(); i++) {
        sum1 += matrix[i][i];
        sum2 += matrix[i][matrix.size()-i-1];
    }
    int diff_diag = sum1-sum2;
    if(sum1-sum2 < 0){
        diff_diag = diff_diag*-1;
    }
    cout << diff_diag;
}
int main(){
    int n;
    cin >> n;
    vector< vector<int> > a(n,vector<int>(n));
    for(int a_i = 0;a_i < n;a_i++){
       for(int a_j = 0;a_j < n;a_j++){
          cin >> a[a_i][a_j];
       }
    }
    abs_diff_diag(a);
    return 0;
}
