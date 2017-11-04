#include <bits/stdc++.h>

using namespace std;

vector < int > solve(int a0, int a1, int a2, int b0, int b1, int b2){
    vector<int> inputs = {a0,a1,a2,b0,b1,b2};
    vector<int> scores = {0,0};
    
    for (int i = 0; i < inputs.size()/2; i++){
        int a = inputs[i];
        int b = inputs[i+3];
        if (a > b){
            scores[0] ++;
        } else if (a < b) {
            scores[1] ++;
        }
    }
    
  
    return scores;

}

int main() {
    int a0;
    int a1;
    int a2;
    cin >> a0 >> a1 >> a2;
    int b0;
    int b1;
    int b2;
    cin >> b0 >> b1 >> b2;
    vector < int > result = solve(a0, a1, a2, b0, b1, b2);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? " " : "");
    }
    cout << endl;
    

    return 0;
}
