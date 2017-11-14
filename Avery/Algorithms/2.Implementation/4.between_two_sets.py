#!/bin/python3

import sys

def getTotalX(a, b):
    # Complete this function
    max_a = max(a)
    min_b = min(b)
    
    count = 0
    for i in range(1,min_b+1):
        flag = True
        for element_a in a:
            if(i%element_a != 0):
                flag = False
                continue
        for element_b in b:
            if(element_b%i != 0):
                flag = False
                continue
        if (flag == True):
            count+=1
    return count
        
if __name__ == "__main__":
    n, m = input().strip().split(' ')
    n, m = [int(n), int(m)]
    a = list(map(int, input().strip().split(' ')))
    b = list(map(int, input().strip().split(' ')))
    total = getTotalX(a, b)
    print(total)
