#!/bin/python3

import sys

def getRecord(s):
    # Complete this function
    if (len(s) == 0):
        return [0,0]
    max_ = s[0]
    min_ = s[0]
    max_rec = 0
    min_rec = 0
    for i in range(1,len(s)):
        if (s[i] > max_):
            max_ = s[i]
            max_rec += 1
        if (s[i] < min_):
            min_ = s[i]
            min_rec += 1
    return [max_rec, min_rec]

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
result = getRecord(s)
print (" ".join(map(str, result)))
