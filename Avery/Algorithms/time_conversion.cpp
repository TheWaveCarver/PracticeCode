#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

string timeConversion(string s) {
    // Complete this function
    
    int hour = (int(s[0])-48)*10 + int(s[1])-48;
    if (s.substr(8,2) == "PM") {
        if (hour != 12){           
            hour+=12;
        }
    } else {
        if (hour == 12){
            hour = 0;
        }
    }

    s[0] = char(hour/10 + 48);
    s[1] = char(hour%10 + 48);
    return s.substr(0,8);
}

int main() {
    string s;
    cin >> s;
    string result = timeConversion(s);
    cout << result << endl;
    return 0;
}
