#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    string line;
    int i = 0;
    vector<vector<int> > commands;
    int sequence_count;
    
    // Holy shit, string parsing is a pain in C++
    while (getline(cin, line)){
        // get the value of N
        if(i == 0){
            string value = "";
            int line_it = 0;
            while(line[line_it] != ' ' && line_it < line.size()){
                value += line[line_it];
                line_it++;
            }
            sequence_count = stoi(value);
        }
        // Your input is my command
        if(i>0){
            vector<int> command(3);
            int line_it = 0;
            for (int j = 0; j<3; j++){
                string value = "";
                while(line[line_it] != ' ' && line_it < line.size()){
                    value += line[line_it];
                    line_it++;
                }
                line_it++;

                command[j] = stoi(value);
            }
            commands.push_back(command);
        }
        i++;
    }
    
    // Execute commands
    int lastAnswer = 0;
    int N          = sequence_count;
    int index;

    vector<vector<int> > seqList(sequence_count);
    vector<int>          curCommand;
        
    for (int i=0; i < commands.size(); i++){
        curCommand = commands[i];
        index = (curCommand[1]^lastAnswer) % N;
        if (curCommand[0] == 1){
            seqList[index].push_back(curCommand[2]);
        } else {
            lastAnswer = seqList[index][curCommand[2]%(seqList[index].size())];
            cout << lastAnswer << endl;
        }
    }
    
    return 0;
}
