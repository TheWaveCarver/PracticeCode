#!/bin/python3

import sys

def migratoryBirds(n, ar):
    # Complete this function
    count = []
    for i in range(5):
        count += [0]
    for i in range(n):
        count[ar[i]-1] += 1

    max_ = 0
    index = 0
    for i in range(5):
        if (count[i] > max_):
            index = i
            max_ = count[i]
    return index+1

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = migratoryBirds(n, ar)
print(result)
