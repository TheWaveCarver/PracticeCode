#!/bin/python3

import sys

def solve(n, s, d, m):
    # Complete this function
    # greedy solution
    back_it = 0
    sum_ = 0
    num_times_achieved = 0
    for front_it in range(0,m):
        sum_ += s[front_it]
    if(sum_ == d):
        num_times_achieved += 1
        
    for front_it in range(m,n):
        sum_     += s[front_it]
        sum_     -= s[back_it]
        back_it += 1
        
        if(sum_ == d):
            num_times_achieved += 1
    return num_times_achieved
        
n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
d, m = input().strip().split(' ')
d, m = [int(d), int(m)]
result = solve(n, s, d, m)
print(result)
