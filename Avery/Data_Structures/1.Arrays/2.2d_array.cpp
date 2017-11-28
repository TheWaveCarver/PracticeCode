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

//takes an hourglass shape from the top left and finds the sum of that hourglass - does not check for out-of-bounds!
int hourglass_window_sum(vector<vector<int> >& arr, int x, int y){
    int total = 0;
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            if(!(i == 1 && (j==0 || j==2) )){
                total += arr[i+x][j+y];
            }
        }
    }
    return total;
}
int main(){
    vector< vector<int> > arr(6,vector<int>(6));
    for(int arr_i = 0;arr_i < 6;arr_i++){
       for(int arr_j = 0;arr_j < 6;arr_j++){
          cin >> arr[arr_i][arr_j];
       }
    }
    
    int max_hourglass = -9*7;
    for (int i=0; i<arr.size()-2; i++){
        for (int j=0; j<arr[i].size()-2; j++){
            max_hourglass = max(max_hourglass, hourglass_window_sum(arr,i,j));
        }
    }
    cout << max_hourglass << endl;
    return 0;
}
