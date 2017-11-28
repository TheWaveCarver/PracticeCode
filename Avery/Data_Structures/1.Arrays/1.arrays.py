#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

s = ''
for i in range(len(arr)):
    s += '{} '.format(arr[len(arr)-i-1])
    
print(s)