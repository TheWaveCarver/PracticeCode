#!/bin/python3

import sys

def bonAppetit(n, k, b, ar):
    # Complete this function
    sum_ = 0
    for i in range(n):
        if (i != k):
            sum_+=ar[i]
    if(sum_/2 == b):
        return 'Bon Appetit'
    return str(int(b - sum_/2))

n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
ar = list(map(int, input().strip().split(' ')))
b = int(input().strip())
result = bonAppetit(n, k, b, ar)
print(result)
